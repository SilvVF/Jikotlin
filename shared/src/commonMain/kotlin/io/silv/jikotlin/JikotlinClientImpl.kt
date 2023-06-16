package io.silv.jikotlin

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.silv.jikotlin.params.AnimeFilter
import io.silv.jikotlin.params.AnimeRating
import io.silv.jikotlin.params.AnimeType
import io.silv.jikotlin.params.MangaFilter
import io.silv.jikotlin.params.MangaType
import io.silv.jikotlin.params.QueryParam
import io.silv.jikotlin.params.StringParam
import io.silv.jikotlin.types.anime.by_id.AnimeByIdResponse
import io.silv.jikotlin.types.anime.full_by_id.AnimeFullByIdResponse
import io.silv.jikotlin.types.top.top_anime.TopAnimeResponse
import io.silv.jikotlin.types.top.top_manga.TopMangaResponse
import io.silv.jikotlin.types.top.top_people.TopPeopleResponse
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import kotlin.coroutines.CoroutineContext


class JikotlinClientImpl(
    private val client: HttpClient,
    private val baseUrl: String = JikotlinInitializer.baseUrl,
    private val dispatcher: CoroutineContext = JikotlinInitializer.jikotlinScope.coroutineContext
) {

    private val timeout = JikotlinInitializer.jikotlinTimeoutMillis

    private suspend fun HttpClient.getWithTimeout(
        urlString: String,
        block: HttpRequestBuilder.() -> Unit = {}
    ): HttpResponse {
        return if (timeout != null){
            withTimeout(timeout) {
                get(
                    urlString = urlString,
                    block = block
                )
            }
        } else get(
            urlString = urlString,
            block = block
        )
    }

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

        client.getWithTimeout(
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

        client.getWithTimeout(
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

        client.getWithTimeout(
            urlString = QueryParam.buildUrl(
                baseUrl = "$baseUrl/top/characters",
                queryParams = listOf(pageParam, limitParam)
            )
        )
            .body()
    }

    suspend fun getAnimeFullById(
        id: Int
    ): AnimeFullByIdResponse = withContext(dispatcher) {

        client.getWithTimeout(
            urlString = "$baseUrl/anime/$id/full"
        )
            .body()
    }

    suspend fun getAnimeById(
        id: Int
    ): AnimeByIdResponse = withContext(dispatcher) {

        client.getWithTimeout(
            urlString = "$baseUrl/anime/$id"
        )
            .body()
    }
}