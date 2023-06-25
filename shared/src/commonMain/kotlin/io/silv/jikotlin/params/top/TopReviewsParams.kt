package io.silv.jikotlin.params.top

import io.silv.jikotlin.params.QueryParam

sealed class ReviewsType(
    override val value: String
): QueryParam("top_reviews_type_enum", value) {
    object Anime: ReviewsType("anime")
    object Manga: ReviewsType("manga")
}
