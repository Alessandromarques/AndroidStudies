package com.example.previewbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.materialIcon
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    // Column principal
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(16.dp),
        Arrangement.spacedBy(16.dp)
    ) {
        // Box com fundo colorido
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Olá! Eu estou dentro de uma Box", fontSize = 18.sp)
            // Ícone sobreposto no canto superior direito
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Ícone estrela",
                tint = Color.Yellow,
                modifier = Modifier
                    .align(Alignment.TopEnd) // posiciona no canto superior direito
                    .padding(8.dp)
            )
        }

        // Row com dois botões
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(onClick = { /* ação do botão 1 */ }, modifier = Modifier.weight(1f)) {
                Text("Botão 1")
            }
            Button(onClick = { /* ação do botão 2 */ }, modifier = Modifier.weight(1f)) {
                Text("Botão 2")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(onClick = { /* ação do botão 3    */ }, modifier = Modifier.weight(30f)) {
                Text("Botão 3")
            }
        }

        // Texto final fora da Row
        Text(text = "Este é um texto abaixo da Row", fontSize = 16.sp)
        Row( modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End)
        {
            Text(text = "Este é um texto abaixo da Row", fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true) // habilita preview com fundo
//@Preview(name = "Modo Claro", showBackground = true)
//@Preview(name = "Modo Escuro", showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewBoxComSobreposicao() {
    MyApp()
}