package com.todolist.appspotifyclon.presentation.login

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.auth.FirebaseAuth
import com.todolist.appspotifyclon.R
import com.todolist.appspotifyclon.ui.theme.Black
import com.todolist.appspotifyclon.ui.theme.Green
import com.todolist.appspotifyclon.ui.theme.SelectedField
import com.todolist.appspotifyclon.ui.theme.UnselectedField


@Composable
fun LoginScreen(auth: FirebaseAuth) {
    var email:String by remember{ mutableStateOf("") }
    var password:String by remember{ mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Black)
        .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {  Icon(painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "",
            tint = White,
            modifier = Modifier.padding(vertical = 24.dp)
                .size(24.dp)
        )
            Spacer(modifier = Modifier.weight(1f))
        }

        Text(text = stringResource(id = R.string.email),
            color = White, fontWeight = FontWeight.Bold,
            fontSize = 40.sp)
        TextField(value = email,
            onValueChange = {email = it},
            modifier = Modifier
                .fillMaxWidth(),
            colors = TextFieldDefaults
                .colors(
                    unfocusedTextColor = UnselectedField,
                    focusedContainerColor = SelectedField
                )
        )
        Spacer(modifier = Modifier.height(48.dp))
        Text(text = stringResource(id = R.string.password),
            color = White,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp)
        TextField(value = password,
            onValueChange = {password = it},modifier = Modifier
                .fillMaxWidth(),
            colors = TextFieldDefaults
                .colors(
                    unfocusedTextColor = UnselectedField,
                    focusedContainerColor = SelectedField
                ))
        Spacer(modifier = Modifier.height(48.dp))
        Button(onClick = {
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener{
               if(it.isSuccessful){
                   //TODO navegar
                   Log.i("auth", "Login OK")
               }else{
                   Log.i("auth", "Login ERROR")
               }

            }

        },modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Green)
            ) {
            Text(text = stringResource(id = R.string.login_initial),
                color = Black,
                fontWeight = FontWeight.Bold)
        }
    }
}

