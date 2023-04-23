package com.diamount_studio.common.features.swipeable_cards.presentation

import android.app.Application

public abstract class AppParent : Application() {

    protected var statsClass: Class<*>? = null

    protected abstract fun getWeatherApiKey(): String?

    override fun onCreate() {
        super.onCreate()

    }
}
