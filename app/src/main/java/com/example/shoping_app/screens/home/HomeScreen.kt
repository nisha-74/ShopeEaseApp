package com.example.shoping_app.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.example.shoping_app.model.Category
import com.example.shoping_app.utils.AppDimes

@Composable
fun HomeScreen(){
 Scaffold(
     topBar = {TopAppBar()},
     bottomBar = {BottomNavigationBar()}
 ) {
      paddingValue ->
     Column(modifier = Modifier.fillMaxSize().padding(paddingValue)) {
         //Search Section
         val searchQuery = remember { mutableStateOf("") }
         val focusManager = LocalFocusManager.current
         SearchBar(
             query = searchQuery.value,
             onQueryChange = { searchQuery.value = it },
             onSearch = {
                 // do search logic
             },
             modifier = Modifier.fillMaxWidth().padding(16.dp)
         )

         //search Result section
         // Categories Section
         SectionTitle("Categories", "See All") {

         }
         // Mock the categories
         val categories :List<Category> = listOf(
             Category(1, "Electronics", "https://cdn-icons-png.flaticon.com/512/1555/1555401.png"),
             Category(2, "Clothing", "https://cdn-icons-png.flaticon.com/512/2935/2935183.png"),
         )
      // The selected Category
         val selectedCategory = remember { mutableStateOf(0) }
         LazyRow(contentPadding = PaddingValues(horizontal = AppDimes.DP_16),
             horizontalArrangement = Arrangement.spacedBy(AppDimes.DP_8)) {
             items(categories.size){
                 index->
                 CategoriesChip(icon = categories[index].iconUrl,
                     text = categories[index].name,
                     isSelected = selectedCategory.value == index,
                     onClick = {
                         selectedCategory.value = index
                         /**
                          * Do the navigation logic
                          */
                      })

             }
         }
         Spacer(modifier = Modifier.height(16.dp))
         //Feature Product Section
         SectionTitle("Features", "See All") {

         }
     }
 }

}

@Composable
fun HomeScreenContent(innerPadding: PaddingValues) {
    Text(text = "Demo")
}