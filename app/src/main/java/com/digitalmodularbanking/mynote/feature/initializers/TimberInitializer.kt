package com.digitalmodularbanking.mynote.feature.initializers

import android.content.Context
import androidx.startup.Initializer
import com.digitalmodularbanking.mynote.BuildConfig
import timber.log.Timber

class TimberInitializer: Initializer<Unit> {

    override fun create(context: Context) {
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
            Timber.d("Timber is initialized")
        }
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}