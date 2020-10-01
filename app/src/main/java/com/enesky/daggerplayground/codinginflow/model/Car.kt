package com.enesky.daggerplayground.codinginflow.model

import android.util.Log
import com.enesky.daggerplayground.codinginflow.dagger.ActivityScope
import com.enesky.daggerplayground.codinginflow.model.engine.Engine
import com.enesky.daggerplayground.codinginflow.model.wheels.Wheels
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */

@ActivityScope
class Car @Inject constructor(
    var driver: Driver,
    var engine: Engine,
    var wheels: Wheels
) {

    /**
     * Inject in kullanılabildiği 3 alan var.
     * Constructor, Fields, Methods
     *
     * Constructor injection varsa fields ve methods, constructor injection bitince otomatik olarak inject edilir.
     * Eğer constructor injection yoksa manuel olarak Inject yapmak gerekir.
     *
     * Sırayla Constructor -> Fields -> Methods
     */

    /**
     * Method injection
     * Constructor çalıştıktan hemen sonra otomatik çalışır.
     * Bu metodu ayrı olarak çalıştırmak gerekmez.
     *
     * Tek doğru kullanımı buradaki gibi
     */
    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "Driver Name = ${driver.name}, Licence Number = ${driver.hashCode()} - driving the car which plate number is ${this.hashCode()}")
    }

    companion object {
        private const val TAG = "Car"
    }

}