package br.com.ecocycle.ecocycleapp.screens.mapa.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardPontoColeta() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.BottomCenter
    ) {

        Card(
            colors = CardDefaults.cardColors(Color(0xff167478)),
            modifier = Modifier
                .fillMaxWidth()
                .height(255.dp)
                .padding(30.dp),
            shape = CardDefaults.elevatedShape,
            elevation = CardDefaults.cardElevation(10.dp)
        ) {

            Spacer(modifier = Modifier.height(6.dp))
            Row() {
                Text(
                    text = "Endereço",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(20.dp),
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.width(36.dp))
                Text(
                    text = "Rua Jerônimo da Veiga",
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .padding(20.dp),
                    fontSize = 12.sp
                )
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .padding(start = 20.dp, end = 20.dp),
                border = BorderStroke(5.dp, Color(0xFFFFFFFF))
            ) {
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Text(
                    text = "(XX) XXXX-XXXX",
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(20.dp),
                    fontSize = 15.sp,

                    )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "8h00 às 18h00",
                    color = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .padding(20.dp),
                    fontSize = 12.sp
                )

            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xffffffff)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(horizontal = 16.dp)


            ) {
                Text(
                    text = "Veja mais",
                    color = Color(0xFF000000)
                )
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun CardPontoColetaPreview() {
    CardPontoColeta()
}
