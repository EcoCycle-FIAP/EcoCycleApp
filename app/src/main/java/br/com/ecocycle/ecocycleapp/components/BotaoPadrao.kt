package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun BotaoPadrao(
    onClick: () -> Unit,
    text: String,
    width: Int? = 300,
    height: Int? = 55,
    contentFontSize: Int,
    containerColor: Int? = R.color.primary,
    contentColor: Int? = R.color.white,
    elevation: ButtonElevation? = ButtonDefaults.buttonElevation(defaultElevation = 20.dp)
) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .width(width?.dp ?: 300.dp)
            .height(height?.dp ?: 55.dp),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = colorResource(id = containerColor!!), contentColor = colorResource(
                id = contentColor!!
            )
        ),
        elevation = elevation,
        border = BorderStroke(1.dp, colorResource(id = R.color.transparent))
    ) {
        Text(text = text, fontSize = contentFontSize.sp)
    }
}