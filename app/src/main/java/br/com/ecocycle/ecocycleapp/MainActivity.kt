package br.com.ecocycle.ecocycleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.res.colorResource
import br.com.ecocycle.ecocycleapp.ui.theme.EcoCycleAppTheme
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import br.com.ecocycle.ecocycleapp.components.TabBar

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
                    TabBar()
                }
            }
        }
    }
}
