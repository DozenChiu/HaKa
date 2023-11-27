package com.example.myapplication

// Home.kt
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Home(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("這是首頁")
            Spacer(modifier = Modifier.height(64.dp))
            Button(onClick = { navController.navigate("learning") }) {
                Text("前往學習區")
            }
            Spacer(modifier = Modifier.height(64.dp))
            Button(onClick = { navController.navigate("quiz") }) {
                Text("前往測驗區")
            }
        }
    }
}
