package io.silv.jikotlin.types.top_anime


import io.silv.jikotlin.types.shared.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopAnimeResponse(
    @SerialName("data")
    val data: List<Data>,
    @SerialName("pagination")
    val pagination: Pagination
)