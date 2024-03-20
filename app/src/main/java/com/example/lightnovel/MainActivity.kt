package com.example.lightnovel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lightnovel.ui.theme.LightNovelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LightNovelTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun ButtonComponent(onClick: () -> Unit, text: String) {
    Button(onClick = onClick,
        ) {
        Text(text = text)
    }
}

@Composable
fun Greeting() {
    var state by remember {
        mutableStateOf(false)
    }

    Column {
        for(num in 1..10) {
            ButtonComponent(onClick = { state = !state }, text = "$state$num")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LightNovelTheme {
        Greeting()
    }
}