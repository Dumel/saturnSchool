package br.senai.sp.jandira.lionschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import br.senai.sp.jandira.lionschool.ui.theme.LionSchoolTheme

class DsEndPoints : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LionSchoolTheme {
                lionSchoolTurmaDs()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun lionSchoolTurmaDs(){
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = stringResource(id = R.string.app_name),
                fontSize = 70.sp,
                color = Color(227, 53, 255),
                modifier = Modifier.width(300.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(modifier = Modifier
                    .width(170.dp)
                    .height(50.dp)
                    .padding(start = 50.dp),
                    colors = ButtonDefaults.buttonColors(Color(239, 32, 240)),
                    onClick = { /*TODO*/ }) {

                    Text(
                        text = stringResource(id = R.string.todosDs),
                        fontSize = 15.sp,
                        color = Color.White,
                        fontWeight = FontWeight(1000)
                    )

                }
            }

            



//            Card(
//                modifier = Modifier
//                    .width(180.dp)
//                    .height(300.dp)
//                    .padding(top = 40.dp, start = 15.dp),
//                backgroundColor =  Color(239, 32, 240),
//                shape = RoundedCornerShape(16.dp)
//            ) {
//
//
//                Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
//                    Text(
//                        text = stringResource(id = R.string.ds),
//                        fontSize = 35.sp,
//                        color = Color.White,
//                        fontWeight = FontWeight(1000)
//                    )
//
//                    Image(
//                        painter = painterResource(id = R.drawable.ds),
//                        contentDescription = "ds",
//                        modifier = Modifier.size(150.dp)
//                    )
//
//
//
//                }
//
//            }

        }
    }
}