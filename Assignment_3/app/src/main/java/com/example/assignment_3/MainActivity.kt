package com.example.assignment_3

import com.example.assignment_3.ui.theme.Assignment_3Theme

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen1()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen1(){
    var username by remember { mutableStateOf( "") }
    var password by remember { mutableStateOf( "") }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray) ,
                verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "Login Page",
            modifier = Modifier
                .size(150.dp)
                .padding(16.dp)
        )
        Text(
            text = "Login To Your Account",
            style = MaterialTheme.typography.headlineMedium.copy(color = Color.Black)
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text( "Username")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text( "Password")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {

                }
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )


        Button(
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
            onClick = {
                val url = "https://google.com/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if(intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                } else{
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },

            ) {
            Icon(
                painter = painterResource(id = R.drawable.google),
                modifier = Modifier.size(36.dp),
                contentDescription = "drawable icons",
                tint = Color.Unspecified
            )
            Text(
                text = "Google",
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .offset(x = -36.dp / 2) //default icon width = 24.dp
            )
        }



        Button(
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
            onClick = {
                val url = "https://www.microsoft.com/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if(intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                } else{
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },

            ) {
            Icon(
                painter = painterResource(id = R.drawable.microsoft),
                modifier = Modifier.size(36.dp),
                contentDescription = "drawable icons",
                tint = Color.Unspecified
            )
            Text(
                text = "Microsoft",
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .offset(x = -36.dp / 2) //default icon width = 24.dp
            )

            }
        Button(
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
            onClick = {
                val url = "https://yahoo.com/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if(intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                } else{
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },

            ) {
            Icon(
                painter = painterResource(id = R.drawable.yahoo),
                modifier = Modifier.size(36.dp),
                contentDescription = "drawable icons",
                tint = Color.Unspecified
            )
            Text(
                text = "Yahoo",
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .offset(x = -36.dp / 2) //default icon width = 24.dp
            )
        }
        Button(
            modifier = Modifier.padding(16.dp),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.White),
            onClick = {
                val url = "https://amazon.com/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

                if(intent.resolveActivity(context.packageManager) != null) {
                    context.startActivity(intent)
                } else{
                    Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
                }
            },

            ) {
            Icon(
                painter = painterResource(id = R.drawable.amazon),
                modifier = Modifier.size(36.dp),
                contentDescription = "drawable icons",
                tint = Color.Unspecified
            )
            Text(
                text = "Amazon",
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .offset(x = -36.dp / 2) //default icon width = 24.dp
            )
        }


    }

}