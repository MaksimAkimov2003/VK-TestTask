package com.example.vk_testtask.gifsListScreen.di

import com.example.vk_testtask.gifsListScreen.data.api.provideGifsService
import com.example.vk_testtask.gifsListScreen.data.api.provideLoggingInterceptor
import com.example.vk_testtask.gifsListScreen.data.api.provideMoshi
import com.example.vk_testtask.gifsListScreen.data.api.provideOkHttpClient
import org.koin.dsl.module

val giftsListScreenModule = module {
	single { provideLoggingInterceptor() }
	single { provideOkHttpClient(loggingInterceptor = get()) }
	single { provideMoshi() }
	single { provideGifsService(okHttpClient = get(), moshi = get()) }

//	single { GifsRepository(api = get()) }

//	factory { GetGifsUseCase(gifsRepository = get()) }
}