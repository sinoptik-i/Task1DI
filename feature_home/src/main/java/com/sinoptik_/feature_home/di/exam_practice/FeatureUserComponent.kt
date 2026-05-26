package com.sinoptik_.feature_home.di.exam_practice

import com.sinoptik_.core.exam_practice.LogComponent
import com.sinoptik_.core.network.UserRepository
import com.sinoptik_.feature_home.FeatureActivity
import com.sinoptik_.feature_home.UserRepositoryImpl
import dagger.Binds
import dagger.Component
import dagger.Module

@Module
abstract class UserModule {

    @Binds
    abstract fun bindUserRepo(userRepo: UserRepositoryImpl): UserRepository
}


@Component(
    modules = [UserModule::class],
    dependencies = [FeatureDeps::class]
)
interface FeatureUserComponent {
    fun inject(featureActivity: FeatureActivity)
}