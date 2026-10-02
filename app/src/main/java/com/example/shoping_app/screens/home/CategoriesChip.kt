package com.example.shoping_app.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import com.example.shoping_app.ui.theme.categoryChipColor
import com.example.shoping_app.utils.AppDimes


@Composable
fun CategoriesChip(
    icon: String,
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit
){
    Card(shape = RoundedCornerShape(AppDimes.DP_16),
        colors = CardDefaults.cardColors(
            containerColor =  if (isSelected)  categoryChipColor
            else  Color.LightGray.copy(alpha = 0.1f)
        ),
        border = BorderStroke(
            width = if (isSelected) 2.dp else 1.dp,
            color = Color.LightGray.copy(alpha = 0.3f)
        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = AppDimes.DP_16, vertical = AppDimes.DP_8))  {
            Icon(painter = rememberAsyncImagePainter(icon), contentDescription = text,
                tint = if (isSelected) Color.White else Color.Black,
                modifier = Modifier.size(AppDimes.DP_20))

            Text(text=text,
                color = if (isSelected) Color.White else Color.Black,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(start = AppDimes.DP_8)

            )
        }

    }
}