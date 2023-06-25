package io.silv.jikotlin.types.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeForum(
    val data: List<AnimeForumData>
) {

    @Serializable
    data class AnimeForumData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        val title: String = "",
        val date: String = "",
        @SerialName("author_username")
        val authorUsername: String = "",
        @SerialName("author_url")
        val authorUrl: String = "",
        val comments: Int = 0,
        @SerialName("last_comment")
        val lastComment: LastComment
    ) {

        @Serializable
        data class LastComment(
            val url: String = "",
            @SerialName("author_username")
            val authorUsername: String = "",
            @SerialName("author_url")
            val authorUrl: String = "",
            val date: String = ""
        )
    }
}
