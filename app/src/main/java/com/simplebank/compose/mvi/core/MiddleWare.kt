package com.simplebank.compose.mvi.core

import com.simplebank.compose.mvi.Action
import com.simplebank.compose.mvi.State
import kotlinx.coroutines.flow.Flow

interface MiddleWare<A: Action, S: State> {

    fun bind(actions: Flow<A>, state: Flow<S>): Flow<S>
}
