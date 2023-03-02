package com.example.vk_testtask.gifsListScreen.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface GifsService {

	@GET("/v1/gifs/search")
	suspend fun getListOfGifs(
		@Query("api_key")
		apiKey: String = "9IjGBEe14waZZaSjBiE5J9DPogGh9zLU",

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
	)

}
