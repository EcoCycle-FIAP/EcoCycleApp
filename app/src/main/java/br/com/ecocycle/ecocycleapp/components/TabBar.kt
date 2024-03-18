package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.getColorId
import br.com.ecocycle.ecocycleapp.screens.home.HomeScreen
import br.com.ecocycle.ecocycleapp.screens.mapa.MapaScreen
import br.com.ecocycle.ecocycleapp.screens.reciclagem.ReciclagemScreen
import br.com.ecocycle.ecocycleapp.screens.recompensas.RecompensasScreen

enum class Screens {
    Home,
    Mapa,
    Reciclagem,
    Recompensas
}

data class NavItem(
    val icon: ImageVector,
    val route: String
)

val listOfNavItems = listOf(
    NavItem(
        icon = Icons.Default.Home,
        route = Screens.Home.name
    ),
    NavItem(
        icon = Icons.Default.LocationOn,
        route = Screens.Mapa.name
    ),
    NavItem(
        icon = Icons.Default.Delete,
        route = Screens.Reciclagem.name
    ),
    NavItem(
        icon = Icons.Default.Star,
        route = Screens.Recompensas.name
    )
)

@Composable
fun TabBar(){
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color.White
            ){
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach{navItem ->
                    val selected = currentDestination?.hierarchy?.any { it.route == navItem.route } == true

                    NavigationBarItem(
                        selected = selected,
                        onClick = {
                            navController.navigate(navItem.route){
                                popUpTo(navController.graph.findStartDestination().id){
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            val tint = if (selected) getColorId(colorResId = R.color.primary) else Color.LightGray
                            Icon(
                                imageVector = navItem.icon,
                                contentDescription = null,
                                tint = tint
                            )
                        }
                    )
                }
            }
        }
    ){paddingValues ->
        NavHost(navController = navController,
            startDestination = Screens.Home.name,
            modifier = Modifier
                .padding(paddingValues)
            ){
                composable(route = Screens.Home.name){
                    HomeScreen()
                }
                composable(route = Screens.Mapa.name){
                    MapaScreen()
                }
                composable(route = Screens.Reciclagem.name){
                    ReciclagemScreen()
                }
                composable(route = Screens.Recompensas.name){
                    RecompensasScreen()
                }
        }

    }
}
