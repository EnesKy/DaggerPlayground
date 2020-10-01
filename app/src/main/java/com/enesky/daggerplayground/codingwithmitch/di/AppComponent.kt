package com.enesky.daggerplayground.codingwithmitch.di

import android.app.Application
import com.enesky.daggerplayground.codingwithmitch.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by Enes Kamil YILMAZ on 01/10/2020
 */

@Component( modules = [AndroidSupportInjectionModule::class])
interface AppComponent: AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent //Builder yapısını override edeceksen build() metodunu eklemek zorundasın.
    }

}