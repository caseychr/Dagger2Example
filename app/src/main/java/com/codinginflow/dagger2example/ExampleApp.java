package com.codinginflow.dagger2example;

import android.app.Application;

import com.codinginflow.dagger2example.component.ActivityComponent;
import com.codinginflow.dagger2example.component.AppComponent;
import com.codinginflow.dagger2example.component.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return mComponent;
    }
}
