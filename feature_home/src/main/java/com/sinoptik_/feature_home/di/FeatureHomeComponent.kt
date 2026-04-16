package com.sinoptik_.feature_home.di

import com.sinoptik_.core.network.CoreComponent
import com.sinoptik_.feature_home.usecases.NetworkUC
import dagger.Component
import javax.inject.Singleton

@FeatureHomeScope
@Component(dependencies = [CoreComponent::class])
interface FeatureHomeComponent {
    fun inject(networkUC: NetworkUC)
    fun getNetworkUC(): NetworkUC
}