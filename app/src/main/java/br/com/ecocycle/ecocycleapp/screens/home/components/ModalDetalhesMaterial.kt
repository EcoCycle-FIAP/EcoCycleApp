package br.com.ecocycle.ecocycleapp.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.components.ModalPadrao

@Composable
fun ModalDetalhesMaterial(
    onDismissRequest: () -> Unit,
    questionOne: String,
    answerOne: String,
    questionTwo: String,
    answerTwo: String
) {
    ModalPadrao(
        title = "Metal",
        titleFontSize = 24.sp,
        onDismissRequest = onDismissRequest,
        modalContent = {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.metalimg), contentDescription = "")
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = questionOne,
                    color = Color(
                        0xFF289B7E
                    ),
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = answerOne
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = questionTwo,
                    color = Color(
                        0xFF289B7E
                    ),
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = answerTwo)
            }
        }
    )
}
