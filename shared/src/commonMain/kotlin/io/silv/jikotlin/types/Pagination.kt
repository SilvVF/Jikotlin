package io.silv.jikotlin.types

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pagination(
    @SerialName("last_visible_page")
    val lastVisiblePage: Int = 0,
    @SerialName("has_next_page")
    val hasNextPage: Boolean = false,
    val items: PaginationItems
) {

    @Serializable
    data class PaginationItems(
        val count: Int = 0,
        val total: Int = 0,
        @SerialName("per_page")
        val perPage: Int = 0
    )
}
