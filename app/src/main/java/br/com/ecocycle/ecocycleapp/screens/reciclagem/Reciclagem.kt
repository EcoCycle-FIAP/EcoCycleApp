package br.com.ecocycle.ecocycleapp.screens.reciclagem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.components.BotaoPadrao
import br.com.ecocycle.ecocycleapp.components.DropdownPadrao
import br.com.ecocycle.ecocycleapp.components.InputTextoPadrao
import java.lang.NumberFormatException

@Composable
fun ReciclagemScreen() {
    val context = LocalContext.current

    val materialList = listOf(
        context.getString(R.string.metal),
        context.getString(R.string.papel),
        context.getString(R.string.plastico),
        context.getString(R.string.vidro)
    )

    var quantity: Int? by remember {
        mutableStateOf(null)
    }
    var date by remember {
        mutableStateOf("")
    }
    var locality by remember {
        mutableStateOf("")
    }
    var selectedItem by remember {
        mutableStateOf("")
    }

    fun clearUserInputs() {
        quantity = null
        date = ""
        locality = ""
        selectedItem = ""
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
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
            Column(Modifier.width(300.dp)) {
                OutlinedIconButton(
                    onClick = { /*TODO*/ },
                    colors = IconButtonDefaults.iconButtonColors(containerColor = colorResource(id = R.color.white)),
                    border = IconButtonDefaults.outlinedIconButtonBorder(enabled = false)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.back_arrow),
                        contentDescription = "Seta para esquerda (voltar)"
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Registre aqui sua reciclagem",
                    color = colorResource(id = R.color.white),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Aqui você poderá ver suas reciclagens e adicionar novas",
                    color = colorResource(id = R.color.white),
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            InputTextoPadrao(
                label = "Quantidade de materiais",
                placeholder = "Quantas unidades reciclou?",
                value = quantity?.toString() ?: "", // Converta quantity para String
                onValueChange = {
                    try {
                        quantity = it.toInt()
                    } catch (e: NumberFormatException) {
                        println("Erro ao converter para Int: ${e.message}")
                    }
                },
                keyboardType = KeyboardType.Number,
                modifier = Modifier.padding(bottom = 15.dp)
            )
            DropdownPadrao(
                label = "Tipo do material",
                placeholder = "Qual material reciclou?",
                optionsList = materialList,
                modifier = Modifier.padding(bottom = 15.dp),
                onItemSelected = { selectedItem = it },
                selectedItem = selectedItem
            )
            InputTextoPadrao(
                label = "Data da reciclagem",
                placeholder = "Quando você reciclou?",
                value = date,
                onValueChange = { date = it },
                modifier = Modifier.padding(bottom = 15.dp)
            )
            InputTextoPadrao(
                label = "Local da reciclagem",
                placeholder = "Onde você reciclou?",
                value = locality,
                onValueChange = { locality = it },
                modifier = Modifier.padding(bottom = 15.dp)
            )
        }

        Column {
            BotaoPadrao(
                onClick = { /*TODO*/ },
                text = "Cadastrar",
                contentFontSize = 18
            )
            BotaoPadrao(
                onClick = {clearUserInputs()},
                text = "Cancelar",
                contentFontSize = 18,
                containerColor = R.color.transparent,
                contentColor = R.color.gray,
                elevation = null
            )
        }
    }
}