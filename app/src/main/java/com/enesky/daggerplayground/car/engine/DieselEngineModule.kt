package com.enesky.daggerplayground.car.engine

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */

@Module
class DieselEngineModule {
    // Car constructorında Engine var fakat Engine artık bir interface olduğundan
    // Dagger engine'in DieselEngine mi PetrolEngine mi olduğunu bilmiyor.
    // Module yapısına ihtiyaç duyuyor.
    companion object {
        @Provides
        fun provideDieselEngine(dieselEngine: DieselEngine): Engine = dieselEngine
    }
}

