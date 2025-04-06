package com.example.testplanify.launchView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.testplanify.Components.CircleWithImage
import com.example.testplanify.Components.CircleWithImage2
import com.example.testplanify.Components.buttonLogin
import com.example.testplanify.Components.buttonLoginGoogle
import com.example.testplanify.Components.buttonRegister
import com.example.testplanify.Components.ellipseBottom
import com.example.testplanify.Components.ellipseTop
import com.example.testplanify.Components.logo
import com.example.testplanify.R
import com.example.testplanify.ui.theme.PrimaryColor
import com.example.testplanify.ui.theme.SecondColor


@Composable
fun launchView(modifier: Modifier) {
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
            Spacer(modifier = Modifier.height(250.dp))
            logo()
            CircleWithImage2()
            Spacer(modifier = Modifier.height(30.dp))
        }
        Box(
            modifier = Modifier.align(Alignment.BottomStart)
        ){
            ellipseBottom()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun previewLaunch() {
    launchView(modifier = Modifier)
}
