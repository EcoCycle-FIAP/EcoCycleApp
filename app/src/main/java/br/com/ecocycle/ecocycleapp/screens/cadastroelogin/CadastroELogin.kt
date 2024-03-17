package br.com.ecocycle.ecocycleapp.screens.cadastroelogin

import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.screens.cadastroelogin.components.CadastroScreen
import br.com.ecocycle.ecocycleapp.screens.cadastroelogin.components.LoginScreen

@Composable
fun LogoEcoCycle() {
    Image(
        painter = painterResource(id = R.drawable.ecocyclelogo),
        contentDescription = "logo"
    )
}

@Composable
fun getColorId(@ColorRes colorResId: Int): Color {
    val context = LocalContext.current
    return Color(context.getColor(colorResId))
}

@Composable
fun CadastroELoginScreen() {
    LoginScreen()
    CadastroScreen()

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadastroScreenPreview() {
    CadastroELoginScreen()
}