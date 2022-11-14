package com.simplebank.compose

import android.app.Application
import com.simplebank.compose.di.AppComponent

class MainApp: Application(), App {

    private var appComponent: AppComponent? = null

    override fun getAppComponent(): AppComponent {
//        if (appComponent == null) {
//            appComponent = AppComponent.init()
//        }
//        return appComponent!!

        return appComponent ?: AppComponent.init()
    }
}
