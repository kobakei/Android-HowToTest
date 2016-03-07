package io.github.kobakei.androidhowtotest.usecase;

import java.util.List;

import io.github.kobakei.androidhowtotest.entity.Repo;
import io.github.kobakei.androidhowtotest.net.GitHubService;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Use case class (Business logic class) about GitHub.
 * This class depends on GitHub API client.
 * Created by keisuke on 16/03/03.
 */
public class GitHubUseCase {

    GitHubService gitHubService;

    public GitHubUseCase(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    public void getTotalForkCount(String user, final Callback callback) {
        Call<List<Repo>> call = gitHubService.listRepos(user);
        call.enqueue(new retrofit2.Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                if (response.isSuccess()) {
                    int count = 0;
                    for (Repo repo : response.body()) {
                        count += repo.forks_count;
                    }
                    callback.onTotalForkCountReturned(count);
                }
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {

            }
        });
    }

    public interface Callback {
        void onTotalForkCountReturned(int count);
    }
}
