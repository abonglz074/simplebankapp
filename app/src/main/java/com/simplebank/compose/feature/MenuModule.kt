package com.simplebank.compose.feature

import androidx.lifecycle.ViewModel
import com.simplebank.compose.di.ViewModelKey
import com.simplebank.compose.feature.presentation.viewmodel.MenuViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [MenuModule.Inner::class])
class MenuModule {

    // TODO refactor in future
    @Module
    interface Inner {

        @Binds
        @IntoMap
        @ViewModelKey(MenuViewModel::class)
        fun provideMenuViewModel(menuViewModel: MenuViewModel): ViewModel
    }
}
