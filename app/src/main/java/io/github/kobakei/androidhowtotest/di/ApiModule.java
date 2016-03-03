package io.github.kobakei.androidhowtotest.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.kobakei.androidhowtotest.model.GitHubService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Dagger module to proviode API client.
 * Created by keisuke on 16/03/03.
 */
@Module
public class ApiModule {
    @Provides
    @Singleton
    public GitHubService provideGitHubService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(GitHubService.class);
    }
}
