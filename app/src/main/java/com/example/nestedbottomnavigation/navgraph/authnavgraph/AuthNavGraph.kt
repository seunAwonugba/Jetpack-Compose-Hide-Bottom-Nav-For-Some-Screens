package com.example.nestedbottomnavigation.navgraph.authnavgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestedbottomnavigation.Graph
import com.example.nestedbottomnavigation.navgraph.authnavgraph.screens.LoginScreen
import com.example.nestedbottomnavigation.navgraph.authnavgraph.screens.ForgotPasswordScreen
import com.example.nestedbottomnavigation.navgraph.authnavgraph.screens.SignUpScreen
import com.example.nestedbottomnavigation.sealedclassscreens.AuthScreens

fun NavGraphBuilder.authNavGraph(navController: NavHostController){
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreens.LoginScreen.route
    ){
        composable(route = AuthScreens.LoginScreen.route){
            //when you click login you go to the home nav graph
            LoginScreen(
                navToHomeScreen = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                navToSignUpScreen = {
                    navController.navigate(AuthScreens.SignUpScreen.route)
                },
                navToForgotPasswordScreen = {
                    navController.navigate(AuthScreens.ForgotPasswordScreen.route)
                }
            )
        }

        //when you click sign up you navigate to the sign up screen

        composable(route = AuthScreens.SignUpScreen.route){
            SignUpScreen()
        }

        //when you click forgot password, you navigate to the forgot password screen

        composable(route = AuthScreens.ForgotPasswordScreen.route){
            ForgotPasswordScreen()
        }
    }
}