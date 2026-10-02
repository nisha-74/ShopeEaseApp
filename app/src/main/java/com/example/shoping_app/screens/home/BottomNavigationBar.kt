package com.example.shoping_app.screens.home

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.shoping_app.utils.AppDimes
import com.example.shoping_app.utils.AppIconConstants
import com.example.shoping_app.utils.AppStringConstants

@Composable
fun BottomNavigationBar() {
    var currentRoute = "home"
    val items = listOf(
        BottomNavItem(title = AppStringConstants.HOME,
            icon = AppIconConstants.HOME,
            route = "home"
        ),
        BottomNavItem(title = AppStringConstants.SEARCH,
            icon = AppIconConstants.SEARCH,
            route = "search"

        ),
        BottomNavItem(title = AppStringConstants.FAVOURITE,
            icon = AppIconConstants.FAVORITE,
            route = "favourite",
            badgeCount = 5
        ),
        BottomNavItem(title = AppStringConstants.CART,
            icon = AppIconConstants.SHOPPING_CART,
            route = "cart"
        ),
        BottomNavItem(title = AppStringConstants.PROFILE,
            icon = AppIconConstants.PROFILE,
            route = "account")

    )
    NavigationBar(modifier = Modifier.height(AppDimes.DP_82),
        containerColor = MaterialTheme.colorScheme.onPrimary,
        tonalElevation = AppDimes.DP_8) {
        items.forEach {
            item->
            NavigationBarItem(
                icon = {
                    //icon with badges
                    if (item.badgeCount != null && item.badgeCount > 0) {
                        BadgedBox(badge = {
                            Badge {
                                Text(text = item.badgeCount.toString())
                            }
                        }) {
                            Icon(imageVector = item.icon,
                                contentDescription = item.title,
                                modifier = Modifier.size(AppDimes.DP_24))
                        }
                    }

                    // icon without badges
                    else {
                        Icon(imageVector = item.icon,
                            contentDescription = item.title,
                            modifier = Modifier.size(AppDimes.DP_24))
                    }
                },
                label = { Text(text = item.title) },
                selected = currentRoute==item.route,
                onClick = {},


            )

        }
    }
}

data class BottomNavItem(
    val title : String,
    val icon : ImageVector,
    val route: String,
    val badgeCount: Int? = 0

    )