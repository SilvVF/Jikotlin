package io.silv.jikotlin.types.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
//TODO(// FINISH data classes)
data class AnimeVideos(
    val data: AnimeVideoData
) {

    @Serializable
    data class AnimeVideoData(
        val promo: List<Promo>,
        val episodes: List<Episode>
    ) {

        @Serializable
        data class Episode(
            @SerialName("mal_id")
            val malId: Int = 0,
            val url: String = "",
            val title: String = "",
            val images: Images
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

        @Serializable
        data class Promo(
            val title: String = "",
            val trailer: Trailer
        ) {

            @Serializable
            data class Trailer(
                @SerialName("youtube_id")
                val youtubeId: String = "",
                val url:  String = "",
                @SerialName("embed_url")
                val embedUrl: String = "",
                val images: Image
            ) {
                @Serializable
                data class Image(
                    @SerialName("image_url")
                    val imageUrl: String = "",
                    @SerialName("small_image_url")
                    val smallImageUrl: String = "",
                    @SerialName("medium_image_url")
                    val mediumImageUrl: String = "",
                    @SerialName("large_image_url")
                    val largeImageUrl: String = "",
                    @SerialName("maximum_image_url")
                    val maximumImageUrl: String = "",
                )
            }
        }
    }
}