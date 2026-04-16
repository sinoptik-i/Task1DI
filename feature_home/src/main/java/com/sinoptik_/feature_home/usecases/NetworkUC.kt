package com.sinoptik_.feature_home.usecases

import android.util.Log
import com.sinoptik_.core.network.Server1
import com.sinoptik_.core.network.Server2
import com.sinoptik_.feature_home.di.FeatureHomeScope
import retrofit2.Retrofit
import javax.inject.Inject


const val NETWORK_UC_TAG="NETWORK_UC_TAG"

@FeatureHomeScope
class NetworkUC @Inject constructor(
    @Server1 private val retrofit1: Retrofit,
    @Server2 private val retrofit2: Retrofit,
) {
    fun executeRequests() {
        Log.d(NETWORK_UC_TAG,"request1: ${retrofit1.baseUrl().query()}")
        Log.d(NETWORK_UC_TAG,"request2: ${retrofit2.baseUrl().query()}")
    }

}