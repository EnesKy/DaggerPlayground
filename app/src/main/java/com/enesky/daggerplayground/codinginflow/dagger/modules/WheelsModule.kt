package com.enesky.daggerplayground.codinginflow.dagger.modules

import com.enesky.daggerplayground.codinginflow.model.wheels.Rims
import com.enesky.daggerplayground.codinginflow.model.wheels.Tires
import com.enesky.daggerplayground.codinginflow.model.wheels.Wheels
import dagger.Module
import dagger.Provides

/**
 * Created by Enes Kamil YILMAZ on 29/09/2020
 */

@Module
abstract class WheelsModule { //Tüm Provides metotları staticse classı abstract yapman daha doğru olur.
    companion object { //Javadaki static.
        // Eğer bir instance'a dayalı değilse bu metotlar bu şekilde kullanılmalı.
        // Eğer dayalı ise companion objectten çıkar.
        @Provides
        fun provideRims(): Rims =
            Rims()

        @Provides
        fun provideTires(): Tires {
            val tires =
                Tires()
            tires.inflate()
            return Tires()
        }

        //Buradaki parametreleri üstteki Provide metotlarından otomatik olarak çeker.
        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels =
            Wheels(
                rims,
                tires
            )
    }

}