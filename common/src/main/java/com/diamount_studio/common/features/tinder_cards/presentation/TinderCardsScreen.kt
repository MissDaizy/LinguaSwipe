package com.diamount_studio.common.features.tinder_cards.presentation

import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.diamount_studio.common.features.swipeable_cards.presentation.ui.theme.LinguaSwipeTheme
import com.diamount_studio.common.theme.ColorPalette

@Composable
fun TinderCardScreen(colorPalette: ColorPalette) {
    // use the colorPalette to set the colors of the components
        LinguaSwipeTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(colorPalette.background)
                ) {
                    // add Tinder cards components here
                    TinderCards(colorPalette)
                }
            }
        }


}