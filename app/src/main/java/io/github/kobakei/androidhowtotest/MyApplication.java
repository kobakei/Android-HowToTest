package io.github.kobakei.androidhowtotest;

import android.app.Application;

import io.github.kobakei.androidhowtotest.di.DaggerMyComponent;
import io.github.kobakei.androidhowtotest.di.MyComponent;
import io.github.kobakei.androidhowtotest.di.AdditionModule;

/**
 * Created by keisuke on 16/03/03.
 */
public class MyApplication extends Application {

    private MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerMyComponent.builder()
                .sampleModule(new AdditionModule())
                .build();
    }

    public MyComponent getComponent() {
        return component;
    }
}
