package com.sam.mycomposables.sample_pages

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesPage() {
    var context = LocalContext.current

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(text = "Favorites", fontSize = 64.sp, modifier = Modifier.clickable {
            Toast.makeText(context, "Hey", Toast.LENGTH_LONG  ).show()
        }.padding(32.dp))
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
        Text(text = "Favorites", fontSize = 64.sp)
    }
}

@Preview(showSystemUi = true)
@Composable
fun FavoritesPagePrev() {
    FavoritesPage()
}