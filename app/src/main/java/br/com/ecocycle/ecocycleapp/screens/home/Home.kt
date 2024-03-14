package br.com.ecocycle.ecocycleapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.screens.home.components.CardMaterial

@Composable
fun HomeScreen() {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.home_ecology),
            contentDescription = "Home ecology",
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            CardMaterial(image = R.drawable.metal, imageDescription = "Foto de metal", text = "Metal")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            CardMaterial(image = R.drawable.plastico, imageDescription = "Foto de plástico", text = "Plástico")
        }
    }

    Column {

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}