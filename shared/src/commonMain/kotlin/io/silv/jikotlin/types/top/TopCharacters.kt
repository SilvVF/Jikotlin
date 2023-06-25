package io.silv.jikotlin.types.top

import io.silv.jikotlin.types.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopCharacters(
    val data: List<TopCharacterData>,
    val pagination: Pagination
) {

    @Serializable
    data class TopCharacterData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        val images: TopCharacterImages,
        val name: String ="",
        @SerialName("name_kanji")
        val nameKanji: String = "",
        val nicknames: List<String> = emptyList(),
        val favorites: Int = 0,
        val about: String = ""
    ) {

        @Serializable
        data class TopCharacterImages(
            val jpg: TopCharacterJpg,
            val webp: TopCharacterWebp
        ) {

            @Serializable
            data class TopCharacterJpg(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
            )

            @Serializable
            data class TopCharacterWebp(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
            )
        }
    }
}