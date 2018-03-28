package brunocasamassa.studio.teste.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import brunocasamassa.studio.activities.R;
import brunocasamassa.studio.teste.adapters.PullAdapter;
import brunocasamassa.studio.teste.models.User;
import brunocasamassa.studio.teste.models.pull_models.PullRequest;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bruno on 28/03/2018.
 *
 *
 */

public class PullRequestsActivity extends AppCompatActivity implements HttpRequestCode {

    @BindView(R.id.list_pulls)
    RecyclerView listPulls;

    @BindView(R.id.toolbar_pull)
    Toolbar toolbar;

    @BindView(R.id.pull_opened)
    TextView pullOpened;

    @BindView(R.id.pull_closed)
    TextView pullClosed;

    private String repoName;
    private String userName;

    private PullAdapter pullAdapter;
    private ArrayList<PullRequest> pullList;
    private ArrayList<User> userList;

    private final int[] statusCode = {0};

    private String BASE_URL;
    private Network service;
    public int httpResult2 = 230;

    private int httpResult = 0;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulls);
        ButterKnife.bind(this);

        Bundle extras = getIntent().getExtras();

        BASE_URL = getResources().getString(R.string.base_url);

        repoName = extras.getString("titleRepo");
        userName = extras.getString("userRepo");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(Network.class);

        setToolbar();

        getRequest();


    }

    public int getRequest() {

        requestPullList(this);
        return this.httpResult;

    }

    private void requestPullList(@Nullable final HttpRequestCode httpRequestCode)  {

        Call<List<PullRequest>> repos = service.listPullsRepo(userName.trim(), repoName.trim());

        repos.enqueue(new Callback<List<PullRequest>>() {
            @Override
            public void onResponse(Call<List<PullRequest>> call, Response<List<PullRequest>> response) {

                httpRequestCode.onReceiveRequestCode(response.code());
                if (response.isSuccessful()) {
                    List<PullRequest> pulls = response.body();
                    pullList = new ArrayList<>();
                    userList = new ArrayList<>();
                    int countOpened = 0;
                    int countClosed = 0;
                    for (PullRequest pull : pulls) {

                        //verify Pull Request status
                        if (pull.getState().equals("open")) {
                            countOpened++;
                        } else if (pull.getState().equals("close") || pull.getState().equals("closed")) {
                            countClosed++;
                        }

                        pullOpened.setText(String.valueOf(countOpened) + " opened / ");
                        pullClosed.setText(String.valueOf(countClosed) + " closed") ;

                        pullList.add(pull);

                          requestUserData(pullList, pull, userList);

                    }

                }


            }

            @Override
            public void onFailure(Call<List<PullRequest>> call, Throwable t) {

            }


        });
    }

    private void requestUserData(final ArrayList<PullRequest> pullList, PullRequest pull, final ArrayList<User> userList)  {

        Call<User> userCall = service.userInfo(pull.getUser().getLogin());
        userCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                PullRequestsActivity.this.userList.add(response.body());
                setRepoList(pullList, userList);

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                t.printStackTrace();

            }
        });

    }

    private void setRepoList(ArrayList<PullRequest> pullList, ArrayList<User> userList) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        pullAdapter = new PullAdapter(pullList, PullRequestsActivity.this, userList);

        pullAdapter.notifyItemInserted(pullAdapter.getItemCount());

        listPulls.setLayoutManager(layoutManager);
        listPulls.setAdapter(pullAdapter);


    }

    private void setToolbar() {

        toolbar.setTitle(repoName);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public void onReceiveRequestCode(int httpCode) {
        this.httpResult = httpCode;

    }




}
