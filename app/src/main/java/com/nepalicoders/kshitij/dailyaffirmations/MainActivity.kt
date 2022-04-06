package com.nepalicoders.kshitij.dailyaffirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nepalicoders.kshitij.dailyaffirmations.presentation.common.AppBaseTheme
import com.nepalicoders.kshitij.dailyaffirmations.presentation.ui.theme.DailyAffirmationsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppBaseTheme {
                Greeting(name = "Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DailyAffirmationsTheme {
        Greeting("Android")
    }
}
