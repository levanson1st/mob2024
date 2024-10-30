package com.example.greatingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Vertical
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greatingcard.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*GreetingText(
                        message = "Happy Birthday",
                        from = " From son",
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(8.dp),
                    )*/
                    /*GreetingImage(
                        message = stringResource(R.string.happy_birthday_text),
                        from = stringResource(R.string.signature_text),
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(8.dp),
                    )*/
                    /*composeArtical(
                        artical = stringResource(R.string.article),
                        summary = stringResource(R.string.summary),
                        detail = stringResource(R.string.details),
                        bgrImage = painterResource(R.drawable.bg_compose_background),
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    /*taskManager(
                        checkImage = painterResource(R.drawable.ic_task_completed),
                        message = "All tasks completed",
                        message2 = "Nice work!",
                        modifier = Modifier.padding(innerPadding),
                    )*/
                    composeQuadrant(
                        modifier = Modifier.padding(innerPadding),
                    )

                }
            }
        }
    }
}

/*@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column (modifier = modifier, verticalArrangement = Arrangement.Center)  { //row:
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}*/

/*@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box (modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}*/

@Composable
fun composeArtical(artical: String, summary: String, detail: String, bgrImage: Painter, modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        Image(painter = bgrImage, contentDescription = null)
        Text(
            text = artical,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.Start),
        )
        Text(
            text = summary,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = detail,
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun taskManager(checkImage: Painter, message: String, message2: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = checkImage,
            contentDescription = null,
        )
        Text(
            text = message,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
        )
        Text(
            text = message2,
            fontSize = 16.sp,
        )
    }
}

@Composable
fun composeQuadrant(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            infoCard(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.description1),
                bgColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            infoCard(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.description2),
                bgColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            infoCard(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.description3),
                bgColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            infoCard(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.description4),
                bgColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}
@Composable
fun infoCard(title: String, description: String, bgColor: Color, modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()
        .background(bgColor).padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        composeQuadrant()
    }
}

