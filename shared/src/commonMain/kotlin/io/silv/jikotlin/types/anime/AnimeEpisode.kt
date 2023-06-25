package io.silv.jikotlin.types.anime

import io.silv.jikotlin.types.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
class AnimeEpisode(
    val data: List<AnimeEpisodeData>,
    val pagination: Pagination
) {
    @Serializable
    data class Pagination (
        @SerialName("last_visible_page")
        val lastVisiblePage: Int = 0,
        @SerialName("has_next_page")
        val hasNextPage: Boolean = false
    )

    @Serializable
    data class AnimeEpisodeData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        val title: String = "",
        @SerialName("title_japanese")
        val titleJapanese: String = "",
        @SerialName("title_romanji")
        val titleRomanji: String = "",
        val duration: Int = 0,
        val aired: String = "",
        val filler: Boolean = false,
        val recap: Boolean = false,
        @SerialName("forum_url")
        val forumUrl: String = ""
    )
}