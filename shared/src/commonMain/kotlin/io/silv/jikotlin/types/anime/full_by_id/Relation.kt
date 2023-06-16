package io.silv.jikotlin.types.anime.full_by_id


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Relation(
    @SerialName("entry")
    val entry: List<Entry>,
    @SerialName("relation")
    val relation: String
)