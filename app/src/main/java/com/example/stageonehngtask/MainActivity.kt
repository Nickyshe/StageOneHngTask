package com.example.stageonehngtask

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.stageonehngtask.ui.theme.StageOneHngTaskTheme
import androidx.compose.ui.tooling.preview.Preview as Preview1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            Column(
                modifier = Modifier

                    .fillMaxSize()
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {

                Image(
                    painter = painterResource(id = R.drawable.slackphoto),
                    contentScale = ContentScale.Crop,
                    contentDescription = null,


                    modifier = Modifier
                        .size(200.dp)
                        .padding(8.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "Slack Username",
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Etugbo Judith Ogheneujiro",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    maxLines = 1,
                    textAlign = TextAlign.Center
                   // overflow = TextOverflow.Ellipsis

                )

                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {
                        openWebViewActivity() // Handle button click to open WebView
                        // openWebView(url = "https://github.com/Nickyshe")
                    },
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    modifier = Modifier

                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Text(
                        text = "Open Github",
                        fontSize = 16.sp
                    )
                }

            }
        }
    }

    private fun openWebViewActivity() {
        val intent = Intent(this@MainActivity, WebViewActivity::class.java)
        startActivity(intent)
    }

}




