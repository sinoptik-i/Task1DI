package com.sinoptik_.task1di

import android.app.Application
import com.sinoptik_.core.exam_practice.DaggerLogComponent
import com.sinoptik_.core.network.DaggerCoreComponent
import com.sinoptik_.feature_home.di.DaggerFeatureHomeComponent
import com.sinoptik_.feature_home.di.exam_practice.DaggerFeatureUserComponent
import com.sinoptik_.feature_home.di.exam_practice.FeatureComponentProvider
import com.sinoptik_.feature_home.di.exam_practice.FeatureUserComponent
import com.sinoptik_.task1di.di.AppComponent
import com.sinoptik_.task1di.di.DaggerAppComponent

class MyApp : Application(), FeatureComponentProvider {

    lateinit var appComponent: AppComponent
    lateinit var featureUserComponent: FeatureUserComponent
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
//------------------------------------------------------------------------------
        val logComponent = DaggerLogComponent.builder().build()
        featureUserComponent = DaggerFeatureUserComponent
            .builder()
            .logComponent(logComponent)
            .build()
    }

    override fun provideFeatureComponent() = featureUserComponent

}