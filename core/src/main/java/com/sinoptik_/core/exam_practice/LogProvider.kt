package com.sinoptik_.core.exam_practice

import android.util.Log
import javax.inject.Inject


const val LOG_PROVIDER = "LOG_PROVIDER"

interface LogProvider {
    fun log(msg: String)
}

class LogProviderImpl @Inject constructor(): LogProvider {
    override fun log(msg: String) {
        Log.d(LOG_PROVIDER, msg)
    }
}