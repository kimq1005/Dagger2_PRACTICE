package llama.test.jetpack_dagger_plz.presentation

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.CameraPosition
import com.naver.maps.map.compose.CameraPositionState
import com.naver.maps.map.compose.NaverMap
import com.naver.maps.map.compose.rememberCameraPositionState
import dagger.hilt.android.AndroidEntryPoint
import llama.test.jetpack_dagger_plz.presentation.screens.HomeScreen
import llama.test.jetpack_dagger_plz.presentation.screens.viewmodel.TestViewModel
import llama.test.jetpack_dagger_plz.ui.theme.JETPACK_DAGGER_PLZTheme
import llama.test.jetpack_dagger_plz.utils.Common.TAG
import com.naver.maps.map.CameraUpdate
import com.naver.maps.map.NaverMap
import com.naver.maps.map.compose.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JETPACK_DAGGER_PLZTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp{
                        Navermap()
//                        PLZ()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello $name !")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "adasdasdhaㅇasdasdsud")
    }

}

@Composable
fun MyApp(content: @Composable ()->Unit) {
    content()
}

@Composable
fun PLZ(viewModel: TestViewModel = hiltViewModel()){
    Column(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = {  viewModel.wow() },
        ) {

        }

    }
}

@OptIn(ExperimentalNaverMapApi::class)
@Composable
fun Navermap(){
    val seoul = LatLng(37.532600, 127.024612)
    val context = LocalContext.current

    val camerapositionState:CameraPositionState = rememberCameraPositionState{
        position = CameraPosition(seoul , 11.0)
    }

    Box(modifier = Modifier.fillMaxSize()){
       NaverMap(
           cameraPositionState = camerapositionState
       ){
           Marker(
               state = MarkerState(position = seoul),
               captionText = Offset.Infinite.toString(),
               height = 36.dp,
               width = 36.dp,
               onClick = {
                   Toast.makeText(context, it.position.longitude.toString(), Toast.LENGTH_SHORT).show()
                   true
               }
           )
       }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JETPACK_DAGGER_PLZTheme {
        Greeting("Android")
    }
}