package com.enesky.daggerplayground.car

import com.enesky.daggerplayground.MainActivity
import com.enesky.daggerplayground.car.engine.DieselEngineModule
import com.enesky.daggerplayground.car.engine.PetrolEngineModule
import com.enesky.daggerplayground.car.wheels.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

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
         //Tanıtmak için @Named kullanılır.
         @BindsInstance //Builder oluşturmanın asıl nedeni bu instanceı kullanabilmek.
         fun horsePower(@Named("horsePower") horsePower: Int): Builder

         @BindsInstance //Builder oluşturmanın asıl nedeni bu instanceı kullanabilmek.
         fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

         fun build(): CarComponent

     }
}