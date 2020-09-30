package com.enesky.daggerplayground.car.engine

import dagger.Binds
import dagger.Module

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

@Module
abstract class PetrolEngineModule {
    //DieselEngineModule ile aynı işlevi görür.
    //Ancak bu kullanım daha iyidir.
    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine): Engine
}