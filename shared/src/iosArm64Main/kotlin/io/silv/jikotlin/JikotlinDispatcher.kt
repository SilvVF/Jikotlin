package io.silv.jikotlin

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.newFixedThreadPoolContext

actual class JikotlinDispatcher {

    actual fun io(): CoroutineDispatcher {
        return newFixedThreadPoolContext(64, "Dispatchers.IO")
    }
}