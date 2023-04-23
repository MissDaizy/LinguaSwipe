package com.diamount_studio.vocabularybuilder.ui

import androidx.compose.runtime.Composable
import com.diamount_studio.common.features.tinder_cards.presentation.TinderCardsScreen

@Composable
fun VocabularyBuilderScreen() {
    val colorPalette = VocabularyColorPalette()
    TinderCardsScreen(colorPalette)
}