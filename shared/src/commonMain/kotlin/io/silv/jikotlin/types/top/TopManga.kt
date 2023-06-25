package io.silv.jikotlin.types.top

import io.silv.jikotlin.types.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopManga(
    val data: List<TopMangaData>,
    val pagination: Pagination
) {

    @Serializable
    data class TopMangaData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        val images: TopMangaImages,
        val approved: Boolean = false,
        val titles: List<TopMangaTitle>,
        val title: String = "",
        @SerialName("title_english")
        val titleEnglish: String = "",
        @SerialName("title_japanese")
        val titleJapanese: String = "",
        @SerialName("title_synonyms")
        val titleSynonyms: List<String> = emptyList(),
        val type: String = "",
        val chapters: Int = 0,
        val volumes: Int = 0,
        val status: String = "",
        val publishing: Boolean = false,
        val published: TopMangaPublished,
        val score: Int = 0,
        @SerialName("scored_by")
        val scoredBy: Int = 0,
        val rank: Int = 0,
        val popularity: Int = 0,
        val members: Int = 0,
        val favorites: Int = 0,
        val synopsis: String = "",
        val background: String = "",
        val authors: List<TopMangaGenericInfo>,
        val serializations: List<TopMangaGenericInfo>,
        val genres: List<TopMangaGenericInfo> = emptyList(),
        @SerialName("explicit_genres")
        val explicitGenres: List<TopMangaGenericInfo> = emptyList(),
        val themes: List<TopMangaGenericInfo> = emptyList(),
        val demographics: List<TopMangaGenericInfo> = emptyList()
    ) {
        @Serializable
        data class TopMangaGenericInfo(
            @SerialName("mal_id")
            val malId: Int = 0,
            val type: String = "",
            val name: String = "",
            val url: String = ""
        )

        @Serializable
        data class TopMangaPublished(
            val from: String = "",
            val to: String = "",
            val prop: TopMangaProp
        ) {

            @Serializable
            data class TopMangaProp(
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
        data class TopMangaTitle(
            val type: String = "",
            val title: String = ""
        )

        @Serializable
        data class TopMangaImages(
            val jpg: TopMangaJpg,
            val webp: TopMangaWebp
        ) {

            @Serializable
            data class TopMangaJpg(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
                @SerialName("large_image_url")
                val largeImageUrl: String = ""
            )

            @Serializable
            data class TopMangaWebp(
                @SerialName("image_url")
                val imageUrl: String = "",
                @SerialName("small_image_url")
                val smallImageUrl: String = "",
                @SerialName("large_image_url")
                val largeImageUrl: String = ""
            )
        }
    }
}
