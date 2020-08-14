package com.naibeck.week03_udb

import android.app.Application
import timber.log.Timber

class WeekApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}