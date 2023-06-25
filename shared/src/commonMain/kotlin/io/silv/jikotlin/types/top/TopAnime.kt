package io.silv.jikotlin.types.top

import io.silv.jikotlin.types.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopAnime(
    val data: List<TopAnimeData>,
    val pagination: Pagination
) {

    @Serializable
    data class TopAnimeData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        val images: TopAnimeImages,
        val trailer: TopAnimeTrailer,
        val approved: Boolean = false,
        val titles: List<TopAnimeTitle> = emptyList(),
        val title: String = "",
        @SerialName("title_english")
        val titleEnglish: String = "",
        @SerialName("title_japanese")
        val titleJapanese: String = "",
        @SerialName("title_synonyms")
        val titleSynonyms: List<String> = emptyList(),
        val type: String = "",
        val source: String = "",
        val episodes: Int = 0,
        val status: String = "",
        val airing: Boolean = false,
        val aired: TopAnimeAired,
        val duration: String = "",
        val rating: String = "",
        val score: Int = 0,
        @SerialName("scored_by")
        val scoredBy: Int = 0,
        val rank: Int = 0,
        val popularity: Int = 0,
        val members: Int = 0,
        val favorites: Int = 0,
        val synopsis: String = "",
        val background: String = "",
        val season: String = "",
        val year: Int = 0,
        val broadcast: TopAnimeBroadcast,
        val producers: List<TopAnimeGenericInfo> = emptyList(),
        val licensors: List<TopAnimeGenericInfo> = emptyList(),
        val studios: List<TopAnimeGenericInfo> = emptyList(),
        val genres: List<TopAnimeGenericInfo> = emptyList(),
        @SerialName("explicit_genres")
        val explicitGenres: List<TopAnimeGenericInfo> = emptyList(),
        val themes: List<TopAnimeGenericInfo> = emptyList(),
        val demographics: List<TopAnimeGenericInfo> = emptyList()
    ) {
        @Serializable
        data class TopAnimeGenericInfo(
            @SerialName("mal_id")
            val malId: Int = 0,
            val type: String = "",
            val name: String = "",
            val url: String = ""
        )

        @Serializable
        data class TopAnimeBroadcast(
            val day: String = "",
            val time: String = "",
            val timezone: String = "",
            val string: String = ""
        )

        @Serializable
        data class TopAnimeAired(
            val from: String = "",
            val to: String = "",
            val prop: TopAnimeProp
        ) {

            @Serializable
            data class TopAnimeProp(
                val from: PropValues,
                val to: PropValues,
                val string: String = ""
            )

            @Serializable
            data class PropValues(
                val day: Int = 0,
                val month: Int = 0,
                val year: Int = 0,
            )
        }

        @Serializable
        data class TopAnimeImages(
            val jpg: TopAnimeJpg,
            val webp: TopAnimeWebp
        ) {

            @Serializable
            data class TopAnimeJpg(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
                @SerialName("large_image_url")
                val largeImageUrl: String = ""
            )

            @Serializable
            data class TopAnimeWebp(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
                @SerialName("large_image_url")
                val largeImageUrl: String = ""
            )
        }

        @Serializable
        data class TopAnimeTrailer(
            @SerialName("youtube_id")
            val youtubeId: String = "",
            val url: String = "",
            @SerialName("embed_url")
            val embedUrl: String = ""
        )

        @Serializable
        data class TopAnimeTitle(
            val type: String = "",
            val title: String = ""
        )
    }
}