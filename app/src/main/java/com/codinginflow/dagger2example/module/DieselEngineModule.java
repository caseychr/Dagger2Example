package com.codinginflow.dagger2example.module;

import com.codinginflow.dagger2example.model.DieselEngine;
import com.codinginflow.dagger2example.model.Engine;
import com.codinginflow.dagger2example.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    int provideHorsePower() {
        return horsepower;
    }

    @Provides // Can use Binds instead of Provides when empty constructor and redundant code
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }

}
