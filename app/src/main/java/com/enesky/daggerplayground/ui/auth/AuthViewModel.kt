package com.enesky.daggerplayground.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import com.enesky.daggerplayground.network.auth.AuthApi
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 02/10/2020
 */
class AuthViewModel
    @Inject
    constructor(authApi: AuthApi): ViewModel() {

    private val TAG = "AuthViewModel"

    init {
        Log.d(TAG, "AuthViewModel started.")
    }

}