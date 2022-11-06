package com.simplebank.compose.di

import com.simplebank.compose.feature.MenuModule
import com.simplebank.compose.feature.presentation.ui.MenuActivity
import dagger.Component

@Component(modules = [MenuModule::class])
interface AppComponent {

    companion object {

        fun init(): AppComponent {
            return DaggerAppComponent.factory()
                .create()
        }
    }

    @Component.Factory
    interface Factory {

        fun create(): AppComponent
    }

    fun inject(menuActivity: MenuActivity): MenuActivity
}
