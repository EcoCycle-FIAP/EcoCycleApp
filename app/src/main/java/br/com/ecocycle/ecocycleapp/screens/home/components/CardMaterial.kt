package br.com.ecocycle.ecocycleapp.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun CardMateriais() {

    Surface(color = Color(0xFFFAFAFA), shape = RectangleShape) {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ) {

            Card(
                modifier = Modifier
                    .padding(horizontal = 25.dp)
                    .height(600.dp) // Definindo a altura vertical do card como 300dp
                    .width(400.dp)

            )


            {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(id = R.drawable.metalimg ), contentDescription = "")
                    Text(
                        text = "Metal",
                        color = Color(0xFF014D3F),
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Quais são os produtos feitos de metal?",
                        color = Color(
                            0xFF289B7E
                        ),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "No dia a dia, encontramos metal em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ " +
                            "IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.")
                    Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = "O que pode ser feito com metal reciclado?",
                        color = Color(
                            0xFF289B7E
                        ),
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Alguns dos produtos que podem ser feitos a partir do metal reciclado são..... " +
                            "asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD " +
                            "WLEKW. LSKDLSKLSK DLSKDS LDS.")
                    Button(
                        onClick = { /* Ação ao clicar */ },
                        colors = ButtonDefaults.buttonColors(
                        )
                    ) {
                        Text(text = "Fechar")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CardMateriaisPreview() {
    CardMateriais()
}

