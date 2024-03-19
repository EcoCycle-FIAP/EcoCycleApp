package br.com.ecocycle.ecocycleapp.screens.recompensas.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun CardHistoricoPontos() {
    val context = LocalContext.current

    //Esta constante está sendo utilizada apenas para "mockar o que seria uma variável que recebe os pontos acumulados pelo usuário.
    val mockPontos = 20

    //Esta constante está sendo utilizada apenas para "mockar o que seria uma variável que recebe a data das reciclagens registradas pelo usuário.
    val mockData = "Março 2024"

    Card(
        modifier = Modifier
            .width(300.dp)
            .height(350.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.recompensas_card_background)),
        elevation = CardDefaults.cardElevation(15.dp)
    ) {
        Text(
            text = context.getString(R.string.card_historico_label),
            fontSize = 20.sp,
            color = colorResource(id = R.color.black),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 15.dp)
        )
        HorizontalDivider(color = colorResource(id = R.color.gray))
        LazyColumn {
            // Aqui usamos uma lista genérica de registros no histórico de pontos apenas para "mockar" a visualização.
            items(10) {
                Row(
                    modifier = Modifier
                        .padding(vertical = 5.dp, horizontal = 15.dp)
                        .fillMaxWidth()
                        .height(50.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            modifier = Modifier.size(35.dp),
                            alignment = Alignment.Center,
                            painter = painterResource(id = R.drawable.profile_picture),
                            contentDescription = context.getString(R.string.card_historico_picture_description)
                        )
                    }
                    Column {
                        Text(
                            text = context.getString(R.string.metal),
                            color = colorResource(id = R.color.black),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "$it $mockData",
                            color = colorResource(id = R.color.gray)
                        )
                    }
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "+${mockPontos + it} " + context.getString(R.string.pontos_abreviacao),
                            color = colorResource(
                                id = R.color.primary
                            )
                        )
                    }
                }
                HorizontalDivider(color = colorResource(id = R.color.gray))
            }
        }
    }
}