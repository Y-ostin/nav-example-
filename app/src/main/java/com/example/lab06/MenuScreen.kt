package com.example.lab06

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon as Icon1

@Composable
fun MenuScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Menu Screen",
            fontSize = 24.sp,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Aquí puedes explorar el menú de la aplicación.",
            fontSize = 16.sp,
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(10) { index ->
                ListItem(
                    modifier = Modifier.padding(vertical = 4.dp),
                    headlineContent = { Text(text = "Elemento $index") },
                    supportingContent = { Text(text = "Descripción del elemento $index") },
                    leadingContent = { Icon1(imageVector = Icons.Filled.Menu, contentDescription = "Menu item") }
                )
            }
        }
    }
}
