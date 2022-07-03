package com.example.nestedbottomnavigation.navgraph.homenavgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nestedbottomnavigation.Graph
import com.example.nestedbottomnavigation.navgraph.detailsnavgraph.detailsNavGraph
import com.example.nestedbottomnavigation.navgraph.homenavgraph.screens.FavouritesScreen
import com.example.nestedbottomnavigation.navgraph.homenavgraph.screens.HomeScreen
import com.example.nestedbottomnavigation.navgraph.homenavgraph.screens.ProfileScreen
import com.example.nestedbottomnavigation.navgraph.homenavgraph.screens.SettingsScreen
import com.example.nestedbottomnavigation.sealedclassscreens.bottombarsealedclassscreens.BottomBarScreens

@Composable
fun HomeNavGraph(navController : NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreens.Home.route,
        route = Graph.HOME
    ){
        composable(route = BottomBarScreens.Home.route){
            HomeScreen(
                navToDetailsScreen = {
                    navController.navigate(Graph.DETAILS)
                }
            )
        }

        composable(route = BottomBarScreens.Profile.route){
            ProfileScreen()
        }
        composable(route = BottomBarScreens.Settings.route){
            SettingsScreen()
        }
        composable(route = BottomBarScreens.Favourites.route){
            FavouritesScreen()
        }

//        composable(route = Graph.DETAILS){
//            DetailsNavGraph()
//        }
        detailsNavGraph(navController = navController)

    }

}

//fun NavGraphBuilder.homeNavGraph(navController: NavHostController){
//    navigation(
//        startDestination = BottomBarScreens.Home.route,
//        route = Graph.HOME
//    ){
//        composable(route = BottomBarScreens.Home.route){
//            HomeScreen(
//                navToDetailsScreen = {
//                    navController.navigate(Graph.DETAILS)
//                }
//            )
//        }
//
//        composable(route = BottomBarScreens.Profile.route){
//            ProfileScreen()
//        }
//        composable(route = BottomBarScreens.Settings.route){
//            SettingsScreen()
//        }
//    }
//}