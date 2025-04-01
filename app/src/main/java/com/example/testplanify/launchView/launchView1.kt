package com.example.testplanify.launchView

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.testplanify.R
import com.example.testplanify.ui.theme.PrimaryColor
import com.example.testplanify.ui.theme.SecondColor


@Composable
fun launchView(modifier: Modifier) {
    ConstraintLayout(
        modifier= modifier
            .fillMaxSize()
            .background(PrimaryColor)
    ) {
        val (circleTop, circleBottom, circleCenter, logo) = createRefs()
        Box(
            modifier = modifier
                .padding(all = 5.dp)
                .size(274.dp)
                .background(SecondColor, shape = CircleShape)
                .constrainAs(circleCenter) {
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                },
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagelaunch),
                contentDescription = "Image Center",
                modifier = Modifier.size(236.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.logolaunch),
            contentDescription = "Logo aplication",
            modifier = Modifier
                .width(330.dp)
                .height(110.dp)
                .constrainAs(logo) {
                    start.linkTo(circleCenter.start)
                    end.linkTo(circleCenter.end)
                    bottom.linkTo(circleCenter.top)
                    top.linkTo(circleCenter.top)

                }
        )

        Box(
            modifier = modifier
                .size(250.dp)
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

    }
}


/*@Preview(showBackground = true)
@Composable
fun previewLaunch() {
    launchView(modifier = Modifier)
}
 */