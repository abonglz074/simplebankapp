package com.simplebank.compose.feature.mvi

data class MenuState(
    val isLoading: Boolean = false,
    val data: String? = null,
    val error: Throwable? = null
)
