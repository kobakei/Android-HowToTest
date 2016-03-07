package io.github.kobakei.androidhowtotest;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

import io.github.kobakei.androidhowtotest.di.DaggerMyComponent;
import io.github.kobakei.androidhowtotest.di.MyComponent;

/**
 * Application class.
 * In onCreate, it creates Dagger object graph.
 * Activity classes can access Dagger component through this Application class.
 *
 * Created by keisuke on 16/03/03.
 */
public class MyApplication extends Application {

    private MyComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        AndroidThreeTen.init(this);

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
