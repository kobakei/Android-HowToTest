package io.github.kobakei.androidhowtotest.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.github.kobakei.androidhowtotest.model.Addition;

/**
 * Created by keisuke on 16/03/03.
 */
@Module
public class SampleModule {

    public SampleModule() {
    }

    @Provides
    @Singleton
    public Addition provideAddition() {
        return new Addition();
    }
}
