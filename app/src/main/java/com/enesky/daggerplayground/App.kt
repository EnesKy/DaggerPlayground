package com.enesky.daggerplayground

import android.app.Application
import com.enesky.daggerplayground.car.ActivityComponent
import com.enesky.daggerplayground.car.DaggerActivityComponent

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */
class App : Application() {

    //private lateinit var activityComponent: ActivityComponent
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }

    fun getAppComponent(): AppComponent = appComponent

}