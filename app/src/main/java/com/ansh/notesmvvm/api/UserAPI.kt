package com.ansh.notesmvvm.api

import com.ansh.notesmvvm.models.UserRequest
import com.ansh.notesmvvm.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserAPI {

    @POST("/users/signup")
    suspend fun signup( @Body request: UserRequest): Response<UserResponse>

    @POST("/users/signin")
    suspend fun signin( @Body request: UserRequest): Response<UserResponse>
}