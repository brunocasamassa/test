package brunocasamassa.studio.teste.activities;

import java.util.List;

import brunocasamassa.studio.teste.models.Repositories;
import brunocasamassa.studio.teste.models.User;
import brunocasamassa.studio.teste.models.pull_models.PullRequest;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by bruno on 28/03/2018.
 */

public interface Network {
    @Headers("status:200")

    @GET("/legacy/repos/search/{language}?Java&client_id=8753851dc77f47fcb666&client_secret=bbd8a4bf9aef4768b957bbfe584bd6c68093a4f7")
    Call<Repositories> listRepos( @Path("language") String language);

    @GET("/users/{user}?client_id=8753851dc77f47fcb666&client_secret=bbd8a4bf9aef4768b957bbfe584bd6c68093a4f7")
    Call<User> userInfo(@Path("user") String user);

    @GET("/repos/{user}/{repo}/pulls?client_id=8753851dc77f47fcb666&client_secret=bbd8a4bf9aef4768b957bbfe584bd6c68093a4f7")
    Call<List<PullRequest>> listPullsRepo(@Path("user") String user, @Path("repo") String repo);
}
