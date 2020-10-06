package com.enesky.daggerplayground.network.auth

import com.enesky.daggerplayground.models.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Enes Kamil YILMAZ on 04/10/2020
 */

interface AuthApi {

    @GET("/users/{id}")
    suspend fun getUsers(@Path("id") id: Int): User

}