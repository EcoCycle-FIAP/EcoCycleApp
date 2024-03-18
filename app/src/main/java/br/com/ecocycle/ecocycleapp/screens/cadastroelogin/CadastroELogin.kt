package br.com.ecocycle.ecocycleapp.screens.cadastroelogin

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.ecocycle.ecocycleapp.screens.cadastroelogin.components.CadastroScreen
import br.com.ecocycle.ecocycleapp.screens.cadastroelogin.components.LoginScreen

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