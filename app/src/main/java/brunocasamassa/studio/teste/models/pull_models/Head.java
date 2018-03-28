
package brunocasamassa.studio.teste.models.pull_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Head {

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
    private User_ user;
    @SerializedName("repo")
    @Expose
    private Object repo;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Head withLabel(String label) {
        this.label = label;
        return this;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Head withRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Head withSha(String sha) {
        this.sha = sha;
        return this;
    }

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }

    public Head withUser(User_ user) {
        this.user = user;
        return this;
    }

    public Object getRepo() {
        return repo;
    }

    public void setRepo(Object repo) {
        this.repo = repo;
    }

    public Head withRepo(Object repo) {
        this.repo = repo;
        return this;
    }

}
