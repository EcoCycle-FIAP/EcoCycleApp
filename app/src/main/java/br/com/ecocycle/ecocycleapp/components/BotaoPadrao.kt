package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun BotaoPadrao(onClick: () -> Unit, text: String) {
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier
            .width(300.dp)
            .height(55.dp),
        shape = RoundedCornerShape(25.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = colorResource(id = R.color.primary), contentColor = colorResource(
                id = R.color.white
            )
        ),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 20.dp),
        border = BorderStroke(1.dp, colorResource(id = R.color.transparent))
    ) {
        Text(text = text, fontSize = 18.sp)
    }
}