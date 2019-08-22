package com.codinginflow.dagger2example.component;

import com.codinginflow.dagger2example.MainActivity;
import com.codinginflow.dagger2example.model.Car;
import com.codinginflow.dagger2example.model.Driver;
import com.codinginflow.dagger2example.module.DieselEngineModule;
import com.codinginflow.dagger2example.module.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    //Car getCar();
    //void inject(MainActivity mainActivity);

    ActivityComponent.Builder getActivityComponentBuilder();
}
