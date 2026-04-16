package com.sinoptik_.task1di.di

import com.sinoptik_.core.network.CoreComponent
import com.sinoptik_.feature_home.di.FeatureHomeComponent
import com.sinoptik_.task1di.MainActivity
import dagger.Component

@AppScope
//@Component(modules = [AppModule::class], dependencies = [CoreComponent::class])
@Component(dependencies = [CoreComponent::class, FeatureHomeComponent::class])
interface AppComponent {
    fun inject(activity: MainActivity)

}