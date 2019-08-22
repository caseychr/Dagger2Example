package com.codinginflow.dagger2example.module;

import com.codinginflow.dagger2example.model.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}
