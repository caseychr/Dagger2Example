package com.codinginflow.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codinginflow.dagger2example.component.ActivityComponent;
import com.codinginflow.dagger2example.model.Car;
import com.codinginflow.dagger2example.module.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car mCar1, mCar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;

        ActivityComponent carComponent = ((ExampleApp) getApplication())
                .getAppComponent().getActivityComponentBuilder().horsePower(120).engineCapacity(1400).build();

        carComponent.inject(this);

        mCar1.drive();mCar2.drive();

        /*
        AppComponent mAppComponent = DaggerCarComponent.create();
        mCar1 = mAppComponent.getCar();
        mCar1.drive();

        ActivityComponent component1 = DaggerCarComponent.builder()
                .horsePower(150).engineCapacity(1400).build();
        component1.inject(this);

        ActivityComponent component2 = DaggerCarComponent.builder()
                .horsePower(150).engineCapacity(1400).build();
        component2.inject(this);

        component1.getCar().drive();
        component2.getCar().drive();*/
    }
}
