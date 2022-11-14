package com.simplebank.compose.mvi.core

import com.simplebank.compose.mvi.Action
import com.simplebank.compose.mvi.State

abstract class Store<A: Action, S: State>(
    protected val reducer: Reducer<S, A>,
    protected val middleWare: MiddleWare<A, S>,
    protected val initialState: S
) {

    abstract fun connect()
    abstract fun bind(view: MviView<A, S>)
}
