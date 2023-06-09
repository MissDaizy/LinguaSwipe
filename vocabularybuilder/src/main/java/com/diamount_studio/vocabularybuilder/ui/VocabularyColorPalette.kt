package com.diamount_studio.vocabularybuilder.ui

import androidx.compose.ui.graphics.Color
import com.diamount_studio.common.features.swipeable_cards.presentation.ui.theme.Purple40
import com.diamount_studio.common.theme.ColorPalette

class VocabularyColorPalette(
    override val primary: Color = Color(0xFF0066CC),
    override val secondary: Color = Color(0xFF33B5E5),
    override val background: Color = Color(0xFFFFFFFF),
    override val colorButton: Color = Color(Purple40.value)
) : ColorPalette