package com.diamount_studio.linguaswipe.app_options

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.diamount_studio.linguaswipe.app_options.util.Screen
import com.diamount_studio.common.features.tinder_cards.presentation.TinderCards

@Composable
fun HomeScreen(navController: NavController) {
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("English Learning App") },
                backgroundColor = MaterialTheme.colors.primary
            )
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            //TinderCards()

//            Image(
//                painter = painterResource(id = R.drawable.logo),
//                contentDescription = "Logo",
//                modifier = Modifier.size(100.dp)
//            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Choose an Option",
                fontWeight = FontWeight.Bold,
                fontSize = MaterialTheme.typography.h5.fontSize
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                ) {
                HomeOption(
                    optionName = "Vocabulary Builder",
                    isSelected = selectedItem == 0,
                    onClick = { selectedItem = 0 },
                    icon = Icons.Filled.Book
                )
                Spacer(modifier = Modifier.width(16.dp))
                HomeOption(
                    optionName = "Grammar",
                    isSelected = selectedItem == 1,
                    onClick = { selectedItem = 1
                        navController.navigate(Screen.GrammarScreen.route)
                    },
                    icon = Icons.Filled.Edit
                )
            }
        }
        it.calculateBottomPadding()
    }
}

@Composable
fun HomeOption(
    optionName: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector
) {
    val colors = MaterialTheme.colors
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .height(120.dp)
            .clickable(onClick = onClick)
//            .weight(1)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = optionName,
            tint = if (isSelected) colors.secondary else colors.onBackground.copy(alpha = 0.6f),
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = optionName,
            color = if (isSelected) colors.secondary else colors.onBackground.copy(alpha = 0.6f),
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.subtitle1.fontSize
        )
    }
}