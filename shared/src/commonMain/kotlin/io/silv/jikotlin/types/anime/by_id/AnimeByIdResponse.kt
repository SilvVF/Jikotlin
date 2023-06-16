package io.silv.jikotlin.types.anime.by_id


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeByIdResponse(
    @SerialName("data")
    val data: Data
)