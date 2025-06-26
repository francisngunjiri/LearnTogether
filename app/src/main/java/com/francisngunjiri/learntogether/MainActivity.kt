package com.francisngunjiri.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.francisngunjiri.learntogether.ui.theme.LearnTogetherTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    ContentPage(
                        title = stringResource(R.string.title),
                        paragraphone = stringResource(R.string.paragraph_one),
                        paragraphtwo = stringResource(R.string.paragraph_two),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun ContentPage(title:String, paragraphone:String,paragraphtwo:String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier,
        verticalArrangement = Arrangement.Top){
        Image(
            painter = image,
            contentDescription = stringResource(R.string.background_image_description),
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(all = 16.dp)
        )
        Text(
            text = paragraphone,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify

        )
        Text(
            text = paragraphtwo,
            fontSize = 14.sp,
            modifier = Modifier.padding(all = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun ContentPagePreview() {
    LearnTogetherTheme {
        ContentPage(
            title = stringResource(R.string.title),
            paragraphone = stringResource(R.string.paragraph_one),
            paragraphtwo = stringResource(R.string.paragraph_two)
        )
    }
}
