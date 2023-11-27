package com.example.myapplication
// QuizArea.kt
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun QuizArea(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("這是測驗區")
            Spacer(modifier = Modifier.height(64.dp))
            Button(
                onClick = { navController.navigate("home") },
                modifier = Modifier
                    .padding(16.dp)
                    .size(100.dp)
                    .padding(start = 16.dp, top = 16.dp) // 调整左上方距离
            ) {
                Text("回首頁")
            }
            Spacer(modifier = Modifier.height(64.dp))
            Button(onClick = { navController.navigate("learning") }) {
                Text("前往學習區")
            }
        }
    }
}

/*
// QuizArea.kt
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun QuizArea(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("這是測驗區")
            Spacer(modifier = Modifier.height(16.dp))
            Text("點擊左上角按鈕返回首頁")
        }
    }
}
*/