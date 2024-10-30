package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LemonadeApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LemonadeApp() {
    var step by remember { mutableIntStateOf(1) }
    var squeezeTime by remember { mutableIntStateOf(0) }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Lemonade",
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = colorResource(R.color.light_yellow)
                )
            )
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.tertiaryContainer),
            color = MaterialTheme.colorScheme.background
        ) {
            when (step) {
                1 -> {
                    TextAndImageLayout(R.drawable.lemon_tree,
                        R.string.Lemon_tree,
                        R.string.Lemon_tree,
                        onClickImage = {
                            step = 2
                            squeezeTime = (2..4).random()
                        })
                }

                2 -> {
                    TextAndImageLayout(R.drawable.lemon_squeeze, R.string.Lemon, R.string.Lemon,
                        onClickImage = {
                            squeezeTime--
                            if (squeezeTime == 0) {
                                step = 3
                            }
                        })
                }

                3 -> {
                    TextAndImageLayout(R.drawable.lemon_restart,
                        R.string.Empty_glass,
                        R.string.Empty_glass,
                        onClickImage = {
                            step = 4
                        })
                }

                4 -> {
                    TextAndImageLayout(R.drawable.lemon_drink,
                        R.string.Glass_of_lemonade,
                        R.string.Glass_of_lemonade,
                        onClickImage = {
                            step = 1
                        })
                }
            }
        }
    }
}
@Composable
fun TextAndImageLayout(imageId: Int, textId: Int, descriptionId: Int, onClickImage: () -> Unit,modifier: Modifier = Modifier ) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = onClickImage,
                    shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner_radius)),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.light_green))) {
                Image(
                    painter = painterResource(imageId),
                    contentDescription = stringResource(descriptionId),
                    modifier = Modifier
                        .width(dimensionResource(R.dimen.button_image_width))
                        .height(dimensionResource(R.dimen.button_image_height))
                        .padding(dimensionResource(R.dimen.button_interior_padding))
                )
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Text(
                text = stringResource(textId),
                fontSize = 18.sp
            )
        }
    }
}

@Preview (showBackground = true)
@Composable
fun Preview() {
    LemonadeTheme {
        LemonadeApp()
    }
}