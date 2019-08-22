package com.codinginflow.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsepower;

    public DieselEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void start() {
        Log.i(TAG, "Diesel Engine started. Horsepower: "+horsepower);
    }
}
