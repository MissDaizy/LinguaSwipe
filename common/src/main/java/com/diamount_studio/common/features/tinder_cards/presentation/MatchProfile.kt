package com.diamount_studio.common.features.tinder_cards.presentation

import androidx.annotation.DrawableRes
import com.diamount_studio.common.R

data class MatchProfile(
    val name: String,
    @DrawableRes val drawableResId: Int,
)

val profiles = listOf(
    MatchProfile("Preserved", R.drawable.gif_preserved),
    MatchProfile("Fun", R.drawable.gif_having_fun),
    MatchProfile("Mortgages", R.drawable.gif_mortgages),
    MatchProfile("Bulb", R.drawable.gif_bulb),
    MatchProfile("Chatter", R.drawable.gif_chatter),
    MatchProfile("Cosmic", R.drawable.gif_cosmic),
    MatchProfile("Frugal", R.drawable.gif_frugal),
    MatchProfile("Invest", R.drawable.gif_invest),
    MatchProfile("Expand", R.drawable.gif_expand),
    MatchProfile("Lean", R.drawable.gif_lean),
//    MatchProfile("Fun", R.drawable.ic_preserved),
//    MatchProfile("Fun", R.drawable.ic_having_fun),
)