package io.github.kobakei.androidhowtotest.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.kobakei.androidhowtotest.util.Addition;

/**
 * Dagger module to provide addition.
 * Created by keisuke on 16/03/03.
 */
@Module
public class AdditionModule {

    public AdditionModule() {
    }

    @Provides
    @Singleton
    public Addition provideAddition() {
        return new Addition();
    }
}
