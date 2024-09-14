package com.example.app_test

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.app_test.ui.theme.ApptestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApptestTheme {
                val navHostController = rememberNavController()
                MainScreen(navHostController)
            }
        }
    }
}

data class rowData(
    val id:Int,
    val text:String
)
@Composable
fun MainScreen(navHostController: NavHostController) {
    val list1 = listOf(rowData(R.drawable.food1,"60"),rowData(R.drawable.food2,"65"),rowData(R.drawable.food3,"70"))
    val list2 = listOf(rowData(R.drawable.food2,"60"),rowData(R.drawable.food5,"65"),rowData(R.drawable.food6,"70"))

    Scaffold(topBar = { CustomTopAppBar()}, bottomBar = { BottomNavBar(navHostController)}) { innerPadding ->
       Column(modifier = Modifier
           .fillMaxSize()
           .padding(top = innerPadding.calculateTopPadding()),) {
           Row (modifier = Modifier.fillMaxWidth() , horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){


               Text(text = "FOR YOU", color = Color.Black)
           }
           Row {

           }
           Column(modifier = Modifier.fillMaxSize()) {



           LazyRow(modifier = Modifier
               .fillMaxWidth()
               ) {
               items(list1){ it->
                   CustomCard(image = it.id, text = it.text)
                   Spacer(modifier =Modifier.width(4.dp))
               }

           }
               Spacer(modifier = Modifier.height(20.dp))
               LazyRow(modifier = Modifier
                   .fillMaxWidth()
               ) {
                   items(list2){ it->
                       CustomCard(image = it.id, text = it.text)
                   }

               }
           }


       }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApptestTheme {
        val navHostController = rememberNavController()
MainScreen(navHostController)
    }
}