package io.silv.jikotlin.types.top

import io.silv.jikotlin.types.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopReviews(
    val data: TopReviewData
) {

    @Serializable
    data class TopReviewData(
        val data: List<ReviewData>,
        val pagination: Pagination
    ) {

        @Serializable
        data class ReviewData(
            val user: TopReviewUser,
            val anime: TopReviewAnime,
            @SerialName("mal_id")
            val malId: Int = 0,
            val url: String = "",
            val type: String,
            val reactions: TopReviewReactions,
            val date: String = "",
            val review: String = "",
            val score: Int = 0,
            val tags: List<String>,
            @SerialName("is_spoiler")
            val isSpoiler: Boolean = false,
            @SerialName("is_preliminary")
            val isPreliminary: Boolean = false,
            @SerialName("episodes_watched")
            val episodesWatched: Int = 0
        ) {

            @Serializable
            data class TopReviewReactions(
                val overall: Int = 0,
                val nice: Int = 0,
                @SerialName("love_it")
                val loveIt: Int = 0,
                val funny: Int = 0,
                val confusing: Int = 0,
                val informative: Int = 0,
                @SerialName("well_written")
                val wellWritten: Int = 0,
                val creative: Int = 0
            )

            @Serializable
            data class TopReviewAnime(
                @SerialName("mal_id")
                val malId: Int = 0,
                val url: String = "",
                val images: TopReviewAnimeImages,
                val title: String = ""
            ) {

                @Serializable
                data class TopReviewAnimeImages(
                    val jpg: TopReviewAnimeJpg,
                    val webp: TopReviewAnimeWebp
                ) {

                    @Serializable
                    data class TopReviewAnimeJpg(
                        @SerialName("image_url")
                        val imageUrl: String = "",
                        @SerialName("small_image_url")
                        val smallImageUrl: String = "",
                        @SerialName("large_image_url")
                        val largeImageUrl: String = ""
                    )

                    @Serializable
                    data class TopReviewAnimeWebp(
                        @SerialName("image_url")
                        val imageUrl: String = "",
                        @SerialName("small_image_url")
                        val smallImageUrl: String = "",
                        @SerialName("large_image_url")
                        val largeImageUrl: String = ""
                    )
                }
            }

            @Serializable
            data class TopReviewUser(
                val username: String = "",
                val url: String = "",
                val images: TopReviewUserImages
            ) {

               @Serializable
               data class TopReviewUserImages(
                   val jpg: TopReviewUserJpg,
                   val webp: TopReviewUserWebp
               ) {
                   @Serializable
                   data class TopReviewUserJpg(
                       @SerialName("image_url")
                       val imageUrl: String = ""
                   )
                   @Serializable
                   data class TopReviewUserWebp(
                       @SerialName("image_url")
                       val imageUrl: String = ""
                   )
               }
            }
        }
    }
}