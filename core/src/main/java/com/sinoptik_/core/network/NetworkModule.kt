package com.sinoptik_.core.network

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    @Server1
    fun providesServer1(): Retrofit = Retrofit.Builder()
        .baseUrl("https://servr1.com")
        .build()

    @Provides
    @Singleton
    @Server2
    fun providesServer2() = Retrofit.Builder()
        .baseUrl("https://servr2.com")
        .build()


}