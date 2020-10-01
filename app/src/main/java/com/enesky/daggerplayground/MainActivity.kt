package com.enesky.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesky.daggerplayground.car.Car
import com.enesky.daggerplayground.car.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1 : Car
    @Inject lateinit var car2 : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val carComponent = DaggerCarComponent
            //.create() //Create sadece contrustorlar boşsa kullanılabilir.
            .builder()
            //.petrolEngineModule(PetrolEngineModule(100))
            .horsePower(115)
            .engineCapacity(1200)
            .build()*/
        //val carComponent = DaggerAppComponent.


        val component = DaggerActivityComponent
            .builder()
            .horsePower(125)
            .engineCapacity(1750)
            .appComponent((application as App).getAppComponent())
            .build()

        component.inject(this)
        car1.drive()
        car2.drive()


    }

}