package com.enesky.daggerplayground.car.engine

import android.util.Log
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */
class PetrolEngine @Inject constructor(): Engine {
    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Petrol engine started.")
    }
}