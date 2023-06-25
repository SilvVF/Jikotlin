package io.silv.jikotlin.params.top

import io.silv.jikotlin.params.QueryParam


sealed class AnimeType(param: String): QueryParam("anime_search_query_type", param) {
    object TV: AnimeType("tv")
    object Movie: AnimeType("movie")
    object OVA: AnimeType("ova")
    object Special: AnimeType("special")
    object ONA: AnimeType("ona")
    object Music: AnimeType("music")
}

sealed class AnimeRating(param: String): QueryParam("anime_search_query_rating", param) {
    object G: AnimeRating("g")
    object PG: AnimeRating("pg")
    object PG13: AnimeRating("pg13")
    object R17: AnimeRating("r17")
    object R: AnimeRating("r")
    object Hentai: AnimeRating("rx")
}


sealed class AnimeFilter(param: String): QueryParam("top_anime_filter", param) {
    object Airing: AnimeFilter("airing")
    object Upcoming: AnimeFilter("upcoming")
    object ByPopularity: AnimeFilter("bypopularity")
    object Favorite: AnimeFilter("favorite")
}