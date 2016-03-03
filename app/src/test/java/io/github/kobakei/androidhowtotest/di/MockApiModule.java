package io.github.kobakei.androidhowtotest.di;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.kobakei.androidhowtotest.model.GitHubService;
import io.github.kobakei.androidhowtotest.model.Repo;
import retrofit2.Call;
import retrofit2.http.Path;
import retrofit2.mock.Calls;

/**
 * Created by keisuke on 16/03/03.
 */
@Module
public class MockApiModule extends ApiModule {
    @Singleton
    @Provides
    public GitHubService provideGitHubService() {
        return new GitHubService() {
            @Override
            public Call<List<Repo>> listRepos(@Path("user") String user) {
                List<Repo> repos = new ArrayList<>();
                repos.add(new Repo(1, "dummy/dummy1", 10));
                repos.add(new Repo(2, "dummy/dummy2", 5));
                repos.add(new Repo(3, "dummy/dummy3", 0));
                return Calls.response(repos);
            }
        };
    }
}
