package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun <T> InputTextoPadrao(
    modifier: Modifier = Modifier,
    label: String,
    placeholder: String,
    value: T,
    onValueChange: (T) -> Unit,
    trailingIcon: @Composable (() -> Unit)? = null,
    readOnly: Boolean = false,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    OutlinedTextField(
        label = { Text(text = label) },
        placeholder = { Text(text = placeholder) },
        value = when (value) {
            is String -> value
            is Int -> value.toString()
            else -> throw IllegalArgumentException("Unsupported value type")
        },
        onValueChange = {
            @Suppress("UNCHECKED_CAST")
            onValueChange(it as T)
        },
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
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        readOnly = readOnly
    )
}