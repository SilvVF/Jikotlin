package io.silv.jikotlin

import io.ktor.client.utils.clientDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.newFixedThreadPoolContext

actual class JikotlinDispatcher {
    actual fun io(): CoroutineDispatcher {
        return newFixedThreadPoolContext(64, "Dispatchers.IO")
    }
}