package io.silv.jikotlin.types.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class AnimeStaff(
    val data: List<AnimeStaffData>
) {

    @Serializable
    data class AnimeStaffData(
        val person: Person,
        val positions: List<String>
    ) {

        @Serializable
        data class Person(
            @SerialName("mal_id")
            val malId: Int = 0,
            val url: String = "",
            val images: Images,
            val name: String = ""
        ) {

            @Serializable
            data class Images(
                val jpg: Jpg
            ) {
                @Serializable
                data class Jpg(
                    @SerialName("image_url")
                    val imageUrl: String = ""
                )
            }
        }
    }
}
