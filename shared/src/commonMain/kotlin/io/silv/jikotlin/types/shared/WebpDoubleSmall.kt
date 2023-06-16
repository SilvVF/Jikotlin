package io.silv.jikotlin.types.shared

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WebpDoubleSmall(
    @SerialName("image_url")
    val imageUrl: String,

    @SerialName("small_image_url")
    val smallImageUrl: String
)