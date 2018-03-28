
package brunocasamassa.studio.teste.models.pull_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Base {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("ref")
    @Expose
    private String ref;
    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("user")
    @Expose
    private User__ user;
    @SerializedName("repo")
    @Expose
    private Repo repo;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Base withLabel(String label) {
        this.label = label;
        return this;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Base withRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Base withSha(String sha) {
        this.sha = sha;
        return this;
    }

    public User__ getUser() {
        return user;
    }

    public void setUser(User__ user) {
        this.user = user;
    }

    public Base withUser(User__ user) {
        this.user = user;
        return this;
    }

    public Repo getRepo() {
        return repo;
    }

    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public Base withRepo(Repo repo) {
        this.repo = repo;
        return this;
    }

}
