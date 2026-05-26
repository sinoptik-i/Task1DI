package com.sinoptik_.feature_home.di.exam_practice

object FeatureUserComponentHolder {
    private var featureUserComponent: FeatureUserComponent? = null

    fun init(deps: FeatureDeps) {
        featureUserComponent = DaggerFeatureUserComponent
            .builder()
            .featureDeps(deps)
            .build()
    }

    fun get() = featureUserComponent ?: throw IllegalStateException("FeatureUserComponent not init")

    fun clear() {
        featureUserComponent = null
    }
}