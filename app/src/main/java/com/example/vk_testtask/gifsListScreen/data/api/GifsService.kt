package com.example.vk_testtask.gifsListScreen.data.api

import com.example.vk_testtask.BuildConfig
import com.example.vk_testtask.gifsListScreen.data.model.GifModelList
import retrofit2.http.GET
import retrofit2.http.Query

interface GifsService {

	@GET("/v1/gifs/search")
	suspend fun getListOfGifs(
		@Query("api_key")
		apiKey: String = BuildConfig.API_KEY,

		@Query("q")
		userResponse: String,

		@Query("limit")
		listOfGifsMaxLength: Int = 25,

		@Query("offset")
		offset: Int = 0,

		@Query("rating")
		rating: String = "g",

		@Query("lang")
		language: String = "en"
	): GifModelList

}
