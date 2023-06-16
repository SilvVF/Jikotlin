package io.silv.jikotlin.types.top_characters


import io.silv.jikotlin.types.shared.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopCharacterResponse(
    @SerialName("data")
    val data: List<Data>,
    @SerialName("pagination")
    val pagination: Pagination
)