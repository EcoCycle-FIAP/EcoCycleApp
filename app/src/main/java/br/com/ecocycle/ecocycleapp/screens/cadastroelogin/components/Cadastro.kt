package br.com.ecocycle.ecocycleapp.screens.cadastroelogin.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.ecocycle.ecocycleapp.LogoEcoCycle
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.components.BotaoPadrao
import br.com.ecocycle.ecocycleapp.components.InputTextoPadrao

@Composable
fun CadastroScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(70.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    LogoEcoCycle()
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(
                        text = "EcoCycle",
                        fontSize = 32.sp,
                        fontFamily = FontFamily(Font(R.font.inika_bold))
                    )
                }
                Text(
                    text = "Crie sua conta e recicle agora",
                    fontSize = 16.sp
                )
            }
            Text(
                text = "Crie sua conta e recicle agora",
                fontSize = 16.sp
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 45.dp)
        ) {
            Card(
                modifier = Modifier
                    //.height(300.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                InputTextoPadrao(
                    label = "Nome",
                    placeholder = "Digite seu nome completo",
                    value = "",
                    onValueChange = {},
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.account_box_24),
                            contentDescription = "Ícone de perfil"
                        )
                    }
                )
                Spacer(modifier = Modifier.height(14.dp))
                InputTextoPadrao(
                    label = "Email",
                    placeholder = "Digite seu email",
                    value = "",
                    onValueChange = {},
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.mail_icon),
                            contentDescription = "Ícone de email"
                        )
                    }
                )
                Spacer(modifier = Modifier.height(14.dp))
                InputTextoPadrao(
                    label = "Senha",
                    placeholder = "Digite sua senha",
                    value = "",
                    onValueChange = {},
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.eye_icon),
                            contentDescription = "Ícone de olho"
                        )
                    }
                )
                Spacer(modifier = Modifier.height(14.dp))
                InputTextoPadrao(
                    label = "Confirmar senha",
                    placeholder = "Digite novamente sua senha",
                    value = "",
                    onValueChange = {},
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.eye_icon),
                            contentDescription = "Ícone de olho"
                        )
                    }
                )
                Spacer(modifier = Modifier.height(24.dp))

                BotaoPadrao(
                    onClick = {
                        navController.navigate("login")
                    },
                    text = "Cadastrar",
                    contentFontSize = 16
                )
            }
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Já possui uma conta? ")
                Text(
                    "Entrar",
                    color = colorResource(id = R.color.primary),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable {
                        navController.navigate("login")
                    }
                )
            }
        }
    }
}
