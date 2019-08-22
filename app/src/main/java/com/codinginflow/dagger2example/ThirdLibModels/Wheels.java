package com.codinginflow.dagger2example.ThirdLibModels;

import com.codinginflow.dagger2example.ThirdLibModels.Rims;
import com.codinginflow.dagger2example.ThirdLibModels.Tires;

/**
 * Let's say we don't own this case so we cannot annotate on it. We need to tell Dagger2 to create Rims, Tires
 * and Wheels so we need to use Modules (WheelsModule).
 */

public class Wheels {

    private Rims mRims;
    private Tires mTires;

    public Wheels(Rims rims, Tires tires) {
        mRims = rims;
        mTires = tires;
    }
}
