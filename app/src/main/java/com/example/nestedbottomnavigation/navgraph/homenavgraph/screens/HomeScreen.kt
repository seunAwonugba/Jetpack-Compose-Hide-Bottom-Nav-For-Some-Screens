package com.example.nestedbottomnavigation.navgraph.homenavgraph.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    navToDetailsScreen : () -> Unit,
) {
    Scaffold(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "Home Screen",
                fontSize = 32.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navToDetailsScreen() }) {
                Text(text = "To Details Screen")
            }
        }

    }


}