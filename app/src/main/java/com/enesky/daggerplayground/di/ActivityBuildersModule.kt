package com.enesky.daggerplayground.di

import com.enesky.daggerplayground.di.auth.AuthViewModelsModule
import com.enesky.daggerplayground.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Enes Kamil YILMAZ on 01/10/2020
 */

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
        modules = [AuthViewModelsModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}