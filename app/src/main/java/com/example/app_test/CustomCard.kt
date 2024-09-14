package com.example.app_test

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomCard(image:Int,text:String) {
    Box (modifier = Modifier
        .background(color = Color.Transparent, shape = RoundedCornerShape(20))
        .fillMaxWidth()
        .height(150.dp) ){
        Image(painter = painterResource(id = image), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.FillBounds)
          Box(modifier = Modifier.fillMaxSize()){
              Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                  Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "", tint = Color.White, modifier = Modifier.size(20.dp))
              }
              Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom){
                  Text(text = text+"%OFF", color = Color.White, fontWeight = FontWeight.Bold)
                  Text(text = "Upto 120", fontSize = 8.sp, color = Color.White, fontWeight = FontWeight.Light, modifier =Modifier)

              }
          }

    }

}

@Preview
@Composable
private fun prr() {
    CustomCard(image = R.drawable.food1, text = "60")
}