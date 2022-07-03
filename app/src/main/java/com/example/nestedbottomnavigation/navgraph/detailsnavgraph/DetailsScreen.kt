package com.example.nestedbottomnavigation.navgraph.detailsnavgraph

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailsScreen(
    navToInformationScreen : () -> Unit
) {
    Scaffold(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "Details Screen",
                fontSize = 32.sp
            )
            
            Button(onClick = { navToInformationScreen() }) {
                Text(text = "To Information Screen")
                
            }
        }

    }
    
}