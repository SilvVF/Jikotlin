package io.silv.jikotlin.types.top_characters


import io.silv.jikotlin.types.shared.Images
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("about")
    val about: String,
    @SerialName("favorites")
    val favorites: Int,
    @SerialName("images")
    val images: TopCharactersImages,
    @SerialName("mal_id")
    val malId: Int,
    @SerialName("name")
    val name: String,
    @SerialName("name_kanji")
    val nameKanji: String,
    @SerialName("nicknames")
    val nicknames: List<String>,
    @SerialName("url")
    val url: String
)