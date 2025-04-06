package com.example.testplanify.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testplanify.R

@Composable
fun ellipseTop(){
    Image(
        painter = painterResource(id = R.drawable.ellipse),
        contentDescription = "Top Ellipse",
        modifier = Modifier.size(120.dp)
    )
}

@Composable
fun ellipseBottom(){
    Image(
        painter = painterResource(id = R.drawable.ellipse2),
        contentDescription = "Top Ellipse",
        modifier = Modifier.size(120.dp)
    )
}