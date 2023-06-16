package io.silv.jikotlin.types.anime.full_by_id


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeFullByIdResponse(
    @SerialName("data")
    val data: Data
)