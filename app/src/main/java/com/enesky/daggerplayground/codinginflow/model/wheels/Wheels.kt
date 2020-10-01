package com.enesky.daggerplayground.codinginflow.model.wheels

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */

class Wheels(private val rims: Rims,
             private val tires: Tires
) {
    //Bu class 3rd party kütüphanelerden birinin classı gibi düşünelim.
    // Bu varsayıma göre classta inject kullanamıyoruz.
}