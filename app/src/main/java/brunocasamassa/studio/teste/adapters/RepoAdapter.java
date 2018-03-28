package brunocasamassa.studio.teste.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import brunocasamassa.studio.teste.activities.PullRequestsActivity;
import brunocasamassa.studio.activities.R;
import brunocasamassa.studio.teste.holders.RepoHolder;
import brunocasamassa.studio.teste.models.Repo;
import brunocasamassa.studio.teste.models.User;

/**
 * Created by bruno on 16/03/2018.
 */

public class RepoAdapter extends RecyclerView.Adapter<RepoHolder> {

    private ArrayList<Repo> repoList;
    private ArrayList<User> userList;
    private Context context;

    public RepoAdapter(ArrayList<Repo> repoList, Context context, ArrayList<User> userList) {
        this.repoList = repoList;
        this.context = context;
        this.userList = userList;

    }

    @Override
    public RepoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RepoHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.model_repo, parent, false));
    }

    @Override
    public void onBindViewHolder(RepoHolder holder, final int position) {
        try {
            holder.textRepoName.setText(repoList.get(position).getName());

            holder.textRepoDescription.setText(repoList.get(position).getDescription());
            holder.textForkCount.setText(String.valueOf(repoList.get(position).getForks()));
            holder.textStarCount.setText(String.valueOf(repoList.get(position).getScore()));

            Picasso.with(context).load(userList.get(position).getAvatarUrl()).into(holder.userImage);
            holder.textUserName.setText(userList.get(position).getLogin().toString());
            holder.textRealName.setText(userList.get(position).getName().toString());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, PullRequestsActivity.class);
                    intent.putExtra("titleRepo", repoList.get(position).getName());
                    intent.putExtra("userRepo", userList.get(position).getLogin());
                    ((Activity) context).startActivity(intent);

                }
            });

        } catch (NullPointerException n) {
            n.printStackTrace();
        }


    }


    @Override
    public int getItemCount() {
        return userList.size();
    }
}
