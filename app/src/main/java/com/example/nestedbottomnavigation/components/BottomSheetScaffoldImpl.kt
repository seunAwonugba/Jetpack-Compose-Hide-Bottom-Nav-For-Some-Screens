package com.example.nestedbottomnavigation.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nestedbottomnavigation.navgraph.homenavgraph.HomeNavGraph
import com.example.nestedbottomnavigation.sealedclassscreens.bottombarsealedclassscreens.BottomBarScreens

@Composable
fun BottomSheetScaffoldImpl(navController : NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) {
        HomeNavGraph(navController = navController)

    }
    
}

@Composable
fun BottomBar(navController: NavHostController) {

    //these are the only screens that must display bottom nav
    val screens = listOf(
        BottomBarScreens.Home,
        BottomBarScreens.Profile,
        BottomBarScreens.Settings,
        BottomBarScreens.Favourites
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomBarDestination = screens.any {
        it.route == currentDestination?.route
    }

    if (bottomBarDestination){
        BottomNavigation {
            screens.forEach {
                AddItem(
                    screens = it,
                    currentDestination = currentDestination,
                    navController = navController
                )
                
            }
        }
    }
}

@Composable
fun RowScope.AddItem(
    screens: BottomBarScreens,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        selected = currentDestination?.hierarchy?.any {
                                                      it.route == screens.route
        } == true,
        onClick = {
                  navController.navigate(screens.route){
                      popUpTo(navController.graph.findStartDestination().id)
                      launchSingleTop = true
                  }
        },
        label = {
            Text(text = screens.title)
        },
        icon = {
            Icon(
                imageVector = screens.icon,
                contentDescription = screens.title
            )
        },
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
    )
    
}