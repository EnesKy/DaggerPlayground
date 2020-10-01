package com.enesky.daggerplayground.car

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

@Module
abstract class DriverModule {

    companion object {
        @Provides
        @Singleton
        fun provideDriver(): Driver = Driver()
    }

}