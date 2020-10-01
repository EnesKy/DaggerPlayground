package com.enesky.daggerplayground.codinginflow.model

import android.util.Log
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */
class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected by ${car.driver.name}, Licence number = ${car.driver.hashCode()}.")
    }

    companion object {
        private const val TAG = "Car"
    }

}