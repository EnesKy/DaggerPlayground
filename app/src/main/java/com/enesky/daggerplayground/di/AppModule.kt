package com.enesky.daggerplayground.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.enesky.daggerplayground.R
import dagger.Module
import dagger.Provides

/**
 * Created by Enes Kamil YILMAZ on 01/10/2020
 */

@Module
class AppModule {

    companion object {

        @Provides
        fun provideRequestOptions(): RequestOptions =
            RequestOptions()
                .placeholder(R.drawable.white_background)
                .error(R.drawable.white_background)

        @Provides
        fun provideGlideInstance(application: Application,
                                 requestOptions: RequestOptions): RequestManager =
            Glide
                .with(application)
                .setDefaultRequestOptions(requestOptions)

        @Provides
        fun provideAppDrawable(application: Application): Drawable =
            ContextCompat.getDrawable(application, R.drawable.decorative_colorful)!!

    }

}