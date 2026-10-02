package com.example.shoping_app.screens.home

import android.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.shoping_app.utils.AppStringConstants


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(){
    TopAppBar(
        title = {
            Text(text = AppStringConstants.APP_NAME,
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onPrimary
                ))
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF1565c0),
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        actions = {
            IconButton(onClick = {}) {
              Icon(imageVector =   Icons.Default.ShoppingCart,
                  contentDescription = "Cart",
                  tint =  MaterialTheme.colorScheme.onPrimary
              )
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    tint = MaterialTheme.colorScheme.onPrimary
                )
            }

        }
    )
}