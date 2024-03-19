package br.com.ecocycle.ecocycleapp.screens.cadastroelogin

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.ecocycle.ecocycleapp.screens.cadastroelogin.components.CadastroScreen
import br.com.ecocycle.ecocycleapp.screens.cadastroelogin.components.LoginScreen
import br.com.ecocycle.ecocycleapp.screens.home.HomeScreen

@Composable
fun CadastroELoginScreen() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login"){
        composable(route = "login"){
            LoginScreen(navController)
        }
        composable(route = "cadastro"){
            CadastroScreen(navController,  CadastroScreenViewModel())
        }
        composable(route = "home"){
            HomeScreen()
        }
    }

}
