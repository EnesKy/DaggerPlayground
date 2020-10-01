package com.enesky.daggerplayground

import com.enesky.daggerplayground.car.Driver
import com.enesky.daggerplayground.car.DriverModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getDriver(): Driver

}