package com.valorizeseusamigos.topfilms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.valorizeseusamigos.topfilms.presenter.screens.welcome.WelComeScreen
import com.valorizeseusamigos.topfilms.presenter.theme.TopFilmsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TopFilmsTheme {
                WelComeScreen()

            }
        }
    }
}

