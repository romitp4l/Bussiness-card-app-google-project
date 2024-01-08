package com.example.bussiness_card_app_google_project

import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bussiness_card_app_google_project.ui.theme.BussinesscardappgoogleprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinesscardappgoogleprojectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // Greeting("Android")

                    BussinessCardApp(modifier = Modifier)
                }
            }
        }
    }
}
@Composable
fun BussinessCardApp(modifier : Modifier){

    Column(
        modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        val image  = painterResource(id = R.drawable.android_logo)
        Image(image, contentDescription = "android - logo",
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
                )
        Text(
            text = "Romit Pal",
            color = Color.Black,
            style = MaterialTheme.typography.headlineLarge,
            fontFamily = FontFamily.SansSerif

        )

        Text("Android Developer  (Intern) ", color = Color(0xFF3ddc84))



        Column(modifier = modifier
            .padding(top = 200.dp)
            .padding(bottom = 80.dp)
            .fillMaxWidth(),
            //.Style = MaterialTheme.typography.titleSmall,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,


        ) {
            // phone row
            Row(
                modifier = Modifier

                    .fillMaxWidth().padding(start = 40.dp)
                    .padding(bottom = 20.dp),
            ){
                val icon1 = painterResource(id = R.drawable.phone)
                Icon(painter = icon1, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
                Text(text = " +91 6386745752", modifier = Modifier.padding(start = 25.dp),color = Color.Black , style = MaterialTheme.typography.titleMedium)
            }


            //  user handle row

            Row(
                modifier = Modifier.padding(bottom = 20.dp)

                    .fillMaxWidth().padding(start = 40.dp),
            ){
                val icon2 = painterResource(id = R.drawable.share)
                Icon(painter = icon2, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
                Text(text = "@romitp4l", modifier = Modifier.padding(start = 25.dp),color = Color.Black ,
                    style = MaterialTheme.typography.titleMedium)
            }



            //  email row

            Row(
                modifier = Modifier

                    .fillMaxWidth().padding(start = 40.dp),
            ){
                val icon3 = painterResource(id = R.drawable.email)
                Icon(painter = icon3, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
                Text(text = "romitpal4@gmail.com", modifier = Modifier.padding(start = 25.dp),color = Color.Black ,
                    style = MaterialTheme.typography.titleMedium)
            }


        }
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBussinessCardApp(){
    BussinesscardappgoogleprojectTheme {
        BussinessCardApp(modifier = Modifier)
    }
}

