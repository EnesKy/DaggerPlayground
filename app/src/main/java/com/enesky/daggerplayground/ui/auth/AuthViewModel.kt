package com.enesky.daggerplayground.ui.auth

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enesky.daggerplayground.network.auth.AuthApi
import kotlinx.coroutines.launch
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

        viewModelScope.launch {
            runCatching {
                authApi.getUsers(1)
            }.onSuccess {
                Log.d(TAG, "${it.name} is here...")
            }.onFailure {
                Log.d(TAG, "It failed cause of -> ${it.localizedMessage}")
            }
        }

    }

}