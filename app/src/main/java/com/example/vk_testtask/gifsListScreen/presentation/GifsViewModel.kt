package com.example.vk_testtask.gifsListScreen.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vk_testtask.gifsListScreen.domain.entity.GifEntity
import com.example.vk_testtask.gifsListScreen.domain.useCase.GetGifsUseCase
import kotlinx.coroutines.launch

class GifsViewModel(
	private val getGifsUseCase: GetGifsUseCase
) : ViewModel() {

	val liveData = MutableLiveData<List<GifEntity>>()

	fun getSth() {
		viewModelScope.launch {
			liveData.value = getGifsUseCase.execute(userResponse = "Anime")
		}
	}
}