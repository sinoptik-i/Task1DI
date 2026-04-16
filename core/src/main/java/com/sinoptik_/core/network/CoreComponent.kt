package com.sinoptik_.core.network

import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface CoreComponent {

    @Server1 fun provideServer1(): Retrofit
    @Server2 fun provideServr2(): Retrofit

}