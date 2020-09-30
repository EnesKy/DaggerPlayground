package com.enesky.daggerplayground.car.engine

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

@Module
class PetrolEngineModule constructor(var horsePower: Int) {
    //DieselEngineModule ile aynı işlevi görür.
    //Ancak bu kullanım daha iyidir.

    //@Binds -Injecti kaldırdığımız için ve Bind işleminde herhangi bir düzenleme yapılamayacağından bu kaldırılıp yerine provides kullanırız
    @Provides
    fun providePetrolEngine(): Engine = PetrolEngine(horsePower)

}