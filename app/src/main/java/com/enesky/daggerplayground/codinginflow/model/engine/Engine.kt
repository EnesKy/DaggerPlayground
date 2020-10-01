package com.enesky.daggerplayground.codinginflow.model.engine

/**
 * Created by Enes Kamil YILMAZ on 27/09/2020
 */

//Engine bir class değil de interface olsaydı... Constructorı kaldıracağımızdan Inject yapılamaz.
interface Engine {
    fun start()
}