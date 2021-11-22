package com.jetpack.animationexpandlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.jetpack.animationexpandlist.ui.theme.AnimationExpandListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationExpandListTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        modifier = Modifier,
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = "Animation Expand Lists",
                                        modifier = Modifier.fillMaxWidth(),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            )
                        },
                        content = {
                            AnimationExpandList()
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun AnimationExpandList() {
    LazyColumn(
        state = rememberLazyListState(),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        item { AnimationForStates() }
        item { Spacer(modifier = Modifier.padding(bottom = 50.dp, end = 50.dp, start = 50.dp)) }
    }
}
















