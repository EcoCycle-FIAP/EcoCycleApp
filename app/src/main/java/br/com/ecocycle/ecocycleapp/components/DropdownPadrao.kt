package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun DropdownPadrao(
    label: String,
    placeholder: String,
    optionsList: List<String>,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf("") }
    var inputWidth by remember { mutableIntStateOf(0) }

    val trailingIcon = if (expanded) {
        R.drawable.dropdown_arrow_up
    } else {
        R.drawable.dropdown_arrow_down
    }

    val trailingIconDescription = if (expanded) {
        "Seta para cima"
    } else {
        "Seta para baixo"
    }

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InputTextoPadrao(
            label = label,
            placeholder = placeholder,
            value = selectedItem,
            onValueChange = { selectedItem = it },
            modifier = Modifier.onGloballyPositioned { coordinates ->
                inputWidth = coordinates.size.width
            }.then(modifier),
            trailingIcon =
            {
                Icon(
                    painter = painterResource(id = trailingIcon),
                    contentDescription = trailingIconDescription,
                    Modifier
                        .clickable { expanded = !expanded }
                        .size(35.dp)
                )
            },
            readOnly = true
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(inputWidth.dp)
        ) {
            optionsList.forEach { label ->
                DropdownMenuItem(
                    text = { Text(text = label) },
                    onClick = {
                        selectedItem = label
                        expanded = false
                    }
                )
            }
        }
    }
}