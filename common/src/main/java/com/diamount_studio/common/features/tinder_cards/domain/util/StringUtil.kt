package com.diamount_studio.common.features.tinder_cards.domain.util

import com.diamount_studio.common.features.tinder_cards.lib.Direction


fun stringFrom(direction: Direction): String {
    return when (direction) {
        Direction.Left -> "Left 👈"
        Direction.Right -> "Right 👉"
        Direction.Up -> "Up 👆"
        Direction.Down -> "Down 👇"
    }
}

