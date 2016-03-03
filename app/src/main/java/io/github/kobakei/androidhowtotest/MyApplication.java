package io.github.kobakei.androidhowtotest;

import android.app.Application;

import io.github.kobakei.androidhowtotest.di.ApiModule;
import io.github.kobakei.androidhowtotest.di.DaggerMyComponent;
import io.github.kobakei.androidhowtotest.di.MyComponent;
import io.github.kobakei.androidhowtotest.di.AdditionModule;
import io.github.kobakei.androidhowtotest.di.UseCaseModule;

/**
 * Created by keisuke on 16/03/03.
 */
public class MyApplication extends Application {

    private MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        // Create object graph for dependency injection.
        // Modules which are declared in MyComponent.java will be used.
        component = DaggerMyComponent.builder().build();
    }

    /**
     * Return Dagger2 component.
     *
     * @return
     */
    public MyComponent getComponent() {
        return component;
    }
}
