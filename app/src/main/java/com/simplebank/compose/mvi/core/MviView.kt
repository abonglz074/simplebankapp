package com.simplebank.compose.mvi.core

import com.simplebank.compose.mvi.Action
import com.simplebank.compose.mvi.State
import kotlinx.coroutines.flow.Flow

interface MviView<A: Action, S: State> {

    val actions: Flow<A>

    fun render(state: S)
}
