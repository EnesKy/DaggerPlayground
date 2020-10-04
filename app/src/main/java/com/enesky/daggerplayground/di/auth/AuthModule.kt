package com.enesky.daggerplayground.di.auth

import com.enesky.daggerplayground.network.auth.AuthApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Enes Kamil YILMAZ on 04/10/2020
 */

@Module
class AuthModule {

    companion object {
        @Provides
        fun provideAuthApi(retrofit: Retrofit): AuthApi = retrofit.create(AuthApi::class.java)
    }

}