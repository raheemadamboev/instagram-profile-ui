package xyz.teamgravity.instagramprofileui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter

data class ImageTextModel(
    @DrawableRes val imageId: Int,
    val text: String
)
