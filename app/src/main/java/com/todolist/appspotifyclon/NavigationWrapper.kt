package com.todolist.appspotifyclon

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.todolist.appspotifyclon.presentation.initial.InitialScreen
import com.todolist.appspotifyclon.presentation.login.LoginScreen
import com.todolist.appspotifyclon.presentation.singup.SingUpScreen


@Composable
fun NavigationWrapper(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = "initial"){
        composable("initial"){
            InitialScreen()
        }
        composable("login"){
            LoginScreen()
        }
        composable("singup"){
            SingUpScreen()
        }

    }

}