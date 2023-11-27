package com.example.myapplication

// LearningArea.kt
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
fun LearningArea(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("這是學習區")
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
            Button(onClick = { navController.navigate("quiz") }) {
                Text("前往測驗區")
            }
        }
    }
}

/*
// LearningArea.kt
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
fun LearningArea(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("這是學習區")
            Spacer(modifier = Modifier.height(16.dp))
            Text("點擊左上角按鈕返回首頁")
        }
    }
}
*/