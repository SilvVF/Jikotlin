package io.silv.jikotlin.types.top_manga


import io.silv.jikotlin.types.shared.Demographic
import io.silv.jikotlin.types.shared.Images
import io.silv.jikotlin.types.shared.Theme
import io.silv.jikotlin.types.shared.Title
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("approved")
    val approved: Boolean,
    @SerialName("authors")
    val authors: List<Author>,
    @SerialName("background")
    val background: String,
    @SerialName("chapters")
    val chapters: Int?,
    @SerialName("demographics")
    val demographics: List<Demographic>,
    @SerialName("explicit_genres")
    val explicitGenres: List<String>,
    @SerialName("favorites")
    val favorites: Int,
    @SerialName("genres")
    val genres: List<Genre>,
    @SerialName("images")
    val images: Images,
    @SerialName("mal_id")
    val malId: Int,
    @SerialName("members")
    val members: Int,
    @SerialName("popularity")
    val popularity: Int,
    @SerialName("published")
    val published: Published,
    @SerialName("publishing")
    val publishing: Boolean,
    @SerialName("rank")
    val rank: Int,
    @SerialName("score")
    val score: Double,
    @SerialName("scored")
    val scored: Double,
    @SerialName("scored_by")
    val scoredBy: Int,
    @SerialName("serializations")
    val serializations: List<Serialization>,
    @SerialName("status")
    val status: String,
    @SerialName("synopsis")
    val synopsis: String,
    @SerialName("themes")
    val themes: List<Theme>,
    @SerialName("title")
    val title: String,
    @SerialName("title_english")
    val titleEnglish: String?,
    @SerialName("title_japanese")
    val titleJapanese: String,
    @SerialName("title_synonyms")
    val titleSynonyms: List<String>,
    @SerialName("titles")
    val titles: List<Title>,
    @SerialName("type")
    val type: String,
    @SerialName("url")
    val url: String,
    @SerialName("volumes")
    val volumes: Int?
)