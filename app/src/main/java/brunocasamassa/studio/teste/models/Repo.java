package brunocasamassa.studio.teste.models;

/**
 * Created by bruno on 16/03/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("homepage")
    @Expose
    private Object homepage;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("watchers")
    @Expose
    private int watchers;
    @SerializedName("followers")
    @Expose
    private int followers;
    @SerializedName("forks")
    @Expose
    private int forks;
    @SerializedName("size")
    @Expose
    private int size;
    @SerializedName("open_issues")
    @Expose
    private int openIssues;
    @SerializedName("score")
    @Expose
    private double score;
    @SerializedName("has_downloads")
    @Expose
    private boolean hasDownloads;
    @SerializedName("has_issues")
    @Expose
    private boolean hasIssues;
    @SerializedName("has_projects")
    @Expose
    private boolean hasProjects;
    @SerializedName("has_wiki")
    @Expose
    private boolean hasWiki;
    @SerializedName("fork")
    @Expose
    private boolean fork;
    @SerializedName("private")
    @Expose
    private boolean _private;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("pushed")
    @Expose
    private String pushed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Repo withType(String type) {
        this.type = type;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Repo withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
            return name;


    }

    public void setName(String name) {
        this.name = name;
    }

    public Repo withName(String name) {
        this.name = name;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Repo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public Object getHomepage() {
        return homepage;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public Repo withHomepage(Object homepage) {
        this.homepage = homepage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Repo withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Repo withLanguage(String language) {
        this.language = language;
        return this;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public Repo withWatchers(int watchers) {
        this.watchers = watchers;
        return this;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public Repo withFollowers(int followers) {
        this.followers = followers;
        return this;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public Repo withForks(int forks) {
        this.forks = forks;
        return this;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Repo withSize(int size) {
        this.size = size;
        return this;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(int openIssues) {
        this.openIssues = openIssues;
    }

    public Repo withOpenIssues(int openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Repo withScore(double score) {
        this.score = score;
        return this;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Repo withHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Repo withHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    public boolean isHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Repo withHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Repo withHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public Repo withFork(boolean fork) {
        this.fork = fork;
        return this;
    }

    public boolean isPrivate() {
        return _private;
    }

    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public Repo withPrivate(boolean _private) {
        this._private = _private;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Repo withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Repo withCreated(String created) {
        this.created = created;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Repo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Repo withPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    public String getPushed() {
        return pushed;
    }

    public void setPushed(String pushed) {
        this.pushed = pushed;
    }

    public Repo withPushed(String pushed) {
        this.pushed = pushed;
        return this;
    }

}

