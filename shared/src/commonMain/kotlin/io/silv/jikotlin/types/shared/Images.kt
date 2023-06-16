package io.silv.jikotlin.types.shared


import io.silv.jikotlin.types.shared.Jpg
import io.silv.jikotlin.types.shared.Webp
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Images(
    @SerialName("jpg")
    val jpg: Jpg,
    @SerialName("webp")
    val webp: Webp
)