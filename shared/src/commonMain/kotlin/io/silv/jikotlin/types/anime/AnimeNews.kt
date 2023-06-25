package io.silv.jikotlin.types.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeNews(
    val pagination: Pagination,
    val data: List<AnimeNewsData>
) {
    @Serializable
    data class AnimeNewsData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        val title: String = "",
        val date: String = "",
        @SerialName("author_username")
        val authorUsername: String = "",
        @SerialName("author_url")
        val authorUrl: String = "",
        @SerialName("forum_url")
        val forumUrl: String = "",
        val images: Images,
        val comments: Int = 0,
        val excerpt: String = ""
    ) {

        @Serializable
        data class Images(
            val jpg: Jpg
        ) {
            @Serializable
            data class Jpg(
                @SerialName("image_url")
                val imageUrl: String =""
            )
        }
    }

    @Serializable
    data class Pagination (
        @SerialName("last_visible_page")
        val lastVisiblePage: Int = 0,
        @SerialName("has_next_page")
        val hasNextPage: Boolean = false
    )
}