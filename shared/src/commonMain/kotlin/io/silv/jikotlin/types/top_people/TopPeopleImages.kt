package io.silv.jikotlin.types.top_people

import io.silv.jikotlin.types.shared.JpgSingle
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopPeopleImages(

    @SerialName("image_url")
    val images: JpgSingle
)