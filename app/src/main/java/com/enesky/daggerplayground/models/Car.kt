package com.enesky.daggerplayground.models

import android.util.Log
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */


class Car @Inject constructor(var engine: Engine,
                              var wheels: Wheels) {

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
        Log.d(TAG, "It's going...")
    }

    companion object {
        private const val TAG = "Car"
    }

}