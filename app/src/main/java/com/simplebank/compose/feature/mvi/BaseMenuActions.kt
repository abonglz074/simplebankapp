package com.simplebank.compose.feature.mvi

sealed interface BaseMenuActions

sealed class MenuAction: BaseMenuActions {
    class SearchMenuAction(val query: String)
}

sealed class MenuInternalAction: BaseMenuActions {
    object SearchLoadingAction: MenuInternalAction()
    class SearchSuccessAction(val data: String): MenuInternalAction()
    class SearchFailureAction(val error: Throwable): MenuInternalAction()
}
