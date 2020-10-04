package com.enesky.daggerplayground.di

import androidx.lifecycle.ViewModelProvider
import com.enesky.daggerplayground.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

/**
 * Created by Enes Kamil YILMAZ on 02/10/2020
 */

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelProviderFactory: ViewModelProviderFactory): ViewModelProvider.Factory

}