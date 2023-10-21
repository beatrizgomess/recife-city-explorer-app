package com.app.recifecityexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.recifecityexplorer.ui.theme.RecifeCityExplorerTheme

@ExperimentalMaterial3Api
class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecifeCityExplorerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginPage()
                }
            }
        }
    }
}
@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun LoginPage(modifier: Modifier = Modifier) {
   var email by rememberSaveable {
       mutableStateOf("")
   }
    var passowrd by rememberSaveable {
        mutableStateOf("")
    }
    Image(painter = painterResource(id = R.drawable.recife_antigo_crop),
        contentDescription = "Login Background",
        contentScale = ContentScale.FillBounds, )

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,


    ){
        Box(modifier = Modifier.padding(16.dp)) {
            Box(
                modifier = Modifier
                    .background(
                        Color(0xFF024D84).copy(alpha = 0.8f),
                        RoundedCornerShape(30.dp)
                    )
                    .width(350.dp)
                    .height(600.dp)
            ){
              Column {
                  Text(text = "LOGIN", color = Color.White, fontSize = 30.sp, modifier = Modifier.padding(all = 24.dp))

                  Spacer(modifier = Modifier.size(18.dp))
                  Text(text = "Digite seu Email", color = Color.White, fontSize = 20.sp, modifier = Modifier.padding(all = 24.dp))

                  Box(
                      modifier = Modifier.padding(20.dp),
                  ) {

                      Spacer(modifier = Modifier.padding(start  = 5.dp, top = 5.dp))
                      OutlinedTextField(
                          colors = TextFieldDefaults.outlinedTextFieldColors(
                              focusedBorderColor = Color.White,
                              unfocusedBorderColor = Color.White,
                              containerColor = Color.White,
                          ),
                          shape = RoundedCornerShape(50),
                          value = email,


                          modifier = Modifier.fillMaxWidth(),
                          onValueChange = { email = it }
                      )
                  }
                  Spacer(modifier = Modifier.padding(start  = 5.dp, top = 5.dp))
                  Text(text = "Digite sua senha", color = Color.White, fontSize = 20.sp, modifier = Modifier.padding(all = 24.dp))
                  Box(
                      modifier = Modifier.padding(20.dp),
                  ) {
                      OutlinedTextField(
                          colors = TextFieldDefaults.outlinedTextFieldColors(
                              focusedBorderColor = Color.White,
                              unfocusedBorderColor = Color.White,
                              containerColor = Color.White,
                          ),
                          shape = RoundedCornerShape(50),
                          value = passowrd,


                          modifier = Modifier.fillMaxWidth(),
                          onValueChange = { passowrd = it }
                      )
                  }

              }
            }


        }

    }




}
