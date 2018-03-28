package brunocasamassa.studio.teste.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import brunocasamassa.studio.activities.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by bruno on 16/03/2018.
 *
 *
 */

public class PullHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_pull_name)
    public TextView textPullName;
    @BindView(R.id.text_pull_description)
    public TextView textPullDescription;
    @BindView(R.id.text_realname_pull)
    public TextView textRealNamePull;
    @BindView(R.id.text_username_pull)
    public TextView textUserNamePull;
    @BindView(R.id.user_image_pull)
    public CircleImageView userImagePull;


    public PullHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
