package io.silv.jikotlin.types.anime.by_id


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