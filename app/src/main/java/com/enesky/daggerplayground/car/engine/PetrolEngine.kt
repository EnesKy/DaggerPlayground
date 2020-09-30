package com.enesky.daggerplayground.car.engine

import android.util.Log
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */
class PetrolEngine constructor(var horsePower: Int): Engine {
    //Horsepower değerini nasıl dolduracağını bilmediğinden dagger burada hata verir.
    //Bu sebeple injecti silip bu kısmı moduleden halledeceğiz

    override fun start() {
        Log.d(TAG, "Diesel engine started. HorsePower= $horsePower")
    }

    companion object {
        private const val TAG = "Car"
    }

}