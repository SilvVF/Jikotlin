package io.silv.jikotlin.types.shared

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class JpgSingle(

    @SerialName("image_url")
    val imageUrl: String
)