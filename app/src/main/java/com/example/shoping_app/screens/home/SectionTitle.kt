package com.example.shoping_app.screens.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.shoping_app.utils.AppDimes

@Composable
fun SectionTitle(title: String, actionText: String, onActionClick: () -> Unit) {

    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = AppDimes.DP_16, vertical = AppDimes.DP_8),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(title, style = MaterialTheme.typography.titleMedium.copy(
            fontWeight = FontWeight.Bold
        ))
        Text(actionText, style = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        ), modifier = Modifier.clickable{
            onActionClick()
        })

    }
}