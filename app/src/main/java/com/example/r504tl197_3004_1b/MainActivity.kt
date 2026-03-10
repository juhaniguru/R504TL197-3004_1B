package com.example.r504tl197_3004_1b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.r504tl197_3004_1b.ui.theme.R504TL1973004_1BTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            R504TL1973004_1BTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterRoot(modifier = Modifier.fillMaxSize().padding(innerPadding))
                }
            }
        }
    }
}

