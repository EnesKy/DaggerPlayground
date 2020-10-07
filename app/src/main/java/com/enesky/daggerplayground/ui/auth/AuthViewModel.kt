package com.enesky.daggerplayground.ui.auth

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enesky.daggerplayground.models.User
import com.enesky.daggerplayground.network.auth.AuthApi
import com.enesky.daggerplayground.util.TAG
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Enes Kamil YILMAZ on 02/10/2020
 */

class AuthViewModel
    @Inject
    constructor(val authApi: AuthApi): ViewModel() {

    private val user = MutableLiveData<User>()
    val _user: LiveData<User> = user

    init {
        Log.d(TAG(), "AuthViewModel started.")
    }
    
    fun getUserInfo(userID: Int) {
        viewModelScope.launch {
            runCatching {
                authApi.getUsers(userID)
            }.onSuccess {
                user.value = it
            }.onFailure {
                Log.d(TAG(), "It failed cause of -> ${it.localizedMessage}")
            }
        }
    }

}