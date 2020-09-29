package com.enesky.daggerplayground.models

import android.util.Log
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */


class Car @Inject constructor(var engine: Engine,
                              var wheels: Wheels) {

    fun drive() {
        Log.d(TAG, "It's going...")
    }

    companion object {
        private const val TAG = "Car"
    }

}