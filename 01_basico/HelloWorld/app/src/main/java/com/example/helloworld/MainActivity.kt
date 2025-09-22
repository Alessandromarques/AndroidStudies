package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldApp()
        }
    }
}

@Composable
fun HelloWorldApp() {
    // Estado da mensagem
    var mensagem by remember { mutableStateOf("Nenhuma ação ainda") }

    // Layout da tela
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Text(text = "Meu Primeiro Compose App", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        // Botão
        Button(onClick = {
            mensagem = "Você clicou no botão!"
        }) {
            Text("Clique aqui")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Mensagem dinâmica
        Text(text = mensagem, style = MaterialTheme.typography.bodyLarge)
    }
}