package io.silv.jikotlin.types.anime.full_by_id


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Theme(
    @SerialName("endings")
    val endings: List<String>,
    @SerialName("openings")
    val openings: List<String>
)