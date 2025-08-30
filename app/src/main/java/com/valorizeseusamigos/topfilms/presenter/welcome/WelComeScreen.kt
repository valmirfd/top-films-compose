package com.valorizeseusamigos.topfilms.presenter.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.valorizeseusamigos.topfilms.R
import com.valorizeseusamigos.topfilms.ui.theme.TopFilmsTheme

@Composable
fun WelComeScreen() {
    WelComeContent()
}

@Composable
fun WelComeContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(TopFilmsTheme.colorScheme.backgroundColor),
    ){
        Image(
            painter = painterResource(id = R.drawable.placeholder_welcome),
            null,
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.background_gradient),
            null,
            modifier = Modifier
                .align(Alignment.BottomCenter)

        )
    }
}

@Preview
@Composable
private fun WelComePreview() {
    WelComeContent()
}