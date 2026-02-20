package com.example.minhacarteirinhadigitalsenai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.minhacarteirinhadigitalsenai.ui.theme.MinhaCarteirinhaDigitalSenaiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MinhaCarteirinhaDigitalSenaiTheme {
                Scaffold { innerPadding ->

                    CarteirinhaDeEstudante(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CarteirinhaDeEstudante(modifier: Modifier = Modifier) {
    Column(modifier= modifier) {
        Image(
            painter = painterResource(R.drawable.senai_sao_paulo_logo),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Row {
            Text(
                text = "Nome:",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "Willian Bruno",
                modifier= Modifier.padding(start = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "Curso",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "DEV",
                modifier = Modifier.padding(start = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
