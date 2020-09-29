package com.enesky.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesky.daggerplayground.models.Car
import com.enesky.daggerplayground.models.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.create()
        car = carComponent.getCar()
        car.drive()
    }

}