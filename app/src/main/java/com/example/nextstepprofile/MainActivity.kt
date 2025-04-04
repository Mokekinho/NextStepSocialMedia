package com.example.nextstepprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
            val profile = painterResource(R.drawable.perfiloficial)
            val userName = "mokekinho"
            val description = "My name is Moisés, I'm Brazilian and I'm trying to learn Kotlin and Android Development"
            val feedImages = listOf(
                painterResource(R.drawable.feed1),
                painterResource(R.drawable.feed2),
                painterResource(R.drawable.perfiloficial),
                painterResource(R.drawable.feed1),
                painterResource(R.drawable.feed2),
                painterResource(R.drawable.perfiloficial),
                painterResource(R.drawable.feed1),
                painterResource(R.drawable.feed2),
                painterResource(R.drawable.perfiloficial),
                painterResource(R.drawable.feed1),
                painterResource(R.drawable.feed2),
                painterResource(R.drawable.perfiloficial),
                painterResource(R.drawable.feed1),
                painterResource(R.drawable.feed2),
                painterResource(R.drawable.perfiloficial),
                painterResource(R.drawable.feed1),
                painterResource(R.drawable.feed2),
                painterResource(R.drawable.perfiloficial),
                painterResource(R.drawable.perfiloficial),

            )

            ProfileScreen(
                profile,
                userName,
                description,
                feedImages,
            )


        }
    }
}

@Composable
fun ProfileScreen(
    profile : Painter,
    userName : String,
    description : String,
    feedImages : List<Painter>
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Spacer(
            modifier = Modifier
                .height(40.dp)
        )
        Image( //it will be the photo
            profile,
            null,
            contentScale = ContentScale.Crop, //make it fill all the spaces
            modifier = Modifier
                .size(120.dp) //better because it get the height and the width
                .clip(CircleShape) //cut the image in the circle shape
        )
        Spacer(
            modifier = Modifier
                .height(30.dp)
        )
        Text(//username
            userName,
            fontWeight = FontWeight.Bold,
            fontSize = 23.sp,
            color = Color.White,
        )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text( //Descriprion
            description,
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
        LazyVerticalGrid(
            GridCells.Fixed(3),

        ) {
            items(feedImages){
                Image(
                    it,
                    null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .padding(1.dp)
                        .align(Alignment.CenterHorizontally)

                )
            }
        }



    }

}


@Preview
@Composable
fun Preview(){
    val profile = painterResource(R.drawable.perfiloficial)
    val userName = "mokekinho"
    val description = "My name is Moisés, I'm Brazilian and I'm trying to learn Kotlin and Android Development"
    val feedImages = listOf(
        painterResource(R.drawable.feed1),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.perfiloficial),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.feed1),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.perfiloficial),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.feed1),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.perfiloficial),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.feed1),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.perfiloficial),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.feed1),
        painterResource(R.drawable.feed2),
        painterResource(R.drawable.perfiloficial),
        painterResource(R.drawable.feed2),

    )

    ProfileScreen(
        profile,
        userName,
        description,
        feedImages,
    )
}

