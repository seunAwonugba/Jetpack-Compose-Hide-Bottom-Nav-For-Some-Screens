package com.example.nestedbottomnavigation.sealedclassscreens

sealed class AuthScreens(val route : String){
    object LoginScreen : AuthScreens("login_screen")
    object SignUpScreen : AuthScreens("sign_up_screen")
    object ForgotPasswordScreen : AuthScreens("forgot_password_screen")

}
