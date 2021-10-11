package com.fastwork.toefl.core

import android.app.Application
import com.fastwork.toefl.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        startKoin {
            androidContext(this@BaseApplication)
            modules(databaseModule, networkModule, apiModule, repositoryModule, viewModelModule)
        }
    }
}