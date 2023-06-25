package io.silv.jikotlin.types.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeEpisodeById(
    val data: AnimeEpisodeData
) {

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
        val synopsis: String = ""
    )
}