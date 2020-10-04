package com.enesky.daggerplayground.network.auth

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Enes Kamil YILMAZ on 04/10/2020
 */

interface AuthApi {

    @GET
    fun getUsers(): Call<ResponseBody>

}