package com.example.android_pruebas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_pruebas.ui.theme.Android_PruebasTheme

class Actividad2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (
                modifier = Modifier
                    .width(400.dp)
                    .height(400.dp)
                    .background(Color.Black)
                    .border(25.dp, Color.Green)
                    .padding(15.dp)
                    .border(50.dp, Color.Red)
                    .padding(15.dp)
                    .border(75.dp, Color.Blue)
                    .padding(15.dp)
                    .border(100.dp, Color.Yellow)
                    .padding(15.dp)
                ,
            ){
                Text("Sisa")
                Text("Sisa")
                Text("Sisa")
            }
            println("======================================")

        }
    }
}

@Composable
fun Greeting() {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column (
        modifier = Modifier
            .width(400.dp)
            .height(400.dp)
            .background(Color.Black)
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .border(25.dp, Color.Green)
            .padding(15.dp)
            .border(50.dp, Color.Red)
            .padding(15.dp)
            .border(75.dp, Color.Blue)
            .padding(15.dp)
            .border(100.dp, Color.Yellow)
            .padding(15.dp)
            ,
    ){

    }
}