package com.example.nestedbottomnavigation.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestedbottomnavigation.Graph
import com.example.nestedbottomnavigation.components.BottomSheetScaffoldImpl
import com.example.nestedbottomnavigation.navgraph.authnavgraph.authNavGraph
import com.example.nestedbottomnavigation.navgraph.homenavgraph.screens.HomeScreen
import com.example.nestedbottomnavigation.sealedclassscreens.AuthScreens
import com.example.nestedbottomnavigation.sealedclassscreens.DetailsScreens
import com.example.nestedbottomnavigation.sealedclassscreens.bottombarsealedclassscreens.BottomBarScreens

@Composable
fun RootNavigationGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTHENTICATION
    ){
        authNavGraph(navController = navController)
        composable(
            route = Graph.HOME
        ){
            BottomSheetScaffoldImpl()
        }
    }
    
}