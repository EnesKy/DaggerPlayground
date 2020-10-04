package com.enesky.daggerplayground.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 02/10/2020
 */
class AuthViewModel
    @Inject
    constructor(): ViewModel() {

    init {
        Log.d("AuthViewModel", "AuthViewModel started.")
    }

}