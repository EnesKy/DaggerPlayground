package com.enesky.daggerplayground.models

import dagger.Component

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */

@Component
interface CarComponent {
    fun getCar(): Car
}