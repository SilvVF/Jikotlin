package io.silv.jikotlin.types.top_anime


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Producer(
    @SerialName("mal_id")
    val malId: Int,
    @SerialName("name")
    val name: String,
    @SerialName("type")
    val type: String,
    @SerialName("url")
    val url: String
)