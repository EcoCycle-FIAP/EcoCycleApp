package br.com.ecocycle.ecocycleapp.screens.cadastroelogin

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.components.BotaoPadrao
import br.com.ecocycle.ecocycleapp.components.InputTextoPadrao

@Composable
fun CadastroScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(70.dp))
            Column (horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
            ){
                Spacer(modifier = Modifier.height(100.dp))
//                Image(
//                    painter = painterResource(id = R.drawable.ecocyclelogo),
//                    contentDescription = "logo"
//                )
//                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Crie sua conta e recicle agora",
                    fontSize = 16.sp
                )
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
            ) {
                Card (modifier = Modifier
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
                        trailingIcon = R.drawable.account_box_24,
                        trailingIconDescription = "Ícone de caixa de conta"
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    InputTextoPadrao(
                        label = "Email",
                        placeholder = "Digite seu email",
                        value = "",
                        onValueChange = {},
                        trailingIcon = R.drawable.mail_icon,
                        trailingIconDescription = "Ìcone de email"
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    InputTextoPadrao(
                        label = "Senha",
                        placeholder = "Digite sua senha",
                        value = "",
                        onValueChange = {},
                        trailingIcon = R.drawable.eye_icon,
                        trailingIconDescription = "Ícone de olho"
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    InputTextoPadrao(
                        label = "Confirmar senha",
                        placeholder = "Digite novamente sua senha",
                        value = "",
                        onValueChange = {},
                        trailingIcon = R.drawable.eye_icon,
                        trailingIconDescription = "Ícone de olho"
                    )
                    Spacer(modifier = Modifier.height(24.dp))

                    BotaoPadrao(onClick = { /*TODO*/ },
                        text = "Cadastrar")
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Row(horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Já possui uma conta? Entrar")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadastroScreenPreview() {
    CadastroScreen()
}