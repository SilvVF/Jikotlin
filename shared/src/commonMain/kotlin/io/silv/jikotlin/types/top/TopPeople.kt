package io.silv.jikotlin.types.top

import io.silv.jikotlin.types.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopPeople(
    val data: List<TopPeopleData>,
    val pagination: Pagination
) {

    @Serializable
    data class TopPeopleData(
        @SerialName("mal_id")
        val malId: Int = 0,
        val url: String = "",
        @SerialName("website_url")
        val websiteUrl: String = "",
        val images: TopPeopleImages,
        val name: String = "",
        @SerialName("given_name")
        val givenName: String ="",
        @SerialName("family_name")
        val familyName: String = "",
        @SerialName("alternate_names")
        val alternateNames: List<String> = emptyList(),
        val birthday: String = "",
        val favorites: Int = 0,
        val about: String = ""
    ) {

        @Serializable
        data class TopPeopleImages(
            val jpg: TopPeopleJpg
        ) {

            @Serializable
            data class TopPeopleJpg(
                @SerialName("image_url")
                val imageUrl: String = ""
            )
        }
    }
}