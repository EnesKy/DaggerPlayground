package com.enesky.daggerplayground.models

import com.enesky.daggerplayground.MainActivity
import dagger.Component

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */

@Component
interface CarComponent {
    fun getCar(): Car

    /**
     * Eğer constructor injection yoksa manuel olarak Inject işlemi yapmak gerekir.
     */
    fun inject(mainActivity: MainActivity)
}