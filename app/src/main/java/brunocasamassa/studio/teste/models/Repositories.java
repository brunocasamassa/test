package brunocasamassa.studio.teste.models;

/**
 * Created by bruno on 19/03/2018.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Repositories {

    @SerializedName("repositories")
    @Expose
    private List<Repo> repositories = null;

    public List<Repo> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repo> repositories) {
        this.repositories = repositories;
    }

    public Repositories withRepositories(List<Repo> repositories) {
        this.repositories = repositories;
        return this;
    }

}