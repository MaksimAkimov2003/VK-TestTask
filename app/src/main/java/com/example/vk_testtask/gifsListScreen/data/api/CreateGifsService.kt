package com.example.vk_testtask.gifsListScreen.data.api

import retrofit2.Retrofit

fun createGifsService(retrofit: Retrofit) {
	retrofit.create(GifsService::class.java)
}