package com.example.certificatingcourse2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certificatingcourse2026.ui.theme.CertificatingCourse2026Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CertificatingCourse2026Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CertificatingCourse(
                        name = "Luna Gómez Ángel Harim",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(name: String, modifier: Modifier = Modifier) {
    val number = 2
    val course = "Android"

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.android),
            contentDescription = null, alpha = 0.3F,
            modifier = modifier.fillMaxWidth()
        )

        Text(
            text = "Luna Gómez Ángel Harim", modifier = modifier.fillMaxWidth(),
            fontSize = 29.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(vertical = 0.dp)
    ) {


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = modifier
                .fillMaxWidth()

            ) {
            Image(
                painter = painterResource(
                    id = R.drawable.unam
                ),
                contentDescription = null,
                modifier = modifier.size(50.dp, 50.dp)
                )
            Text(
                text = "Empresa de Programación",
                fontSize = 18.sp,
                )
            Image(
                painter = painterResource(
                    id = R.drawable.fiunam
                    ),
                contentDescription = null,
                modifier = modifier.size(50.dp, 50.dp)
                )
            }

        Text(
            text = "This certificate is presented to:",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
            )


        Text(
            text = "Has successfully completed a $number hours course on",
            fontSize = 14.sp,
                    modifier = modifier
                    .fillMaxWidth(),
                textAlign =TextAlign.Center
            )

            Text(
                text = course,
                fontSize = 30.sp,
                modifier = modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold)



            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier.fillMaxWidth()
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = modifier
                ) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.firma1),
                        contentDescription = null,
                        modifier = modifier.size(100.dp, 100.dp)
                    )
                    Text(text = "Lic. Julian Alvarez",
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(text = "Representatives")
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = modifier
                ) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.firma2),
                        contentDescription = null,
                        modifier = modifier.size(100.dp, 100.dp)
                    )
                    Text(text = "Lic. Messi Ronaldo",
                        fontWeight = FontWeight.SemiBold)
                    Text(text = "Representatives")
                }
            }


    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CertificatingCourse2026Theme {
        CertificatingCourse("Android")
    }
}