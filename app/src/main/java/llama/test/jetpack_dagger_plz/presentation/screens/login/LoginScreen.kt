package llama.test.jetpack_dagger_plz.presentation.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import llama.test.jetpack_dagger_plz.R

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = R.string.PET_MIllY_TITLE),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = stringResource(id = R.string.Title_Description),
            fontSize = 20.sp,
            color = Color.Black
        )

        //
        Spacer(modifier = Modifier.weight(1f))



        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(20.dp)
                .height(50.dp)
                .background(color = Color(0xffF44336), shape = RoundedCornerShape(12.dp))
                .fillMaxWidth(),
        ) {
            Text(
                text = stringResource(id = R.string.kakao_login_text),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
//        Text(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
//                .background(Color(0xffF44336))
//                .height(60.dp)
//                .align(Alignment.CenterHorizontally)
//            ,
//            text = stringResource(id = R.string.kakao_login_text),
//            fontSize = 16.sp,
//            color = Color.White,
//        )
    }
}

@Composable
fun Test() {
    Column(
        modifier = Modifier
            .height(200.dp)
            .background(Color.LightGray)
    ) {
        Text(
            "First Text",
            modifier = Modifier
                .background(Color(0xffF44336)),
            color = Color.White
        )
        Text(
            "Second Text",
            modifier = Modifier
                .background(Color(0xff9C27B0)),
            color = Color.White
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "Third Text",
            modifier = Modifier
                .background(Color(0xff2196F3)),
            color = Color.White
        )
    }
}

@Preview
@Composable
fun preview() {
//    Test()
    LoginScreen()

}