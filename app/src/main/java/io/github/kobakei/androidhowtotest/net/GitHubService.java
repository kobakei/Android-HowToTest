package io.github.kobakei.androidhowtotest.net;

import java.util.List;

import io.github.kobakei.androidhowtotest.entity.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * GitHub API.
 * Created by keisuke on 16/03/03.
 */
public interface GitHubService {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
