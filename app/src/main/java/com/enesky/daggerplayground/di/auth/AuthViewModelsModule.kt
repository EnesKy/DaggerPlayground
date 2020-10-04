package com.enesky.daggerplayground.di.auth

import androidx.lifecycle.ViewModel
import com.enesky.daggerplayground.di.ViewModelKey
import com.enesky.daggerplayground.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Enes Kamil YILMAZ on 03/10/2020
 */

@Module
abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(viewModel: AuthViewModel): ViewModel

}