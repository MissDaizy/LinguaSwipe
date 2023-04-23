package com.diamount_studio.common.features.tinder_cards.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diamount_studio.common.features.tinder_cards.presentation.MatchProfile

@Composable
 fun ProfileCard(
    modifier: Modifier,
    matchProfile: MatchProfile,
) {
    Card(modifier, backgroundColor = Color.Transparent) {
        Box {

            // The previous image of the library
//            Image(contentScale = ContentScale.Crop,
//                modifier = Modifier.fillMaxSize(),
//                painter = painterResource(matchProfile.drawableResId),
//                contentDescription = null)

            GifImage(
                modifier=modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                drawableResId = matchProfile.drawableResId
            )

            Scrim(Modifier.align(Alignment.BottomCenter))

            Column(Modifier.align(Alignment.BottomStart)) {
                Text(text = matchProfile.name,
                    color = MaterialTheme.colors.primary,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(10.dp))
            }

        }

    }
}