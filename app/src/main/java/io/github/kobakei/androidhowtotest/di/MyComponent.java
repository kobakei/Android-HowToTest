package io.github.kobakei.androidhowtotest.di;

import javax.inject.Singleton;

import dagger.Component;
import io.github.kobakei.androidhowtotest.AdditionActivity;
import io.github.kobakei.androidhowtotest.ApiActivity;
import io.github.kobakei.androidhowtotest.model.GitHubUseCase;

/**
 * Dagger component.
 * This class injects fields to target classes (e.g. Activity)
 * Created by keisuke on 16/03/03.
 */
@Singleton
@Component(modules = {AdditionModule.class, ApiModule.class, UseCaseModule.class})
public interface MyComponent {
    GitHubUseCase gitHubUseCase();

    void inject(AdditionActivity target);
    void inject(ApiActivity target);
}
