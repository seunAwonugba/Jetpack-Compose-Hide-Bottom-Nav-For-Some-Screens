package com.example.nestedbottomnavigation.navgraph.detailsnavgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.nestedbottomnavigation.Graph
import com.example.nestedbottomnavigation.sealedclassscreens.DetailsScreens

fun NavGraphBuilder.detailsNavGraph(navController : NavHostController){
    navigation(
        startDestination = DetailsScreens.DetailsScreen.route,
        route = Graph.DETAILS
    ){
        composable(route = DetailsScreens.DetailsScreen.route){
            DetailsScreen(
                navToInformationScreen = {
                    navController.navigate(DetailsScreens.InformationScreen.route)
                }
            )
        }

        composable(route = DetailsScreens.InformationScreen.route){
            InformationScreen()

        }
    }
}

//@Composable
//fun DetailsNavGraph(navController : NavHostController = rememberNavController()){
//    NavHost(
//        navController = navController,
//        startDestination = DetailsScreens.DetailsScreen.route
//    ){
//        composable(route = DetailsScreens.DetailsScreen.route){
//            DetailsScreen(
//                navToInformationScreen = {
//                    navController.navigate(DetailsScreens.InformationScreen.route)
//                }
//            )
//        }
//
//        composable(route = DetailsScreens.InformationScreen.route){
//            InformationScreen()
//
//        }
//
//    }
//
//}