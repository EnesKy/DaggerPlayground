package com.enesky.daggerplayground.codingwithmitch.di

import com.enesky.daggerplayground.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Enes Kamil YILMAZ on 01/10/2020
 */

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity

}