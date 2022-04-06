package com.nepalicoders.kshitij.dailyaffirmations.presentation.common

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nepalicoders.kshitij.dailyaffirmations.presentation.ui.theme.DailyAffirmationsTheme

@Composable
fun AppBaseTheme(content: @Composable () -> Unit) {
    DailyAffirmationsTheme(useDarkTheme = true) {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            content()
        }
    }
}
