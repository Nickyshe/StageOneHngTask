package com.example.stageonehngtask

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.stageonehngtask.ui.theme.StageOneHngTaskTheme

class WebViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WebViewContent()

        }
    }
}

@Composable
fun WebViewContent() {
    val context = LocalContext.current
    val webView = remember {
        WebView(context)
    }

    val settings = webView.settings
    settings.javaScriptEnabled = true
    settings.loadWithOverviewMode = true
    settings.useWideViewPort = true
    settings.cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK

    val url = "https://github.com/Nickyshe"
    webView.loadUrl(url)

    AndroidView(
        factory = { webView },
        modifier = Modifier.fillMaxSize()
    ) { androidWebView ->

    }
}
