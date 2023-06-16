package io.silv.jikotlin.types.top_people


import io.silv.jikotlin.types.shared.Images
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("about")
    val about: String,
    @SerialName("alternate_names")
    val alternateNames: List<String>,
    @SerialName("birthday")
    val birthday: String,
    @SerialName("family_name")
    val familyName: String,
    @SerialName("favorites")
    val favorites: Int,
    @SerialName("given_name")
    val givenName: String,
    @SerialName("images")
    val images: TopPeopleImages,
    @SerialName("mal_id")
    val malId: Int,
    @SerialName("name")
    val name: String,
    @SerialName("url")
    val url: String,
    @SerialName("website_url")
    val websiteUrl: String?
)