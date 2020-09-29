package com.enesky.daggerplayground.car.wheels

import dagger.Module
import dagger.Provides

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */

@Module
class WheelsModule {
    companion object { //Javadaki static.
        // Eğer bir instance'a dayalı değilse bu metotlar bu şekilde kullanılmalı.
        // Eğer dayalı ise companion objectten çıkar.
        @Provides
        fun provideRims(): Rims = Rims()

        @Provides
        fun provideTires(): Tires {
            val tires = Tires()
            tires.inflate()
            return Tires()
        }

        //Buradaki parametreleri üstteki Provide metotlarından otomatik olarak çeker.
        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels = Wheels(rims, tires)
    }

}