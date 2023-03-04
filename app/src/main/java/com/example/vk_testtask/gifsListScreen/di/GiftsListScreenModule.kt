package com.example.vk_testtask.gifsListScreen.di

import com.example.vk_testtask.gifsListScreen.data.api.createGifsService
import com.example.vk_testtask.gifsListScreen.data.repository.GifsRepository
import com.example.vk_testtask.gifsListScreen.domain.useCase.GetGifsUseCase
import com.example.vk_testtask.gifsListScreen.presentation.GifsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val giftsListScreenModule = module {
	single { createGifsService(retrofit = get()) }

	single { GifsRepository(api = get()) }

	factory { GetGifsUseCase(gifsRepository = get()) }

	viewModel {
		GifsViewModel(getGifsUseCase = get())
	}
}