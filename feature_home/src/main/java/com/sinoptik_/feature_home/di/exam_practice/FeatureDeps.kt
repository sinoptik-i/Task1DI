package com.sinoptik_.feature_home.di.exam_practice

import com.sinoptik_.core.exam_practice.LogComponent
import com.sinoptik_.core.exam_practice.LogProvider

/*
interface FeatureComponentProvider {
    fun provideFeatureComponent(): FeatureUserComponent
}*/


interface FeatureDeps{
    fun logComponent(): LogProvider
}