package com.todolist.appspotifyclon.presentation.initial

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.todolist.appspotifyclon.R
import com.todolist.appspotifyclon.shared.CustomButton
import com.todolist.appspotifyclon.ui.theme.Black
import com.todolist.appspotifyclon.ui.theme.Gray
import com.todolist.appspotifyclon.ui.theme.Green

@Preview
@Composable
fun InitialScreen(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Gray, Black), startY = 0f, endY = 600f)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Image(painter = painterResource(id = R.drawable.spotify)
            , contentDescription = ""
            , modifier = Modifier.clip(CircleShape))
        Spacer(modifier = Modifier.weight(1f))
        Text(stringResource(id = R.string.title_initial),
            color = Color.White,
            fontSize = 38.sp,
            fontWeight = FontWeight.Bold
        )
        Text(stringResource(id = R.string.subtitle_initial),
            color = Color.White,
            fontSize = 38.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {}
            ,modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .padding(horizontal = 32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Green)

        ) {
            Text(text = stringResource(id = R.string.sing_up_app),
                color = Black,
                )
        }
        Spacer(modifier = Modifier.height(8.dp))
        CustomButton()
        Spacer(modifier = Modifier.height(8.dp))
        CustomButton()
        Spacer(modifier = Modifier.height(8.dp))
    }
}


