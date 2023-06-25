package io.silv.jikotlin.types.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeCharacters(
    val data: List<AnimeCharacterData>
) {

    @Serializable
    data class AnimeCharacterData (
        val character: AnimeCharacter,
        val role: String = "",
        val voiceActors: List<VoiceActor> = emptyList()
    ) {
        @Serializable
        data class VoiceActor(
            val person: Person,
            val language: String = ""
        ) {

            @Serializable
            data class Person(
                @SerialName("mal_id")
                val malId: Int = 0,
                val url: String = "",
                val images: Images,
                val name: String = ""
            ) {

                @Serializable
                data class Images(
                    val jpg: Jpg
                ) {
                    @Serializable
                    data class Jpg(
                        @SerialName("image_url")
                        val imageUrl: String = ""
                    )
                }
            }
        }

        @Serializable
        data class AnimeCharacter(
            val malId: Int = 0,
            val url: String = "",
            val images: AnimeCharacterImages,
            val name: String = "",
        ) {

            @Serializable
            data class AnimeCharacterImages(
                val jpg: Jpg,
                val webp: Webp
            ) {

                @Serializable
                data class Jpg(
                    @SerialName("image_url")
                    val imageUrl: String = "",
                    @SerialName("small_image_url")
                    val smallImageUrl: String = "",
                )

                @Serializable
                data class Webp(
                    @SerialName("image_url")
                    val imageUrl: String = "",
                    @SerialName("small_image_url")
                    val smallImageUrl: String = "",
                )
            }
        }
    }
}