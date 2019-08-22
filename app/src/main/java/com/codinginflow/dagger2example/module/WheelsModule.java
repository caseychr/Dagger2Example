package com.codinginflow.dagger2example.module;

import com.codinginflow.dagger2example.ThirdLibModels.Rims;
import com.codinginflow.dagger2example.ThirdLibModels.Tires;
import com.codinginflow.dagger2example.ThirdLibModels.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
