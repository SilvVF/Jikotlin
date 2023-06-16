package io.silv.jikotlin

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.silv.jikotlin.params.AnimeFilter
import io.silv.jikotlin.params.AnimeRating
import io.silv.jikotlin.params.AnimeType
import io.silv.jikotlin.params.MangaFilter
import io.silv.jikotlin.params.MangaType
import io.silv.jikotlin.params.QueryParam
import io.silv.jikotlin.params.StringParam
import io.silv.jikotlin.types.top_anime.TopAnimeResponse
import io.silv.jikotlin.types.top_manga.TopMangaResponse
import io.silv.jikotlin.types.top_people.TopPeopleResponse
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext


class JikotlinClientImpl(
    private val client: HttpClient,
    private val baseUrl: String = JikotlinInitializer.baseUrl,
    private val dispatcher: CoroutineContext = JikotlinInitializer.jikotlinScope.coroutineContext
) {

    suspend fun getTopAnime(
        type: AnimeType? = null,
        filter: AnimeFilter? = null,
        rating: AnimeRating? = null,
        sfw: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): TopAnimeResponse = withContext(dispatcher) {

        val sfwParam: QueryParam? = StringParam.get("sfw", sfw)
        val pageParam: QueryParam? = StringParam.get("page", page)
        val limitParam: QueryParam? = StringParam.get("limit", limit)

        client.get(
            urlString = QueryParam.buildUrl(
                baseUrl = "$baseUrl/top/anime",
                queryParams = listOf(type, filter, rating, sfwParam, pageParam, limitParam)
            )
        )
            .body()
    }

    suspend fun getTopManga(
        type: MangaType? = null,
        filter: MangaFilter? = null,
        page: Int? = null,
        limit: Int? = null,
    ): TopMangaResponse = withContext(dispatcher) {

        val pageParam: QueryParam? = StringParam.get("page", page)
        val limitParam: QueryParam? = StringParam.get("limit", limit)

        client.get(
            urlString = QueryParam.buildUrl(
                baseUrl = "$baseUrl/top/manga",
                queryParams = listOf(type, filter, pageParam, limitParam)
            )
        )
            .body()
    }

    suspend fun getTopPeople(
        page: Int? = null,
        limit: Int? = null,
    ): TopPeopleResponse = withContext(dispatcher) {

        val pageParam: QueryParam? = StringParam.get("page", page)
        val limitParam: QueryParam? = StringParam.get("limit", limit)

        client.get(
            urlString = QueryParam.buildUrl(
                baseUrl = "$baseUrl/top/people",
                queryParams = listOf(pageParam, limitParam)
            )
        )
            .body()
    }

    suspend fun getTopCharacters(
        page: Int? = null,
        limit: Int? = null,
    ): TopPeopleResponse = withContext(dispatcher) {

        val pageParam: QueryParam? = StringParam.get("page", page)
        val limitParam: QueryParam? = StringParam.get("limit", limit)

        client.get(
            urlString = QueryParam.buildUrl(
                baseUrl = "$baseUrl/top/characters",
                queryParams = listOf(pageParam, limitParam)
            )
        )
            .body()
    }
}