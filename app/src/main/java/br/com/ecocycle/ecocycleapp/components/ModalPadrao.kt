package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun ModalPadrao(
    title: String,
    titleFontSize: TextUnit,
    textComponent: @Composable() (() -> Unit),
    onDismissRequest: () -> Unit,
    confirmButton: @Composable() (() -> Unit)? = {},
) {
    AlertDialog(
        title = {
            Text(
                text = title,
                fontSize = titleFontSize,
                color = colorResource(id = R.color.primary),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        },
        text = textComponent,
        containerColor = colorResource(id = R.color.modal_background),
        confirmButton = confirmButton?: {},
        dismissButton = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                BotaoPadrao(
                    onClick = { /*TODO*/ },
                    text = "OK",
                    width = 100,
                    contentFontSize = 12,
                    height = 35,
                )
            }
        },
        onDismissRequest = onDismissRequest,

    )
}