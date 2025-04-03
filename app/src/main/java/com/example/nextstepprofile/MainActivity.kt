package com.example.nextstepprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nextstepprofile.ui.theme.NextStepProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {

            ProfileScreen()

        }
    }
}

@Composable
fun ProfileScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Spacer(
            modifier = Modifier
                .height(40.dp)
        )
        Spacer( //it will be the photo
            modifier = Modifier
                .background(Color.Green, shape = CircleShape)
                .width(120.dp)
                .height(120.dp)
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        Text(//username
            "mokekinho",
            fontWeight = FontWeight.Bold,
            fontSize = 23.sp,
            color = Color.White,
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text( //Descriprion
            "My name is Moisés, I'm Brazilian and I'm trying to learn Kotlin and Android Development",
            fontSize = 18.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 3.dp, end = 3.dp)
        )
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Button(
            onClick = {
                // implements the followAction
            }
        ) {
            Text("Follow")
        }

        Spacer(
            modifier = Modifier
                .height(20.dp)
                .fillMaxWidth()

        )
        LazyColumn(
            modifier = Modifier
                //LAZY COLUMN IS SCROLLABLE BY DEFAULT userScrollEnabled
                .fillMaxSize()

            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            items(100){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                ) {

                    Spacer( //images
                        modifier = Modifier
                            .width(150.dp)
                            .height(150.dp)
                            .padding(5.dp)
                            .background(color = Color.White)
                            .weight(1f)
                    )
                    Spacer( //images
                        modifier = Modifier
                            .width(150.dp)
                            .height(150.dp)
                            .padding(5.dp)
                            .background(color = Color.White)
                            .weight(1f)
                    )
                    Spacer( //images
                        modifier = Modifier
                            .width(150.dp)
                            .height(150.dp)
                            .padding(5.dp)
                            .background(color = Color.White)
                            .weight(1f)
                    )


                }

            }

        }



    }

}


