package com.diamount_studio.common.features.tinder_cards.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.diamount_studio.common.features.tinder_cards.domain.util.stringFrom
import com.diamount_studio.common.features.tinder_cards.lib.Direction
import com.diamount_studio.common.features.tinder_cards.lib.ExperimentalSwipeableCardApi
import com.diamount_studio.common.features.tinder_cards.lib.rememberSwipeableCardState
import com.diamount_studio.common.features.tinder_cards.lib.swipableCard
import com.diamount_studio.common.features.tinder_cards.presentation.components.CircleButton
import com.diamount_studio.common.features.tinder_cards.presentation.components.Hint
import com.diamount_studio.common.features.tinder_cards.presentation.components.ProfileCard
import com.diamount_studio.common.features.tinder_cards.presentation.components.TransparentSystemBars
import com.diamount_studio.common.theme.ColorPalette
import kotlinx.coroutines.launch

@OptIn(ExperimentalSwipeableCardApi::class)
@Composable
fun TinderCards(colorPalette: ColorPalette) {
    TransparentSystemBars()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xfff68084),
                        Color(0xffa6c0fe),
                    )
                )
            )
            .systemBarsPadding()
    ) {
        Box {
            val states = profiles.reversed()
                .map { it to rememberSwipeableCardState() }
            var hint by remember {
                mutableStateOf("Swipe a card or press a button below")
            }

            Hint(hint)

            val scope = rememberCoroutineScope()
            Box(
                Modifier
                    .padding(24.dp)
                    .fillMaxSize()
                    .aspectRatio(1f)
                    .align(Alignment.Center)
            ) {
                states.forEach { (matchProfile, state) ->
                    if (state.swipedDirection == null) {
                            ProfileCard(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .swipableCard(
                                        state = state,
                                        blockedDirections = listOf(Direction.Down),
                                        onSwiped = {
                                            // swipes are handled by the LaunchedEffect
                                            // so that we track button clicks & swipes
                                            // from the same place
                                        },
                                        onSwipeCancel = {
                                            Log.d("Swipeable-Card", "Cancelled swipe")
                                            hint = "You canceled the swipe"
                                        }
                                    ),
                                matchProfile = matchProfile
                            )
                    }
                    LaunchedEffect(matchProfile, state.swipedDirection) {
                        if (state.swipedDirection != null) {
                            hint =
                                "You swiped ${stringFrom(state.swipedDirection!!)}"
                        }
                    }
                }
            }
            Row(
                Modifier
                    .align(Alignment.BottomCenter)
                    .padding(horizontal = 24.dp, vertical = 32.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CircleButton(
                    onClick = {
                        scope.launch {
                            val last = states.reversed()
                                .firstOrNull {
                                    it.second.offset.value == Offset(0f, 0f)
                                }?.second
                            last?.swipe(Direction.Left)
                        }
                    },
                    icon = Icons.Rounded.Close
                )
                CircleButton(
                    onClick = {
                        scope.launch {
                            val last = states.reversed()
                                .firstOrNull {
                                    it.second.offset.value == Offset(0f, 0f)
                                }?.second

                            last?.swipe(Direction.Right)
                        }
                    },
                    icon = Icons.Rounded.Done
                )
            }
        }
    }
}

