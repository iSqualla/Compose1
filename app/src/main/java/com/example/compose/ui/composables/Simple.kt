package com.example.compose.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Greeting(name: String?, navController: NavHostController) {
    val newName = remember{ mutableStateOf(TextFieldValue()) }
    Column{
        Text(text = "Hello $name!", fontSize = 30.sp)
        TextField(value = newName.value, onValueChange = {input -> newName.value = input})
        Button(onClick = { navController.navigate("greeting/${newName.value.text}") }) {
            Text(text = "Say hello to someone new!")
        }
    }
}
