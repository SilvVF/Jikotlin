package io.silv.jikotlin.params.top

import io.silv.jikotlin.params.QueryParam

sealed class MangaType(
    override val value: String
): QueryParam("manga_search_query_type",  value) {
    object Manga: MangaType("manga")
    object Novel: MangaType("novel")
    object LightNovel: MangaType("lightnovel")
    object OneShot: MangaType("oneshot")
    object Doujin: MangaType("doujin")
    object Manhwa: MangaType("manhwa")
    object Manhua: MangaType( "manhua")
}

sealed class MangaFilter(
    override val value: String
): QueryParam("top_manga_filter", value) {
    object Publishing: MangaFilter("publishing")
    object Upcoming: MangaFilter("upcoming")
    object ByPopularity: MangaFilter("bypopularity")
    object Favorite: MangaFilter("favorite")
}