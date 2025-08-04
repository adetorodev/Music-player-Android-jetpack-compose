package com.ezadetoro.musicplayer.ui

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ezadetoro.musicplayer.R


@Composable
fun SplashScreen(onStartClick: () -> Unit) {
    Box(
        modifier =
            Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.intro_pic),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter),
            contentScale = ContentScale.Crop
        )

        Button(
            onClick = onStartClick,
            modifier = Modifier
                .padding(top = 48.dp, start = 24.dp, end = 24.dp)
                .align(Alignment.TopCenter)
                .height(height = 50.dp),
            colors = ButtonDefaults.buttonColors(
                colorResource(R.color.orange)
            ),
            shape = RoundedCornerShape(size = 25.dp)
        ) {
            Text(
                text = stringResource(R.string.getStarted),
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}



@Composable
@Preview(showSystemUi = true)
fun SplashScreenPreview() {
    SplashScreen(onStartClick = {})
}