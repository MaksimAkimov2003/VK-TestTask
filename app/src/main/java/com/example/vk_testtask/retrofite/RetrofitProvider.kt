package com.example.vk_testtask.retrofite

import com.example.vk_testtask.BuildConfig
import com.example.vk_testtask.gifsListScreen.data.api.GifsService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun provideLoggingInterceptor(): HttpLoggingInterceptor {
	val loggingInterceptor = HttpLoggingInterceptor()
	loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

	return loggingInterceptor
}

fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
	OkHttpClient.Builder()
		.addInterceptor(loggingInterceptor)
		.build()

fun provideRetrofit(okHttpClient: OkHttpClient): GifsService =
	Retrofit.Builder()
		.run {
			baseUrl(BuildConfig.BASE_URL)
			client(okHttpClient)
			addConverterFactory(GsonConverterFactory.create())
			build()
		}.create(GifsService::class.java)