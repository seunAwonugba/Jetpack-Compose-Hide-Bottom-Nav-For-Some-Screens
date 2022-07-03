package com.example.nestedbottomnavigation.sealedclassscreens.bottombarsealedclassscreens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreens(
    val route : String,
    val title : String,
    val icon : ImageVector,
){
    object Home : BottomBarScreens(
        route = "home",
        title = "Home",
        icon = Icons.Rounded.Home
    )
    object Profile : BottomBarScreens(
        route = "profile",
        title = "Profile",
        icon = Icons.Rounded.Person
    )
    object Settings : BottomBarScreens(
        route = "settings",
        title = "Settings",
        icon = Icons.Rounded.Settings
    )
    object Favourites : BottomBarScreens(
        route = "favourites",
        title = "Favourites",
        icon = Icons.Rounded.Favorite
    )
}
