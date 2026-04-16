package com.sinoptik_.task1di

import android.app.Application
import com.sinoptik_.core.network.DaggerCoreComponent
import com.sinoptik_.feature_home.di.DaggerFeatureHomeComponent
import com.sinoptik_.task1di.di.AppComponent
import com.sinoptik_.task1di.di.DaggerAppComponent

class MyApp : Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()

        initComponents()
    }

    private fun initComponents() {
        val coreComponent = DaggerCoreComponent.builder().build()

        val featureHomeComponent = DaggerFeatureHomeComponent
            .builder()
            .coreComponent(coreComponent)
            .build()

        appComponent = DaggerAppComponent.builder()
            .coreComponent(coreComponent)
            .featureHomeComponent(featureHomeComponent)
            .build()

    }

}