package com.todolist.appspotifyclon

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.firebase.auth.FirebaseAuth
import com.todolist.appspotifyclon.presentation.initial.InitialScreen
import com.todolist.appspotifyclon.presentation.login.LoginScreen
import com.todolist.appspotifyclon.presentation.singup.SingUpScreen


@Composable
fun NavigationWrapper(navHostController: NavHostController, auth: FirebaseAuth) {

    NavHost(navController = navHostController, startDestination = "initial"){
        composable("initial"){
            InitialScreen(
                navigateToLogin = {navHostController.navigate("logIn")},
                navigateToSingUp = {navHostController.navigate("singUp")}
            )
        }
        composable("logIn"){
            LoginScreen(auth)
        }
        composable("singUp"){
            SingUpScreen(auth)
        }

    }

}