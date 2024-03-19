package br.com.ecocycle.ecocycleapp.screens.recompensas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.screens.recompensas.components.CardHistoricoPontos
import br.com.ecocycle.ecocycleapp.screens.recompensas.components.CardRecompensas
import br.com.ecocycle.ecocycleapp.screens.recompensas.components.CardSaldoPontos

@Composable
fun RecompensasScreen() {
    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .padding(bottom = 30.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(
                    color = colorResource(id = R.color.primary),
                    shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp)
                )
                .height(200.dp)
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = context.getString(R.string.recompensas_highlighted_title),
                fontSize = 20.sp,
                color = colorResource(
                    id = R.color.white
                ),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = context.getString(R.string.recompensas_subtitle),
                fontSize = 20.sp,
                color = colorResource(
                    id = R.color.white
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Column(verticalArrangement = Arrangement.SpaceBetween) {
            CardSaldoPontos()
            Spacer(modifier = Modifier.height(15.dp))
            CardRecompensas()
            Spacer(modifier = Modifier.height(15.dp))
            CardHistoricoPontos()
        }
    }
}

