package br.com.ecocycle.ecocycleapp.screens.recompensas.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun CardSaldoPontos() {
    val context = LocalContext.current

    //Esta constante está sendo utilizada apenas para "mockar o que seria uma variável que recebe os pontos acumulados pelo usuário.
    val mockPontos = "615"

    Card(
        modifier = Modifier
            .width(300.dp)
            .height(100.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.recompensas_card_background)),
        elevation = CardDefaults.cardElevation(15.dp)
    ) {
        Column {
            Row {
                Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.coins),
                        contentDescription = context.getString(R.string.card_saldo_coin_description),
                        Modifier.size(60.dp)
                    )
                }
                Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                    Text(
                        text = "$mockPontos " + context.getString(R.string.pontos_abreviacao),
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(
                            id = R.color.black
                        ),
                    )
                    Text(
                        text = context.getString(R.string.card_saldo_label),
                        fontSize = 18.sp,
                        color = colorResource(id = R.color.gray),

                        )
                }
            }
        }
    }
}