package io.github.kobakei.androidhowtotest.di;

import javax.inject.Singleton;

import dagger.Component;
import io.github.kobakei.androidhowtotest.activity.CalculatorActivity;
import io.github.kobakei.androidhowtotest.activity.ApiActivity;
import io.github.kobakei.androidhowtotest.usecase.GitHubUseCase;

/**
 * Dagger component.
 * This class injects fields to target classes (e.g. Activity)
 * Created by keisuke on 16/03/03.
 */
@Singleton
@Component(modules = {AdditionModule.class, ApiModule.class, UseCaseModule.class})
public interface MyComponent {
    GitHubUseCase gitHubUseCase();

    void inject(CalculatorActivity target);
    void inject(ApiActivity target);
}
