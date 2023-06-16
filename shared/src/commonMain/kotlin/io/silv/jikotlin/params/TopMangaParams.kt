package io.silv.jikotlin.params

sealed class MangaType(param: String): QueryParam("manga_search_query_type", param) {
    object Manga: MangaType("manga")
    object Novel: MangaType("novel")
    object LightNovel: MangaType("lightnovel")
    object OneShot: MangaType("oneshot")
    object Doujin: MangaType("doujin")
    object Manhwa: MangaType("manhwa")
    object Manhua: MangaType("manhua")
}

sealed class MangaFilter(param: String): QueryParam("top_manga_filter", param) {
    object Publishing: MangaFilter("publishing")
    object Upcoming: MangaFilter("upcoming")
    object ByPopularity: MangaFilter("bypopularity")
    object Favorite: MangaFilter("favorite")
}