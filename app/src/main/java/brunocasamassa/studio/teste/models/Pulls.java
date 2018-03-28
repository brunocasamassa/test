package brunocasamassa.studio.teste.models;

/**
 * Created by bruno on 19/03/2018.
 */

import com.google.gson.annotations.Expose;

import java.util.List;

import brunocasamassa.studio.teste.models.pull_models.PullRequest;

public class Pulls {

    @Expose
    private List<PullRequest> pulls = null;

    public List<PullRequest> getPulls() {
        return pulls;
    }

    public void setPulls(List<PullRequest> pulls) {
        this.pulls= pulls;
    }

    public Pulls withPulls(List<PullRequest> pulls) {
        this.pulls = pulls;
        return this;
    }

}