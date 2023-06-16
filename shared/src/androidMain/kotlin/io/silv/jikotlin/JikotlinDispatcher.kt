package io.silv.jikotlin

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual class JikotlinDispatcher {
    actual fun io(): CoroutineDispatcher {
        return Dispatchers.IO
    }

}