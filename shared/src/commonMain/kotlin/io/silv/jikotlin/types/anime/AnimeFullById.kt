package io.silv.jikotlin.types.anime

import io.silv.jikotlin.types.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeFullById(
    val data: AnimeFullByIdData,
) {

    @Serializable
    data class AnimeFullByIdData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        val images: AnimeFullByIdImages,
        val trailer: AnimeTrailer,
        val approved: Boolean = false,
        val titles: List<AnimeTitle> = emptyList(),
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
        val aired: AnimeAired,
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
        val broadcast: AnimeBroadcast,
        val producers: List<AnimeGenericInfo> = emptyList(),
        val licensors: List<AnimeGenericInfo> = emptyList(),
        val studios: List<AnimeGenericInfo> = emptyList(),
        val genres: List<AnimeGenericInfo> = emptyList(),
        @SerialName("explicit_genres")
        val explicitGenres: List<AnimeGenericInfo> = emptyList(),
        val themes: List<AnimeGenericInfo> = emptyList(),
        val demographics: List<AnimeGenericInfo> = emptyList(),
        val relations: List<AnimeRelation> = emptyList(),
        val theme: AnimeTheme,
        val external: List<Item> = emptyList(),
        val streaming: List<Item> = emptyList()
    ) {

        @Serializable
        data class Item(
            val name: String = "",
            val url: String = ""
        )

        @Serializable
        data class AnimeTheme(
            val openings: List<String> = emptyList(),
            val ending: List<String> = emptyList()
        )

        @Serializable
        data class AnimeRelation(
            val relation: String = "",
            val entry: List<AnimeGenericInfo> = emptyList()
        )

        @Serializable
        data class AnimeGenericInfo(
            @SerialName("mal_id")
            val malId: Int = 0,
            val type: String = "",
            val name: String = "",
            val url: String = ""
        )

        @Serializable
        data class AnimeBroadcast(
            val day: String = "",
            val time: String = "",
            val timezone: String = "",
            val string: String = ""
        )

        @Serializable
        data class AnimeAired(
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
        data class AnimeFullByIdImages(
            val jpg: AnimeJpg,
            val webp: AnimeWebp
        ) {

            @Serializable
            data class AnimeJpg(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
                @SerialName("large_image_url")
                val largeImageUrl: String = ""
            )

            @Serializable
            data class AnimeWebp(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
                @SerialName("large_image_url")
                val largeImageUrl: String = ""
            )
        }

        @Serializable
        data class AnimeTrailer(
            @SerialName("youtube_id")
            val youtubeId: String = "",
            val url: String = "",
            @SerialName("embed_url")
            val embedUrl: String = ""
        )

        @Serializable
        data class AnimeTitle(
            val type: String = "",
            val title: String = ""
        )
    }
}