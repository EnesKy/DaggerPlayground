package com.enesky.daggerplayground

import android.app.Application
import com.enesky.daggerplayground.codinginflow.dagger.AppComponent
import com.enesky.daggerplayground.codinginflow.dagger.DaggerAppComponent
import com.enesky.daggerplayground.codinginflow.dagger.DriverModule

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */
class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.factory().create(DriverModule("Enes"))
    }

    fun getAppComponent(): AppComponent = appComponent

}