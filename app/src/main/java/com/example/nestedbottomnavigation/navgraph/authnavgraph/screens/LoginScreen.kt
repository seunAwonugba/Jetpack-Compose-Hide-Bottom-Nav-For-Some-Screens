package com.example.nestedbottomnavigation.navgraph.authnavgraph.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(
    navToHomeScreen : () -> Unit,
    navToSignUpScreen : () -> Unit,
    navToForgotPasswordScreen : () -> Unit,
) {
    Scaffold(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column {
            Text(
                text = "Login Screen",
                fontSize = 32.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navToHomeScreen() }) {
                Text(text = "To Home Screen")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navToSignUpScreen() }) {
                Text(text = "To SignUp Screen")
            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { navToForgotPasswordScreen() }) {
                Text(text = "To Forgot Password Screen")
            }
        }

    }

    
}