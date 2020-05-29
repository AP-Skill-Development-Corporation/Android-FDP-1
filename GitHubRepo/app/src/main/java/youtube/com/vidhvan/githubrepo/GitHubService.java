package youtube.com.vidhvan.githubrepo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GitHubService
{
    @GET("users/pavankumart46/repos")
    Call<String> getRepos();
}
