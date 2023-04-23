package com.diamount_studio.common.features.tinder_cards.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.diamount_studio.common.theme.ColorPalette

@Composable
fun CircleButton(
    colorPalette: ColorPalette,
    onClick: () -> Unit,
    icon: ImageVector,
) {
    IconButton(
        modifier = Modifier
            .clip(CircleShape)
            .background(colorPalette.colorButton)
            .size(56.dp)
            .border(2.dp, colorPalette.colorButton, CircleShape),
        onClick = onClick
    ) {
        Icon(icon, null,
            tint = MaterialTheme.colors.onPrimary)
    }
}
