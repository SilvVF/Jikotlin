package io.silv.jikotlin.types.anime.by_id


import io.silv.jikotlin.types.shared.To
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Prop(
    @SerialName("from")
    val from: From,
    @SerialName("to")
    val to: To
)