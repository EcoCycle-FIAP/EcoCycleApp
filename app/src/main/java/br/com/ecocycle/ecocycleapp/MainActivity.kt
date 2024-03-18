package br.com.ecocycle.ecocycleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import br.com.ecocycle.ecocycleapp.screens.mapa.MapaLoad
import br.com.ecocycle.ecocycleapp.screens.mapa.components.CardPontoColeta
import br.com.ecocycle.ecocycleapp.ui.theme.EcoCycleAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcoCycleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {
                    MapaLoad()
                    CardPontoColeta()

                }
            }
        }
    }
}


