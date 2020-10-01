package com.enesky.daggerplayground.codinginflow.dagger

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponentFactory() : ActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule): AppComponent
    }

}