package io.silv.jikotlin.types.top.top_manga


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Serialization(
    @SerialName("mal_id")
    val malId: Int,
    @SerialName("name")
    val name: String,
    @SerialName("type")
    val type: String,
    @SerialName("url")
    val url: String
)