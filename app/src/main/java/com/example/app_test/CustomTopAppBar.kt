package com.example.app_test

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomTopAppBar() {
    Box(
        modifier = Modifier
            .width(500.dp)
            .height(200.dp)
            .padding()
            .background(brush = Brush.verticalGradient(listOf(Color(0xFFFDA8A5) , Color(0xFFFA9ABB)))),

    ) {
        Column(modifier = Modifier.padding(horizontal = 5.dp)) {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Row() {


                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "",
                        tint = Color.White
                    )
                    Column(modifier = Modifier.padding(horizontal = 5.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {


                            Text(text = "Work", color = Color.White, fontWeight = FontWeight.Bold)
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowDown,
                                contentDescription = "",
                                tint = Color.White
                            )

                        }
                        Text(text = "Office no.1", color = Color.White)
                    }
                }
                Row {
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0xFFFFCB9C))
                    ) {
                        Text(text = "Gold")

                    }

                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.size(50.dp)
                    )

                }


            }
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp)
            ) {


                Box(
                    Modifier

                        .fillMaxWidth(.7f)
                        .height(40.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(20)),
                    contentAlignment = Alignment.Center


                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "",
                            modifier = Modifier.padding(top = 2.dp, start = 2.dp),
                            tint = Color(0xFFFA4C639)
                        )
                        Text(text = "Search \"Ice cream\"", color = Color.Gray)

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 5.dp)
                        ) {

                            Text(text = "|", color = Color.Gray)
                            Icon(
                                painter = painterResource(id = R.drawable.microphoneblackshape),
                                contentDescription = "",
                                modifier = Modifier
                                    .padding(top = 2.dp)
                                    .size(20.dp),
                                tint = Color(0xFFFA4C639)
                            )
                        }


                    }


                }
                Spacer(modifier = Modifier.width(40.dp))
                Column(
                    modifier = Modifier
                        .padding(2.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "VEG \nMODE",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Switch(checked = true, onCheckedChange = {},
                        modifier = Modifier.size(5.dp),
                        colors = SwitchDefaults.colors(checkedTrackColor = Color.Green, checkedThumbColor = Color.White)
                    )
                }
            }
        }
    }

}

@Preview
@Composable
private fun prv() {
    CustomTopAppBar()
}