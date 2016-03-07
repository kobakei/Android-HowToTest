package io.github.kobakei.androidhowtotest.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.kobakei.androidhowtotest.net.GitHubService;
import io.github.kobakei.androidhowtotest.usecase.GitHubUseCase;

/**
 * Dagger module to proviode use case (business logic).
 * This class needs other module which provides api client.
 * Created by keisuke on 16/03/03.
 */
@Module(includes = ApiModule.class)
public class UseCaseModule {
    @Singleton
    @Provides
    public GitHubUseCase provideGitHubUseCase(GitHubService gitHubService) {
        return new GitHubUseCase(gitHubService);
    }
}
