package com.enesky.daggerplayground.di

import dagger.Module
import dagger.Provides

/**
 * Created by Enes Kamil YILMAZ on 01/10/2020
 */

@Module
class AppModule {

    @Provides
    fun provideDummyString(): String = "lorem ipsum"

}