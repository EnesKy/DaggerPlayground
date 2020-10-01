package com.enesky.daggerplayground.codingwithmitch

import com.enesky.daggerplayground.codingwithmitch.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by Enes Kamil YILMAZ on 01/10/2020
 */
class App: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
            = DaggerAppComponent.builder().application(this).build()


}