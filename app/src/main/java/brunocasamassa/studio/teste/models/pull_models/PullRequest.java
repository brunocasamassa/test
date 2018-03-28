
package brunocasamassa.studio.teste.models.pull_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PullRequest {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("diff_url")
    @Expose
    private String diffUrl;
    @SerializedName("patch_url")
    @Expose
    private String patchUrl;
    @SerializedName("issue_url")
    @Expose
    private String issueUrl;
    @SerializedName("number")
    @Expose
    private int number;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("locked")
    @Expose
    private boolean locked;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("closed_at")
    @Expose
    private Object closedAt;
    @SerializedName("merged_at")
    @Expose
    private Object mergedAt;
    @SerializedName("merge_commit_sha")
    @Expose
    private String mergeCommitSha;
    @SerializedName("assignee")
    @Expose
    private Object assignee;
    @SerializedName("assignees")
    @Expose
    private List<Object> assignees = null;
    @SerializedName("requested_reviewers")
    @Expose
    private List<Object> requestedReviewers = null;
    @SerializedName("requested_teams")
    @Expose
    private List<Object> requestedTeams = null;
    @SerializedName("labels")
    @Expose
    private List<Object> labels = null;
    @SerializedName("milestone")
    @Expose
    private Object milestone;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("review_comments_url")
    @Expose
    private String reviewCommentsUrl;
    @SerializedName("review_comment_url")
    @Expose
    private String reviewCommentUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("head")
    @Expose
    private Head head;
    @SerializedName("base")
    @Expose
    private Base base;
    @SerializedName("_links")
    @Expose
    private Links links;
    @SerializedName("author_association")
    @Expose
    private String authorAssociation;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PullRequest withUrl(String url) {
        this.url = url;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PullRequest withId(int id) {
        this.id = id;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PullRequest withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getDiffUrl() {
        return diffUrl;
    }

    public void setDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
    }

    public PullRequest withDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
        return this;
    }

    public String getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    public PullRequest withPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    public String getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    public PullRequest withIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PullRequest withNumber(int number) {
        this.number = number;
        return this;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PullRequest withState(String state) {
        this.state = state;
        return this;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public PullRequest withLocked(boolean locked) {
        this.locked = locked;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PullRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PullRequest withUser(User user) {
        this.user = user;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullRequest withBody(String body) {
        this.body = body;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public PullRequest withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PullRequest withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Object getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    public PullRequest withClosedAt(Object closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    public Object getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(Object mergedAt) {
        this.mergedAt = mergedAt;
    }

    public PullRequest withMergedAt(Object mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }

    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    public PullRequest withMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public PullRequest withAssignee(Object assignee) {
        this.assignee = assignee;
        return this;
    }

    public List<Object> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    public PullRequest withAssignees(List<Object> assignees) {
        this.assignees = assignees;
        return this;
    }

    public List<Object> getRequestedReviewers() {
        return requestedReviewers;
    }

    public void setRequestedReviewers(List<Object> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    public PullRequest withRequestedReviewers(List<Object> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
        return this;
    }

    public List<Object> getRequestedTeams() {
        return requestedTeams;
    }

    public void setRequestedTeams(List<Object> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    public PullRequest withRequestedTeams(List<Object> requestedTeams) {
        this.requestedTeams = requestedTeams;
        return this;
    }

    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public PullRequest withLabels(List<Object> labels) {
        this.labels = labels;
        return this;
    }

    public Object getMilestone() {
        return milestone;
    }

    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    public PullRequest withMilestone(Object milestone) {
        this.milestone = milestone;
        return this;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public PullRequest withCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    public PullRequest withReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
        return this;
    }

    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    public PullRequest withReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public PullRequest withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public PullRequest withStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public PullRequest withHead(Head head) {
        this.head = head;
        return this;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public PullRequest withBase(Base base) {
        this.base = base;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public PullRequest withLinks(Links links) {
        this.links = links;
        return this;
    }

    public String getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public PullRequest withAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

}
