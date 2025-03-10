package com.todolist.appspotifyclon.shared

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.todolist.appspotifyclon.R
import com.todolist.appspotifyclon.ui.theme.BackgroundButton
import com.todolist.appspotifyclon.ui.theme.ShapeButton


@Composable
fun CustomButton(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(horizontal = 32.dp)
            .background(BackgroundButton)
            .border(2.dp, ShapeButton, CircleShape),
        contentAlignment = Alignment.CenterStart,

    ){
        Image(painter = painterResource(id = R.drawable.google)
            , contentDescription = "",
            modifier = Modifier.padding(start = 16.dp).size(16.dp)
        )
        Text(text = "", color = Color.White, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
    }
}