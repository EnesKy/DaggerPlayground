package com.enesky.daggerplayground.codinginflow.model.engine

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */
class DieselEngine
    @Inject
    constructor(@Named("horsePower") var horsePower: Int,
                @Named("engineCapacity") var engineCapacity: Int): Engine {

    companion object {
        private const val TAG = "Car"
    }

    override fun start() {
        Log.d(TAG, "Diesel engine started. Specs: HorsePower = $horsePower - EngineCapacity = $engineCapacity")
    }
}