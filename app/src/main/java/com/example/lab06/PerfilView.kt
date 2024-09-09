package com.example.lab06

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    // Contenedor principal con un padding alrededor del contenido
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally // Centra el contenido horizontalmente
    ) {
        // Imagen de perfil
        Image(
            painter = painterResource(id = R.drawable.fara), // Reemplaza con tu recurso de imagen
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp) // Tamaño de la imagen
                .clip(CircleShape) // Hace que la imagen sea circular
                .border(2.dp, Color.Gray, CircleShape) // Borde alrededor de la imagen
        )

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre la imagen y el texto

        // Nombre de usuario
        Text(
            text = "Nombre de Usuario",
            style = MaterialTheme.typography.headlineLarge, // Estilo de texto
            fontWeight = FontWeight.Bold // Texto en negrita
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Descripción del perfil
        Text(
            text = "Descripción breve sobre el usuario, intereses o información personal relevante.",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center // Centrar el texto
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Información adicional (seguidores, publicaciones)
        Row(
            horizontalArrangement = Arrangement.SpaceAround, // Distribuye los elementos equitativamente
            modifier = Modifier.fillMaxWidth()
        ) {
            ProfileInfoItem(label = "Seguidores", count = 1200)
            ProfileInfoItem(label = "Siguiendo", count = 150)
            ProfileInfoItem(label = "Publicaciones", count = 45)
        }
    }
}

@Composable
fun ProfileInfoItem(label: String, count: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count.toString(), fontWeight = FontWeight.Bold, style = MaterialTheme.typography.headlineLarge)
        Text(text = label, style = MaterialTheme.typography.bodySmall)
    }
}
