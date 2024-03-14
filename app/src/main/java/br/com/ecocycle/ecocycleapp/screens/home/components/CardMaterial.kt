package br.com.ecocycle.ecocycleapp.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CardMaterial(image: Int, imageDescription: String, text: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .height(120.dp)
    ) {
        Button(onClick = onClick) {
            Image(painter = painterResource(id = image), contentDescription = imageDescription)
            Text(text = text)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CardMateriaisPreview() {
    // CardMaterial()
}

