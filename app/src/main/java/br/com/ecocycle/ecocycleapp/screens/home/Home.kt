package br.com.ecocycle.ecocycleapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.ecocycle.ecocycleapp.R

@Composable
fun HomeScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.home_ecology),
                    contentDescription = "Home ecology",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(320.dp)
                )
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 320.dp, start = 40.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {

                    Surface(
                        color = Color.White,
                        modifier = Modifier.padding(8.dp),
                        shape = RectangleShape,

                        ) {
                        Card() {
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.plastico),
                                    contentDescription = "Plástico",
                                    modifier = Modifier.size(120.dp)
                                )
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.metal),
                                    contentDescription = "Metal",
                                    modifier = Modifier.size(120.dp)
                                )
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.eletronicos),
                                    contentDescription = "Eletrônicos",
                                    modifier = Modifier.size(120.dp)
                                )
                            }
                        }
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 320.dp, start = 190.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {

                    Surface(
                        color = Color.White,
                        modifier = Modifier.padding(8.dp),
                        shape = RectangleShape,

                        ) {
                        Card() {
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.papel),
                                    contentDescription = "Papel",
                                    modifier = Modifier.size(120.dp)
                                )
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.vidro),
                                    contentDescription = "Vidro",
                                    modifier = Modifier.size(120.dp)
                                )
                            }
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(Color.White),
                                shape = RectangleShape

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.organico),
                                    contentDescription = "Orgânico",
                                    modifier = Modifier.size(120.dp)
                                )
                            }
                        }
                    }
                }
            }
        }


        Column(modifier = Modifier.padding(top = 740.dp, start = 70.dp)) {
            Surface() {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = "home"
                    )
                }
            }
        }
        Column(modifier = Modifier.padding(top = 740.dp, start = 140.dp)) {
            Surface() {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.gps),
                        contentDescription = "home"
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .padding(top = 740.dp, start = 205.dp)
        ) {
            Surface() {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.recycle),
                        contentDescription = "home"
                    )
                }
            }
        }
        Column(modifier = Modifier.padding(top = 740.dp, start = 270.dp)) {
            Surface() {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.trophy),
                        contentDescription = "home"
                    )
                }
            }
        }

    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}