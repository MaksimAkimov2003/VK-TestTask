package com.example.vk_testtask

import com.example.vk_testtask.retrofite.provideLoggingInterceptor
import com.example.vk_testtask.retrofite.provideOkHttpClient
import com.example.vk_testtask.retrofite.provideRetrofit
import org.koin.dsl.module

val appModule = module {
	single { provideLoggingInterceptor() }
	single { provideOkHttpClient(loggingInterceptor = get()) }
	single { provideRetrofit(okHttpClient = get()) }
}