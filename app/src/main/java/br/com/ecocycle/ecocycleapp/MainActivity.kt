package br.com.ecocycle.ecocycleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.components.BotaoPadrao
import br.com.ecocycle.ecocycleapp.components.ModalPadrao
import br.com.ecocycle.ecocycleapp.ui.theme.EcoCycleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcoCycleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RenderScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RenderScreen() {
    val context = LocalContext.current

    var showDialog by remember { mutableStateOf(false) }

    fun showAlertDialog() {
        showDialog = true
    }

    fun closeAlertDialog() {
        showDialog = false
    }

    Column {
        // Botão para exibir o AlertDialog
        Button(
            onClick = { showAlertDialog() },
            modifier = Modifier
                .padding(16.dp)
                .background(colorResource(id = R.color.primary)),
            colors = ButtonDefaults.buttonColors(contentColor = Color.White)
        ) {
            Text(text = "Mostrar Pop-up")
        }

        if (showDialog) {
            ModalPadrao(
                title = "Teste",
                titleFontSize = 24.sp,
                textComponent = { Column {
                    Text(text = "teste")
                    Text(text = "TETE")
                }},
                onDismissRequest = {}
            )
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComponentPreview(){
    RenderScreen()
}
