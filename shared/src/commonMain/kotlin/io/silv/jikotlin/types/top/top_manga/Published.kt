package io.silv.jikotlin.types.top.top_manga


import io.silv.jikotlin.types.shared.Prop
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Published(
    @SerialName("from")
    val from: String,
    @SerialName("prop")
    val prop: Prop,
    @SerialName("string")
    val string: String,
    @SerialName("to")
    val to: String?
)