package com.codinginflow.dagger2example.model;

import android.util.Log;

import com.codinginflow.dagger2example.ThirdLibModels.Wheels;
import com.codinginflow.dagger2example.scope.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver mDriver;
    @Inject Engine mEngine;
    private Wheels mWheels;

    @Inject //This is Constructor Injection. Can only be used on one constructor.
    public Car(Driver driver, Wheels wheels) {
        this.mDriver = driver;
        mWheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        mEngine.start();
        Log.i(TAG, mDriver+" drives "+this);
    }
}
