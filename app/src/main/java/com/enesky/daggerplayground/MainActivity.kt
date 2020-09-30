package com.enesky.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesky.daggerplayground.car.Car
import com.enesky.daggerplayground.car.DaggerCarComponent
import com.enesky.daggerplayground.car.engine.PetrolEngineModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var car: Car
    @Inject lateinit var injectedCar: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent
            //.create() //Create sadece contrustorlar boşsa kullanılabilir.
            .builder()
            //.petrolEngineModule(PetrolEngineModule(100))
            .horsePower(115)
            .build()

        car = carComponent.getCar()
        car.drive()

        //carComponent.inject(this) //Field Injection
        //injectedCar.drive()
    }

}