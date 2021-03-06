package com.fastwork.toefl.di

import com.fastwork.toefl.data.remote.network.HomeAPI
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    fun provideHomeApiModule(retrofit: Retrofit): HomeAPI {
        return retrofit.create(HomeAPI::class.java)
    }

    single {
        provideHomeApiModule(get())
    }
}