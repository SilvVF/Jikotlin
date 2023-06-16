package io.silv.jikotlin

import kotlinx.coroutines.CoroutineDispatcher

public expect class JikotlinDispatcher constructor() {

    fun io(): CoroutineDispatcher
}