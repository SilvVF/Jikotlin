package io.silv.jikotlin

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.silv.jikotlin.params.top.AnimeFilter
import io.silv.jikotlin.params.top.AnimeRating
import io.silv.jikotlin.params.top.AnimeType
import io.silv.jikotlin.params.top.MangaFilter
import io.silv.jikotlin.params.top.MangaType
import io.silv.jikotlin.params.QueryParam
import io.silv.jikotlin.params.StringParam
import io.silv.jikotlin.params.top.ReviewsType
import io.silv.jikotlin.types.top.TopAnime
import io.silv.jikotlin.types.top.TopCharacters
import io.silv.jikotlin.types.top.TopManga
import io.silv.jikotlin.types.top.TopPeople
import io.silv.jikotlin.types.top.TopReviews
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeout
import kotlin.coroutines.CoroutineContext


class JikotlinClientImpl(
    private val client: HttpClient,
) {

    private val baseUrl: String = JikotlinInitializer.baseUrl
    private val dispatcher: CoroutineContext = JikotlinInitializer.jikotlinScope.coroutineContext
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
    ): TopAnime = withContext(dispatcher) {

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
    ): TopManga = withContext(dispatcher) {

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
    ): TopPeople = withContext(dispatcher) {

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
    ): TopCharacters = withContext(dispatcher) {

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

    suspend fun getTopReviews(
        page: Int? = null,
        type: ReviewsType? = null,
        preliminary: Boolean? = null,
        spoilers: Boolean? = null
    ): TopReviews = withContext(dispatcher) {

        val pageParam = StringParam.get("page", page)
        val preliminaryParam = StringParam.get("preliminary", preliminary)
        val spoilersParam = StringParam.get("spoilers", spoilers)

        client.getWithTimeout(
            urlString = QueryParam.buildUrl(
                baseUrl = "$baseUrl/top/reviews",
                queryParams = listOf(pageParam, type, preliminaryParam, spoilersParam)
            )
        )
            .body()
    }

}