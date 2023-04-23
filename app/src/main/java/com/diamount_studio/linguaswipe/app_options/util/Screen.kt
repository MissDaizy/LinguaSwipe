package com.diamount_studio.linguaswipe.app_options.util

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object GrammarScreen : Screen("grammar_screen")


}