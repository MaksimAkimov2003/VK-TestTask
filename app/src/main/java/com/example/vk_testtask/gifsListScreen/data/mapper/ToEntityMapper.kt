package com.example.vk_testtask.gifsListScreen.data.mapper

import com.example.vk_testtask.gifsListScreen.data.model.GifModelList
import com.example.vk_testtask.gifsListScreen.domain.entity.GifEntity

fun GifModelList.toEntity(): List<GifEntity> {
	return data.map { GifEntity(gifUrl = it?.images?.fixed_width_small?.url) }
}