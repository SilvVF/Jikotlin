package io.silv.jikotlin.types.anime.full_by_id


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ThemeX(
    @SerialName("mal_id")
    val malId: Int,
    @SerialName("name")
    val name: String,
    @SerialName("type")
    val type: String,
    @SerialName("url")
    val url: String
)