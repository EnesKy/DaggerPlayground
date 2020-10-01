package com.enesky.daggerplayground.codinginflow.dagger

import com.enesky.daggerplayground.MainActivity
import com.enesky.daggerplayground.codinginflow.dagger.modules.DieselEngineModule
import com.enesky.daggerplayground.codinginflow.dagger.modules.WheelsModule
import com.enesky.daggerplayground.codinginflow.model.Car
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */

//@Singleton //İçerde bi singleton class varsa componentte de Singleton annotation yapılmalı.
@ActivityScope
@Subcomponent(modules = [WheelsModule::class, DieselEngineModule::class])
interface ActivityComponent {
    fun getCar(): Car

    /**
     * Eğer constructor injection yoksa manuel olarak Inject işlemi yapmak gerekir.
     */
    fun inject(mainActivity: MainActivity)

   /*@Subcomponent.Builder -Factorey ve Builder beraber bulunamaz.
    interface Builder {
        // Eğer @Component.Builder kullanmadıysan bu otomatik oluşur. Ama kullandığın için eklemen gerek.
        // fun appComponent(component: AppComponent): Builder

        //Dagger bu değerin horsePower olduğunu bilmiyor. Sadece elinde int değer var. Ne zaman int değer istersek bunu verecektir.
        //Tanıtmak için @Named kullanılır.
        @BindsInstance //Builder oluşturmanın asıl nedeni bu instanceı kullanabilmek.
        fun horsePower(@Named("horsePower") horsePower: Int): Builder

        @BindsInstance //Builder oluşturmanın asıl nedeni bu instanceı kullanabilmek.
        fun engineCapacity(@Named("engineCapacity") engineCapacity: Int): Builder

        fun build(): ActivityComponent
    }*/

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance @Named("horsePower") horsePower: Int,
                   @BindsInstance @Named("engineCapacity") engineCapacity: Int): ActivityComponent
    }
}