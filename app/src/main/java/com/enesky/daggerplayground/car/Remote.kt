package com.enesky.daggerplayground.car

import android.util.Log
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */
class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Log.d(Companion.TAG, "Remote connected.")
    }

    companion object {
        private const val TAG = "Remote"
    }

}