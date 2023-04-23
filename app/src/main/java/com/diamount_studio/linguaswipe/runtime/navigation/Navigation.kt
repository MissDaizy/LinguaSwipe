package com.diamount_studio.linguaswipe.runtime.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.diamount_studio.linguaswipe.app_options.HomeScreen
import com.diamount_studio.linguaswipe.app_options.util.Screen

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController(),
//    subscriptionViewModel: SubscriptionViewModel = hiltViewModel(),
) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {

        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.GrammarScreen.route) {
            GrammarScreen()
        }
    }
}

