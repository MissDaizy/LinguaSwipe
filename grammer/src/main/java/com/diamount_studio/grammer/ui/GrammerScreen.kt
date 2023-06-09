package com.diamount_studio.grammer.ui

import androidx.compose.runtime.Composable
import com.diamount_studio.common.features.tinder_cards.presentation.TinderCardsScreen

@Composable
fun GrammarScreen() {
    val colorPalette = GrammarColorPalette()
    TinderCardsScreen(colorPalette)
    // add other components for the Grammar module here
}