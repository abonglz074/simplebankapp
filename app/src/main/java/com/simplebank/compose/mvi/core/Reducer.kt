package com.simplebank.compose.mvi.core

import com.simplebank.compose.mvi.Action
import com.simplebank.compose.mvi.State

interface Reducer<S: State, A: Action> {

    fun reduce(state: S, action: A): S
}
