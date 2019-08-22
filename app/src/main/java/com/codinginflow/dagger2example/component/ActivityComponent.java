package com.codinginflow.dagger2example.component;

import com.codinginflow.dagger2example.MainActivity;
import com.codinginflow.dagger2example.model.Car;
import com.codinginflow.dagger2example.module.DieselEngineModule;
import com.codinginflow.dagger2example.module.PetrolEngineModule;
import com.codinginflow.dagger2example.module.WheelsModule;
import com.codinginflow.dagger2example.scope.PerActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

// Cannot add both Engines here cause Dagger can know which one to use

/**
 * AppComponent spans the life of the App whereas ActivityComponent spans life of a single activity.
 * AppComponent is listed as a dependency of ActivitComponent because this is where it gets the Driver (Singleton) from.
 */
@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {


        // Have to use @Named here cause 2 ints are passed and Dagger cannot differentiate. Have to pass in
        // constructor as well.
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsepower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        ActivityComponent build();
    }
}
