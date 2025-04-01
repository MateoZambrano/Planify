package com.example.testplanify.launchView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.testplanify.R
import com.example.testplanify.letterStles
import com.example.testplanify.ui.theme.FourthColor
import com.example.testplanify.ui.theme.PrimaryColor
import com.example.testplanify.ui.theme.SecondColor



@Composable
fun launchView2(modifier: Modifier = Modifier){

    ConstraintLayout(
        Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .padding(WindowInsets.statusBars.asPaddingValues())
    ) {
        val (circleTop,
            circleBottom,
            circleCenter,
            logo,
            buttonLogin,
            buttonRegister,
            buttonLoginGoogle,
            TextWelcome) = createRefs()
        val topGuide = createGuidelineFromTop(0.1f)
        Box(
            modifier = modifier
                .padding(all = 5.dp)
                .size(192.dp)
                .background(SecondColor, shape = CircleShape)
                .constrainAs(circleCenter) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top, margin = 250.dp)

                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagelaunch),
                contentDescription = "Image Center",
                modifier = Modifier.size(236.dp)
            )
        }

        Text("Bienvenido a Planify. Gestiona tus finanzas de forma fácil y eficiente. Inicia sesión y toma el control de tu dinero.",
            modifier
                .width(250.dp)
                .height(56.dp)
                .constrainAs(TextWelcome) {
                    start.linkTo(circleCenter.start)
                    top.linkTo(circleCenter.bottom, margin =(-32).dp)
                },
            color = Color.White,
            style = TextStyle(fontFamily = letterStles.AmaranthFont),

        )

        Image(
            painter = painterResource(id = R.drawable.logolaunch),
            contentDescription = "Logo aplication",
            modifier = Modifier
                .width(330.dp)
                .height(110.dp)
                .constrainAs(logo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    bottom.linkTo(circleCenter.top, margin = (-50).dp)

                }
        )

        Box(
            modifier = modifier
                .size(250.dp)
                .clip(RoundedCornerShape(150.dp))
                .background(Color.White, shape = CircleShape)
                .constrainAs(circleTop) {
                    end.linkTo(parent.end)
                    start.linkTo(parent.end)
                    bottom.linkTo(parent.top)
                    top.linkTo(parent.top, margin = (-32).dp)
                })

        Box(
            modifier = modifier
                .size(250.dp)
                .background(Color.White, shape = CircleShape)
                .constrainAs(circleBottom) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.start)
                    bottom.linkTo(parent.bottom)
                    top.linkTo(parent.bottom)

                })

        Button(
            onClick = {"Click"},
            modifier
                .width(207.dp)
                .height(45.dp)
                .constrainAs(buttonLogin){
                    start.linkTo(circleCenter.start)
                    end.linkTo(circleCenter.end)
                    top.linkTo(TextWelcome.bottom, margin = (-10).dp)
            },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(FourthColor),
            shape = RoundedCornerShape(10.dp)
        ) {

            Text(
                text="Iniciar Sesión",
                style = TextStyle(fontFamily = letterStles.AmaranthFont, fontSize = 20.sp)
            )
        }

        Button(
            onClick = {"Click"},
            modifier
                .width(212.dp)
                .height(45.dp)
                .constrainAs(buttonLoginGoogle){
                    start.linkTo(buttonLogin.start)
                    end.linkTo(buttonLogin.end)
                    top.linkTo(buttonLogin.bottom, margin = (-32).dp)
                },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(Color.White),
            shape = RoundedCornerShape(10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically, // Centra el contenido
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_googleg_48dp),
                    contentDescription = "Google",
                    modifier = Modifier
                        .size(18.dp) // Tamaño más pequeño
                )

                Spacer(modifier.width(10.dp))

                Text(
                    text = "Inicie sesión Google",
                    style = TextStyle(fontFamily = letterStles.AmaranthFont, fontSize = 16.sp),
                    color = PrimaryColor, // Asegurar que el color sea visible
                    maxLines = 2, //Permite que el texto tenga 2 lineas
                    softWrap = true//Asegurar que el texto se vea dentro del button
                )
            }

        }

        Button(
            onClick = {"Click"},
            modifier
                .width(207.dp)
                .height(45.dp)
                .constrainAs(buttonRegister){
                    start.linkTo(buttonLoginGoogle.start)
                    end.linkTo(buttonLoginGoogle.end)
                    top.linkTo(buttonLoginGoogle.bottom, margin = (-32).dp)
                },
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(SecondColor),
            shape = RoundedCornerShape(10.dp)
        ) {

            Text(
                text="Registrarse",
                color = Color.White,
                style = TextStyle(fontFamily = letterStles.AmaranthFont, fontSize = 20.sp)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLaunch2(){
    launchView2()
}