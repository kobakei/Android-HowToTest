package io.github.kobakei.androidhowtotest.di;

import javax.inject.Singleton;

import dagger.Component;
import io.github.kobakei.androidhowtotest.AdditionActivity;

/**
 * Created by keisuke on 16/03/03.
 */
@Singleton
@Component(modules = {SampleModule.class})
public interface SampleComponent {
    void inject(AdditionActivity target);
}
