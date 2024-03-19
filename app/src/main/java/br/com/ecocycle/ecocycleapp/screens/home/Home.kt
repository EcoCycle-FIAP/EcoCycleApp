package br.com.ecocycle.ecocycleapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.screens.home.components.CardMaterial
import br.com.ecocycle.ecocycleapp.screens.home.components.ModalDetalhesMaterial

@Composable
fun HomeScreen() {

    var showModalMetal by remember { mutableStateOf(false) }
    var showModalPlastico by remember { mutableStateOf(false) }
    var showModalPapel by remember { mutableStateOf(false) }
    var showModalVidro by remember { mutableStateOf(false) }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.home_ecology),
            contentDescription = "home ecology",
            modifier = Modifier
                .fillMaxWidth()
                .height(320.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            CardMaterial(
                image = R.drawable.metal,
                imageDescription = "Foto de metal",
                text = "Metal",
                onClick = { showModalMetal = true })
            if (showModalMetal) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalMetal = false },
                    questionOne = "Quais são os produtos feitos de metal?",
                    answerOne = "No dia a dia, encontramos metal em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com metal reciclado?",
                    answerTwo = "Alguns dos produtos que podem ser feitos a partir do metal reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS."
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            CardMaterial(
                image = R.drawable.plastico,
                imageDescription = "Foto de plástico",
                text = "Plástico",
                onClick = { showModalPlastico = true })
            if (showModalPlastico) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalPlastico = false },
                    questionOne = "Quais são os produtos feitos de plástico?",
                    answerOne = "No dia a dia, encontramos plástico em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com plástico reciclado?",
                    answerTwo = "Alguns dos produtos que podem ser feitos a partir do plástico reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS."
                )
            }
        }

        Column() {
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                CardMaterial(
                    image = R.drawable.papel,
                    imageDescription = "Foto de papel",
                    text = "Papel",
                    onClick = { showModalPapel = true })
                if (showModalPapel) {
                    ModalDetalhesMaterial(
                        onDismissRequest = { showModalPapel = false },
                        questionOne = "Quais são os produtos feitos de papel?",
                        answerOne = "No dia a dia, encontramos papel em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                        questionTwo = "O que pode ser feito com papel reciclado?",
                        answerTwo = "Alguns dos produtos que podem ser feitos a partir do papel reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS."
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row() {
                CardMaterial(
                    image = R.drawable.vidro,
                    imageDescription = "Foto de vidro",
                    text = "Vidro",
                    onClick = { showModalVidro = true })
                if (showModalVidro) {
                    ModalDetalhesMaterial(
                        onDismissRequest = { showModalVidro = false },
                        questionOne = "Quais são os produtos feitos de vidro?",
                        answerOne = "No dia a dia, encontramos vidro em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                        questionTwo = "O que pode ser feito com vidro reciclado?",
                        answerTwo = "Alguns dos produtos que podem ser feitos a partir do vidro reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS."
                    )
                }
            }
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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = "HomeScreen")
    }
}
