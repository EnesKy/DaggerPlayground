package com.enesky.daggerplayground.car

import com.enesky.daggerplayground.MainActivity
import com.enesky.daggerplayground.car.engine.DieselEngineModule
import com.enesky.daggerplayground.car.engine.PetrolEngineModule
import com.enesky.daggerplayground.car.wheels.WheelsModule
import dagger.BindsInstance
import dagger.Component

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */

@Component (modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car

    /**
     * Eğer constructor injection yoksa manuel olarak Inject işlemi yapmak gerekir.
     */
    fun inject(mainActivity: MainActivity)

     @Component.Builder
     interface Builder {

         //Dagger bu değerin horsePower olduğunu bilmiyor. Sadece elinde int değer var. Ne zaman int değer istersek bunu verecektir.
         @BindsInstance //Builder oluşturmanın asıl nedeni bu instanceı kullanabilmek.
         fun horsePower(horsePower: Int): Builder


         fun build(): CarComponent

     }
}