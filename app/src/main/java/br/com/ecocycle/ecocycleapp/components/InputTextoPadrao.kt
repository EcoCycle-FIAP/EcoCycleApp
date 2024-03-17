package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun InputTextoPadrao(
    modifier: Modifier = Modifier,
    label: String,
    placeholder: String,
    value: String,
    onValueChange: (String) -> Unit,
    trailingIcon: @Composable (() -> Unit)? = null,
    readOnly: Boolean = false
) {
    OutlinedTextField(
        label = { Text(text = label) },
        placeholder = { Text(text = placeholder) },
        value = value,
        onValueChange = onValueChange,
        singleLine = true,
        textStyle = TextStyle(fontSize = 16.sp),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .width(300.dp)
            .then(modifier),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = colorResource(id = R.color.primary),
            focusedTrailingIconColor = colorResource(id = R.color.primary),
            unfocusedTrailingIconColor = colorResource(id = R.color.gray),
            unfocusedBorderColor = colorResource(id = R.color.transparent),
            focusedContainerColor = colorResource(id = R.color.input_background),
            unfocusedContainerColor = colorResource(id = R.color.input_background),
            focusedLabelColor = colorResource(id = R.color.gray),
            unfocusedLabelColor = colorResource(id = R.color.gray),
            focusedPlaceholderColor = colorResource(id = R.color.gray)
        ),
        trailingIcon = trailingIcon,
        readOnly = readOnly
    )
}