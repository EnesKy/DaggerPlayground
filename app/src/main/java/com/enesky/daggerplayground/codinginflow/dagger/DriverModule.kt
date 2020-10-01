package com.enesky.daggerplayground.codinginflow.dagger

import com.enesky.daggerplayground.codinginflow.model.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

@Module
class DriverModule constructor(var name: String) {

    @Provides
    @Singleton
    fun provideDriver(): Driver = Driver(name)

}