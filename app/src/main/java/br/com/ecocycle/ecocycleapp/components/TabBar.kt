package br.com.ecocycle.ecocycleapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.ecocycle.ecocycleapp.R
import br.com.ecocycle.ecocycleapp.screens.home.HomeScreen
import br.com.ecocycle.ecocycleapp.screens.mapa.MapaLoad
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
fun TabBar() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = colorResource(id = R.color.white),
                modifier = Modifier
                    .height(60.dp)
                    .border(BorderStroke(3.dp, colorResource(id = R.color.tabBar_border)))
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach { navItem ->
                    val selected =
                        currentDestination?.hierarchy?.any { it.route == navItem.route } == true

                    NavigationBarItem(
                        selected = selected,
                        onClick = {
                            navController.navigate(navItem.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            val tint =
                                if (selected) colorResource(id = R.color.primary) else Color.LightGray
                            Icon(
                                modifier = Modifier.size(35.dp),
                                imageVector = navItem.icon,
                                contentDescription = null,
                                tint = tint
                            )
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.Home.name,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable(route = Screens.Home.name) {
                HomeScreen()
            }
            composable(route = Screens.Mapa.name) {
                MapaLoad()
            }
            composable(route = Screens.Reciclagem.name) {
                ReciclagemScreen()
            }
            composable(route = Screens.Recompensas.name) {
                RecompensasScreen()
            }
        }

    }
}
