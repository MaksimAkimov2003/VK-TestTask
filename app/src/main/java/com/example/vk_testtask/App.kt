package com.example.vk_testtask

import android.app.Application
import com.example.vk_testtask.gifsListScreen.di.giftsListScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

	override fun onCreate() {
		super.onCreate()

		startKoin {
			androidLogger(Level.ERROR)
			androidContext(this@App)
			modules(giftsListScreenModule)
		}
	}
}