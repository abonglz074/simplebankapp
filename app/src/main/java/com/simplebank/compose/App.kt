package com.simplebank.compose

import com.simplebank.compose.di.AppComponent

interface App {

    fun getAppComponent(): AppComponent
}
