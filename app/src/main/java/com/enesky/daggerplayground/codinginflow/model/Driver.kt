package com.enesky.daggerplayground.codinginflow.model

/**
 * Created by Enes Kamil YILMAZ on 30/09/2020
 */

/*
@Singleton
class Driver @Inject constructor() {
//Eğer driver classı 3rd party classı olsaydı inject kullanamayacağımız için Module kullanırdık
}
*/

class Driver constructor(var name: String){ //Bu class'a sahip değiliz bu sebeple @Inject annotation ı yapamıyoruz. (Diye şeeet .s)
}
