package br.com.ecocycle.ecocycleapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
    var showModalEletronico by remember { mutableStateOf(false) }
    var showModalOrganico by remember { mutableStateOf(false) }


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
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CardMaterial(
                image = R.drawable.metal,
                imageDescription = "Desenho de materiais de metal",
                text = "Metal",
                onClick = { showModalMetal = true }
            )
            if (showModalMetal) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalMetal = false },
                    questionOne = "Quais são os produtos feitos de metal?",
                    answerOne = "No dia a dia, encontramos metal em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com metal reciclado?",
                    answerTwo = "Alguns dos produtos que podem ser feitos a partir do metal reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    text = "Metal",
                    imageCard = R.drawable.metal
                )
            }
            CardMaterial(
                image = R.drawable.plastico,
                imageDescription = "Desenho de materiais de plástico",
                text = "Plástico",
                onClick = { showModalPlastico = true }
            )
            if (showModalPlastico) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalPlastico = false },
                    questionOne = "Quais são os produtos feitos de plástico?",
                    answerOne = "No dia a dia, encontramos plástico em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com plástico reciclado?",
                    answerTwo = "Alguns dos produtos que podem ser feitos a partir do plástico reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    text = "Plástico",
                    imageCard = R.drawable.plastico
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CardMaterial(
                image = R.drawable.papel,
                imageDescription = "Desenho de materiais de papel",
                text = "Papel",
                onClick = { showModalPapel = true }
            )
            if (showModalPapel) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalPapel = false },
                    questionOne = "Quais são os produtos feitos de papel?",
                    answerOne = "No dia a dia, encontramos papel em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com papel reciclado?",
                    answerTwo = "Alguns dos produtos que podem ser feitos a partir do papel reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    text = "Papel",
                    imageCard = R.drawable.papel
                )
            }
            CardMaterial(
                image = R.drawable.vidro,
                imageDescription = "Desenho de materiais de vidro",
                text = "Vidro",
                onClick = { showModalVidro = true }
            )
            if (showModalVidro) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalVidro = false },
                    questionOne = "Quais são os produtos feitos de plástico?",
                    answerOne = "No dia a dia, encontramos plástico em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com plástico reciclado?",
                    answerTwo = "Alguns dos produtos que podem ser feitos a partir do plástico reciclado são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    text = "Vidro",
                    imageCard = R.drawable.vidro
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            CardMaterial(
                image = R.drawable.eletronico,
                imageDescription = "Desenho de materiais eletrônicos",
                text = "Eletrônicos",
                onClick = { showModalEletronico = true }
            )
            if (showModalEletronico) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalEletronico = false },
                    questionOne = "Quais são os produtos feitos de materiais eletrônicos?",
                    answerOne = "No dia a dia, encontramos materiais eletrônicos em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com materiais eletrônicos reciclados?",
                    answerTwo = "Alguns dos produtos que podem ser feitos a partir do material eletrônico são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    text = "Eletrônico",
                    imageCard = R.drawable.eletronico
                )
            }
            CardMaterial(
                image = R.drawable.organico,
                imageDescription = "Desenho de materiais orgânicos",
                text = "Orgânico",
                onClick = { showModalOrganico = true }
            )
            if (showModalOrganico) {
                ModalDetalhesMaterial(
                    onDismissRequest = { showModalOrganico = false },
                    questionOne = "Quais são os produtos feitos de alimentos orgânicos?",
                    answerOne = "No dia a dia, encontramos alimentos orgânicos em BLA BLA BLA BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    questionTwo = "O que pode ser feito com alimentos orgânicos?",
                    answerTwo = "Algumas coisas que podem ser feitas com alimentos orgânicos são..... asdkasjds adkasjd dka BDSDSDASJH WEJIW DOSOWQ IDJASKDHAOWEK\u2028SKSDKA FSLKFLSD WLEKW. LSKDLSKLSK DLSKDS LDS.",
                    text = "Orgânico",
                    imageCard = R.drawable.organico
                )
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}