package io.github.kobakei.androidhowtotest.di;

import javax.inject.Singleton;

import dagger.Component;
import io.github.kobakei.androidhowtotest.AdditionActivity;
import io.github.kobakei.androidhowtotest.ApiActivity;

/**
 * Dagger component.
 * This class injects fields to target classes (e.g. Activity)
 * Created by keisuke on 16/03/03.
 */
@Singleton
@Component(modules = {AdditionModule.class, ApiModule.class})
public interface MyComponent {
    void inject(AdditionActivity target);
    void inject(ApiActivity target);
}
