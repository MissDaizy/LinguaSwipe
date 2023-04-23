package com.diamount_studio.vocabularybuilder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.diamount_studio.common.features.tinder_cards.lib.ExperimentalSwipeableCardApi
import com.diamount_studio.common.features.tinder_cards.presentation.TinderCards
import com.diamount_studio.common.features.swipeable_cards.presentation.SwipeableCards
import com.diamount_studio.vocabularybuilder.ui.theme.LinguaSwipeTheme

@OptIn(ExperimentalSwipeableCardApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinguaSwipeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                   // SwipeableCards()
                    TinderCards()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LinguaSwipeTheme {
        Greeting("Android")
    }
}





