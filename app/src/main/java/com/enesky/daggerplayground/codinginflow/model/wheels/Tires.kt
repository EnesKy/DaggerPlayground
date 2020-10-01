package com.enesky.daggerplayground.codinginflow.model.wheels

import android.util.Log

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */
class Tires {

    fun inflate() {
        Log.d(TAG, "Tires inflated.")
    }

    companion object {
        private const val TAG = "Car"
    }

}
//Bu class 3rd party kütüphanelerden birinin classı gibi düşünelim.
//Bu varsayıma göre classta inject kullanamıyoruz.