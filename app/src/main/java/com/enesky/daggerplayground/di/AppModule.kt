package com.enesky.daggerplayground.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.enesky.daggerplayground.R
import com.enesky.daggerplayground.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Enes Kamil YILMAZ on 01/10/2020
 */

@Module
class AppModule {

    companion object {

        @Singleton
        @Provides
        fun provideRetrofitInstance(): Retrofit =
            Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        @Singleton
        @Provides
        fun provideRequestOptions(): RequestOptions =
            RequestOptions().placeholder(R.drawable.white_background)
                .error(R.drawable.white_background)

        @Singleton
        @Provides
        fun provideGlideInstance(application: Application,
                                 requestOptions: RequestOptions): RequestManager =
            Glide.with(application)
                .setDefaultRequestOptions(requestOptions)

        @Singleton
        @Provides
        fun provideAppDrawable(application: Application): Drawable =
            ContextCompat.getDrawable(application, R.drawable.decorative_colorful)!!

    }

}