package com.enesky.daggerplayground.codinginflow.dagger.modules

import com.enesky.daggerplayground.codinginflow.model.engine.Engine
import com.enesky.daggerplayground.codinginflow.model.engine.PetrolEngine
import dagger.Module
import dagger.Provides

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

@Module
class PetrolEngineModule constructor(var horsePower: Int) {
    //DieselEngineModule ile aynı işlevi görür.
    //Ancak bu kullanım daha iyidir.

   @Provides
   fun provideHorsePower() = horsePower

    //@Binds -Injecti kaldırdığımız için ve Bind işleminde herhangi bir düzenleme yapılamayacağından bu kaldırılıp yerine provides kullanırız
    @Provides
    fun providePetrolEngine(petrolEngine: PetrolEngine): Engine = petrolEngine

}