package com.example.vk_testtask.gifsListScreen.data.model

import com.google.gson.annotations.SerializedName

data class GifModelList(
	@SerializedName("data")
	val data: List<DataParams?>
)

data class DataParams(
	@SerializedName("images")
	val images: ImageParams?
)

data class ImageParams(
	@SerializedName("fixed_width_small")
	val fixed_width_small: URLParams?
)

data class URLParams(
	@SerializedName("url")
	val url: String?
)