package io.silv.jikotlin.types.top_characters

import io.silv.jikotlin.types.shared.JpgDoubleSmall
import io.silv.jikotlin.types.shared.WebpDoubleSmall
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopCharactersImages(
    @SerialName("jpg")
    val jpg: JpgDoubleSmall,

    @SerialName("webp")
    val webp: WebpDoubleSmall
)


