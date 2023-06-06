package br.senai.sp.jandira.lionschool

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class CursoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                lionSchoolCursos()
            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun lionSchoolCursos(){

    val context = LocalContext.current

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = stringResource(id = R.string.app_name),
                fontSize = 70.sp,
                color = Color(239, 32, 240),
                modifier = Modifier.width(300.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(55.dp))
            Card(
                modifier = Modifier
                    .width(250.dp)
                    .height(80.dp),
                    backgroundColor =  Color(239, 32, 240),
                    shape = RoundedCornerShape(50.dp)
            ) {
                Column(modifier = Modifier.padding(top = 25.dp, start = 60.dp)) {

                        Text(
                            text = stringResource(id = R.string.options),
                            fontSize = 18.sp,
                            color = Color.White,
                            fontWeight = FontWeight(900),

                        )
                }
            }

          Row (
              modifier = Modifier
                  .fillMaxWidth()
//                  .height(40.dp), horizontalArrangement = Arrangement.Start
                  ){
              Spacer(modifier = Modifier.height(100.dp))
              Button(
                  modifier = Modifier
                      .width(150.dp)
                      .height(300.dp)
                      .padding(top = 90.dp, start = 15.dp),
                  colors = ButtonDefaults.buttonColors(Color(239, 32, 240)),
                  onClick = {

                            val intent = Intent(context, DsEndPoints::class.java)
                            context.startActivity(intent)
//


                  },
                  shape = RoundedCornerShape(16.dp)
              ) {


                      Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
                          Text(
                              text = stringResource(id = R.string.ds),
                              fontSize = 35.sp,
                              color = Color.White,
                              fontWeight = FontWeight(1000)
                          )

                          Image(
                              painter = painterResource(id = R.drawable.ds),
                              contentDescription = "ds",
                              modifier = Modifier.size(150.dp)
                          )



                  }

              }

              Button(
                  modifier = Modifier
                      .width(230.dp)
                      .height(300.dp)
                      .padding(top = 90.dp, start = 90.dp),
                  colors = ButtonDefaults.buttonColors(Color(239, 32, 240)),
                  onClick = {

//                            val intent = Intent(context, LoggedActivity::class.java)
//                            context.startActivity(intent)
//


                  },
                  shape = RoundedCornerShape(16.dp)
              ) {

                  Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally){
                      Text(
                          text = stringResource(id = R.string.redes),
                          fontSize = 30.sp,
                          color = Color.White,
                          fontWeight = FontWeight(1000)
                      )

                      Image(
                          painter = painterResource(id = R.drawable.rede),
                          contentDescription = "rede",
                          modifier = Modifier.size(150.dp)
                      )
                  }


              }
          }
        }
    }
}