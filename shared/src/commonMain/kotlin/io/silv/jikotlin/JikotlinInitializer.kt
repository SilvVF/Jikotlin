package io.silv.jikotlin

import kotlinx.coroutines.CoroutineScope
import kotlin.jvm.JvmStatic
import kotlin.jvm.JvmSynthetic
import kotlin.native.concurrent.ThreadLocal



@ThreadLocal
public object JikotlinInitializer {

    @JvmSynthetic
    private val dispatcher = JikotlinDispatcher()

    @JvmStatic
    public var baseUrl: String = "https://api.jikan.moe/v4"

    @JvmSynthetic
    public var jikotlinScope: CoroutineScope = CoroutineScope(dispatcher.io())

    @JvmStatic
    public var jikotlinTimeoutMillis: Long? = null
}