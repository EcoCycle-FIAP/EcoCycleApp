package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import br.com.ecocycle.ecocycleapp.R

@Composable
fun ModalPadrao(
    title: String,
    titleFontSize: TextUnit,
    modalContent: @Composable (() -> Unit),
    onDismissRequest: () -> Unit,
    confirmButton: @Composable (() -> Unit)? = {},
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
        text = modalContent,
        containerColor = colorResource(id = R.color.modal_background),
        confirmButton = confirmButton?: {},
        dismissButton = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(),
            ) {
                BotaoPadrao(
                    onClick = onDismissRequest,
                    text = "OK",
                    width = 80,
                    contentFontSize = 12,
                    height = 35,
                )
            }
        },
        onDismissRequest = onDismissRequest,

    )
}