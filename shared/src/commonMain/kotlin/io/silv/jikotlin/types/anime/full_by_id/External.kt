package io.silv.jikotlin.types.anime.full_by_id


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class External(
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String
)