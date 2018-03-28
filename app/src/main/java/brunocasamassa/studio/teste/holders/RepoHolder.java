package brunocasamassa.studio.teste.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import brunocasamassa.studio.activities.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by bruno on 28/03/2018.
 *
 *
 */

public class RepoHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_repo_name)
    public TextView textRepoName;
    @BindView(R.id.text_repo_description)
    public TextView textRepoDescription;
    @BindView(R.id.text_fork_count)
    public TextView textForkCount;
    @BindView(R.id.text_star_count)
    public TextView textStarCount;
    @BindView(R.id.text_realname)
    public TextView textRealName;
    @BindView(R.id.text_username)
    public TextView textUserName;
    @BindView(R.id.user_image)
    public CircleImageView userImage;


    public RepoHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);


    }
}
