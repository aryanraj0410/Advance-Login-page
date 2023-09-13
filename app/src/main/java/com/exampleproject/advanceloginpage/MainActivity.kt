package com.exampleproject.advanceloginpage

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exampleproject.advanceloginpage.ui.theme.AdvanceLoginPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdvanceLoginPageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Advlogin()
                    TextShadow()
                    Login()

                }
            }
        }
    }
}

@Composable
fun Advlogin(){
    Surface(modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(R.drawable.primarybg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .width(400.dp)
                .paint(
                    painter = painterResource(R.drawable.primarybg)
                )
        )

    }


}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Text(text = "Username", modifier = Modifier.padding(start = 25.dp))
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = {
                Text(
                    "username",
                    fontWeight = FontWeight.Bold
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            singleLine = true
        )
        //Text(text = "password", modifier = Modifier.padding(start = 25.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text(
                    "password",
                    fontWeight = FontWeight.Bold
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Image(painter = painterResource(id = R.drawable.amazonnn), contentDescription =null,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp))
            Image(painter = painterResource(id = R.drawable.myntra), contentDescription =null,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp))
            Image(painter = painterResource(id = R.drawable.flip), contentDescription =null,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp))

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val contextForToast = LocalContext.current.applicationContext

            Button(
                onClick = {

                },
                shape = RoundedCornerShape(size = 20.dp)
            ) {
                Text(text = "Login")
            }
            val contextForToas = LocalContext.current.applicationContext

            Button(
                onClick = {

                },
                shape = RoundedCornerShape(size = 20.dp)
            ) {
                Text(text = "Login")
            }
            val contextForToa = LocalContext.current.applicationContext

            Button(
                onClick = {

                },
                shape = RoundedCornerShape(size = 20.dp)
            ) {
                Text(text = "Login")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center)
        {
            val checkedState = remember { mutableStateOf(true) }
            Column(
                modifier = Modifier, verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = {
                        checkedState.value = it
                    }
                )


        }
            Text(text = "Remember me",
                fontSize = 15.sp,
                modifier = Modifier.padding(8.dp))

        }

    }
}






@Composable
fun TextShadow() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(), content ={
            Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            val offset = Offset(5.0f, 10.0f)
            Text(
                text = "login",
                color = Color.White,
                fontWeight = FontWeight.Bold,

                style = TextStyle(
                    fontSize = 45.sp,
                    shadow = Shadow(
                        color = Color.DarkGray, offset = offset, blurRadius = 10f
                    )
                )
            )
        }
        Box(modifier =Modifier.height(60.dp).width(60.dp)) {
            Image(
                painter = painterResource(id = R.drawable.flip),
                contentDescription = null,

                modifier = Modifier
                    .clip(CircleShape)
                    .size(50.dp)
            )

        }
        }
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdvanceLoginPageTheme {
        Advlogin()
        TextShadow()
        Login()


    }
}