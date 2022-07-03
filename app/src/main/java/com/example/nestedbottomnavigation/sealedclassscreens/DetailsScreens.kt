package com.example.nestedbottomnavigation.sealedclassscreens

sealed class DetailsScreens(val route : String){
    object DetailsScreen : DetailsScreens("details_screen")
    object InformationScreen : DetailsScreens("information_screen")
}
