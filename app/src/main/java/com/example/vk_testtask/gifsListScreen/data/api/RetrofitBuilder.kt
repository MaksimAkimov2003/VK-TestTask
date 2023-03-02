package com.example.vk_testtask.gifsListScreen.data.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun provideLoggingInterceptor(): HttpLoggingInterceptor {
	val loggingInterceptor = HttpLoggingInterceptor()
	loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

	return loggingInterceptor
}

fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
	OkHttpClient.Builder()
		.addInterceptor(loggingInterceptor)
		.build()

fun provideMoshi(): Moshi = Moshi.Builder()
	.add(KotlinJsonAdapterFactory())
	.build()

fun provideGifsService(okHttpClient: OkHttpClient, moshi: Moshi): GifsService =
	Retrofit.Builder()
		.run {
			baseUrl("https://api.giphy.com/")
			client(okHttpClient)
			addConverterFactory(MoshiConverterFactory.create(moshi))
			build()
		}.create(GifsService::class.java)
