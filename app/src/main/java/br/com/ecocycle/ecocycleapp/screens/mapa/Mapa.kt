package br.com.ecocycle.ecocycleapp.screens.mapa

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.MapUiSettings
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerInfoWindow
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.rememberMarkerState

val brazilState = LatLng(-23.5814732, -46.6812221)

val defaultCameraPosition = CameraPosition.fromLatLngZoom(brazilState, 10f)


@Composable
fun Mapa(
    modifier: Modifier,
    cameraPositionState: CameraPositionState,
    onMapLoaded: () -> Unit
) {

    val locationState = rememberMarkerState(
        position = brazilState
    )

    val mapUiSettings by remember {
        mutableStateOf(MapUiSettings(compassEnabled = false))
    }
    val mapProperties by remember {
        mutableStateOf(MapProperties(mapType = MapType.NORMAL))
    }

    GoogleMap(
        modifier = modifier,
        onMapLoaded = onMapLoaded,
        cameraPositionState = cameraPositionState,
        uiSettings = mapUiSettings,
        properties = mapProperties
    ) {

        MarkerInfoWindow{

        }

        Marker(
            state = locationState,
            draggable = true,
            onClick = {return@Marker false},
            title = "Brazil Map"
        )


    }
}

@Composable
fun MapaLoad() {

    val cameraPositionState = rememberCameraPositionState {
        position = defaultCameraPosition
    }
    Mapa(
        modifier = Modifier.height(350.dp),
        cameraPositionState = cameraPositionState,
        onMapLoaded = {
        }
    )
}
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MapaScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = "MapaScreen")
    }
}
