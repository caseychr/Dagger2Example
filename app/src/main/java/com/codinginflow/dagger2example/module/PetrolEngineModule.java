package com.codinginflow.dagger2example.module;

import com.codinginflow.dagger2example.model.Engine;
import com.codinginflow.dagger2example.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds // Can use Binds instead of Provides when empty constructor and redundant code
    abstract Engine bindEngine(PetrolEngine engine);

}
