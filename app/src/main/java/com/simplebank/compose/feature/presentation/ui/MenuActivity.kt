package com.simplebank.compose.feature.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.simplebank.compose.App
import com.simplebank.compose.di.ViewModelFactory
import com.simplebank.compose.feature.presentation.theme.SimpleBankTheme
import com.simplebank.compose.feature.presentation.viewmodel.MenuViewModel
import javax.inject.Inject

class MenuActivity : ComponentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(viewModelStore, viewModelFactory)[MenuViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleBankTheme {
                (applicationContext as App).getAppComponent().inject(this)
            }
        }
    }
}

@Preview
@Composable
fun Text() {
    Text(text = "I love you, Marusya")
}
