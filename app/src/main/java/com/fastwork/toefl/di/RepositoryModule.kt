package com.fastwork.toefl.di

import android.content.Context
import com.fastwork.toefl.data.local.database.dao.ParagraphDao
import com.fastwork.toefl.data.remote.network.HomeAPI
import com.fastwork.toefl.data.repository.*
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoryModule = module {

    fun providehomeRepositoryModule(
        api: HomeAPI,
        context: Context,
        paragraphDao: ParagraphDao
    ): HomeRepositoryImpl {
        return HomeRepositoryImpl(api, context, paragraphDao)
    }
    
    single<HomeRepository> {
        HomeRepositoryImpl(get(), androidContext(), get())
    }

    single<PracticeRepository> { PracticeRepositoryImpl(get(), get(), get()) }

    single<ScoreRepository> { ScoreRepositoryImpl(get()) }

    single<UserRepository> { UserRepositoryImpl(get()) }

}