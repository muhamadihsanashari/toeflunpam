package com.fastwork.toefl.di
import com.fastwork.toefl.ui.login.LoginViewModel
import com.fastwork.toefl.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        LoginViewModel()
    }
    viewModel {
        MainViewModel(get())
    }
}