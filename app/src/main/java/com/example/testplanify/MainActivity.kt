package com.example.testplanify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.testplanify.launchView.launchView
import com.example.testplanify.launchView.launchView2
import com.example.testplanify.loginView.loginView
import com.example.testplanify.ui.theme.TestPlanifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestPlanifyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    launchView(Modifier.padding(innerPadding))
                }
            }
        }
    }
}





