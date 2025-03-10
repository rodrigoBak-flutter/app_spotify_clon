package com.todolist.appspotifyclon

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.todolist.appspotifyclon.ui.theme.AppSpotifyClonTheme

class MainActivity : ComponentActivity() {

    private  lateinit var  navHostController: NavHostController
    private  lateinit var  auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        auth = Firebase.auth
        setContent {
            navHostController = rememberNavController()
            AppSpotifyClonTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationWrapper(navHostController, auth)
                   }
                }
            }


        }
    override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        if (currentUser!=null){
            //TODO: navegar a la HOME
            Log.i("auth", "Estoy Logado")
        }
    }
    }


