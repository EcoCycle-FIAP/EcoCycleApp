package br.com.ecocycle.ecocycleapp.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CardMaterial(image: Int, imageDescription: String, text: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .height(120.dp),
        colors = CardDefaults.cardColors(Color(0xffF6F6F6)),
        shape = RectangleShape,
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Button(onClick = onClick, colors = ButtonDefaults.buttonColors(Color(0xffF6F6F6))) {
            Image(painter = painterResource(id = image), contentDescription = imageDescription)
            Text(text = text, modifier = Modifier.padding(vertical = 100.dp, horizontal = 20.dp))
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//private fun CardMateriaisPreview() {
//     CardMaterial(image = R.drawable.metal, imageDescription = "Foto de metal", text = "Metal") {
//     }
//}

