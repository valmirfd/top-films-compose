package com.valorizeseusamigos.topfilms.presenter.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valorizeseusamigos.topfilms.R
import com.valorizeseusamigos.topfilms.presenter.components.button.PrimaryButton
import com.valorizeseusamigos.topfilms.presenter.components.slide.WelcomeSlideUI
import com.valorizeseusamigos.topfilms.presenter.theme.TopFilmsTheme

@Composable
fun WelComeScreen() {
    WelComeContent()
}

@Composable
fun WelComeContent() {
    val slideItems = listOf(
        Pair("Bem-vindo",
            "O melhor aplicativo de streaming de filmes do século para tornar seus dias incríveis!"
        ),
        Pair("Bem-vindo",
            "O melhor aplicativo de streaming de filmes do século para tornar seus dias incríveis!"
        ),
        Pair("Bem-vindo",
            "O melhor aplicativo de streaming de filmes do século para tornar seus dias incríveis!"
        ),

        )
    val pagerState = rememberPagerState {
        slideItems.size
    }

    Scaffold(
        content = {paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = paddingValues.calculateBottomPadding())
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

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    WelcomeSlideUI(
                        modifier = Modifier
                            .weight(1f),
                        slideItems = slideItems,
                        pagerState = pagerState
                    )

                    PrimaryButton(
                        modifier = Modifier
                            .padding(start = 24.dp, end = 24.dp, bottom = 24.dp),
                        text = "Pular",
                        isLoading = false,
                        enabled = true,
                        onClick = {}
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun WelComePreview() {
    WelComeContent()
}