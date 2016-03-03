package io.github.kobakei.androidhowtotest;

import android.app.Application;

import io.github.kobakei.androidhowtotest.di.DaggerSampleComponent;
import io.github.kobakei.androidhowtotest.di.SampleComponent;
import io.github.kobakei.androidhowtotest.di.SampleModule;

/**
 * Created by keisuke on 16/03/03.
 */
public class MyApplication extends Application {

    private SampleComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerSampleComponent.builder()
                .sampleModule(new SampleModule())
                .build();
    }

    public SampleComponent getComponent() {
        return component;
    }
}
