package io.silv.jikotlin.types.top.top_people


import io.silv.jikotlin.types.shared.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopPeopleResponse(
    @SerialName("data")
    val data: List<Data>,
    @SerialName("pagination")
    val pagination: Pagination
)