package brunocasamassa.studio.teste.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import brunocasamassa.studio.activities.R;
import brunocasamassa.studio.teste.holders.PullHolder;
import brunocasamassa.studio.teste.models.User;
import brunocasamassa.studio.teste.models.pull_models.PullRequest;

/**
 * Created by bruno on 16/03/2018.
 */

public class PullAdapter extends RecyclerView.Adapter<PullHolder> {

    private ArrayList<PullRequest> pullList;
    private ArrayList<User> userList;
    private Context context;

    public PullAdapter(ArrayList<PullRequest> pullList, Context context, ArrayList<User> userList) {
        this.pullList = pullList;
        this.context = context;
        this.userList = userList;
    }

    @Override
    public PullHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PullHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.model_pull, parent, false));
    }

    @Override
    public void onBindViewHolder(PullHolder holder, final int position) {

        try {
            holder.textPullName.setText(pullList.get(position).getTitle());

            holder.textPullDescription.setText(pullList.get(position).getBody());
            holder.textUserNamePull.setText(String.valueOf(pullList.get(position).getUser().getLogin()));
            holder.textRealNamePull.setText(String.valueOf(userList.get(position).getName()));

            Picasso.with(context).load(pullList.get(position).getUser().getAvatarUrl()).into(holder.userImagePull);


            System.out.println("text holder "+ holder.textRealNamePull.getText().toString() );

        } catch (NullPointerException n) {
            System.out.println("text holder error "+ n.getMessage());
            n.printStackTrace();
        }


    }


    @Override
    public int getItemCount() {
        return userList.size();
    }
}
