package com.example.testplanify.launchView

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testplanify.Components.CircleWithImage
import com.example.testplanify.Components.buttonLogin
import com.example.testplanify.Components.buttonLoginGoogle
import com.example.testplanify.Components.buttonRegister
import com.example.testplanify.Components.ellipseBottom
import com.example.testplanify.Components.ellipseTop
import com.example.testplanify.Components.logo
import com.example.testplanify.letterStles
import com.example.testplanify.ui.theme.PrimaryColor

@Composable
fun launchView2(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(PrimaryColor),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier.align(Alignment.TopEnd)
        ){
            ellipseTop()
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Spacer(modifier = Modifier.height(120.dp))
            logo()
            CircleWithImage()
            Spacer(modifier = Modifier.height(31.dp))
            textWelcome()
            Spacer(modifier = Modifier.height(30.dp))
            buttonLogin()
            Spacer(modifier = Modifier.height(7.dp))
            buttonLoginGoogle()
            Spacer(modifier = Modifier.height(7.dp))
            buttonRegister()
        }
        Box(
            modifier = Modifier.align(Alignment.BottomStart)
        ){
            ellipseBottom()
        }
    }
}


@Composable
fun textWelcome(){
    Text(
        text = "Bienvenido a Planify. Gestiona tus finanzas de forma fácil y eficiente. Inicia sesión y toma el control de tu dinero.",
        color = Color.White,
        textAlign = TextAlign.Center,
        style = TextStyle(fontFamily = letterStles.AmaranthFont, fontSize = 18.sp),
        modifier = Modifier.fillMaxWidth(0.75f)
    )
}




@Preview(showBackground = true)
@Composable
fun PreviewLaunch2() {
    launchView2(modifier = Modifier)
}