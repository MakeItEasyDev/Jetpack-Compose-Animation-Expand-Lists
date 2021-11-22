package com.jetpack.animationexpandlist

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AnimationForStates() {
    DrawLayerWithAnimationAsStateAnimation()
    Divider()
}

@Composable
fun DrawLayerWithAnimationAsStateAnimation() {
    Spacer(modifier = Modifier.padding(20.dp))
    var draw by remember { mutableStateOf(false) }

    Box {
        Image(
            painter = painterResource(id = R.drawable.apple),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw) 30f else 5f).value,
                    translationX = animateFloatAsState(if (draw) 320f else 0f).value,
                    translationY = 0f
                )
                .clickable { draw = !draw }
        )
        Image(
            painter = painterResource(id = R.drawable.banana),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw) 30f else 10f).value,
                    translationX = animateFloatAsState(if (draw) -320f else 0f).value,
                    translationY = animateFloatAsState(if (draw) 0f else 30f).value
                )
                .clickable { draw = !draw }
        )
        Image(
            painter = painterResource(id = R.drawable.cherries),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw) 30f else 5f).value,
                    translationY = animateFloatAsState(if (draw) 0f else 50f).value
                )
                .clickable { draw = !draw }
        )
    }

    Spacer(modifier = Modifier.padding(30.dp))
    var draw1 by remember { mutableStateOf(false) }

    Box {
        Image(
           painter = painterResource(id = R.drawable.dates),
           contentDescription = "Image",
           contentScale = ContentScale.Crop,
           modifier = Modifier
               .size(150.dp)
               .graphicsLayer(
                   shadowElevation = animateFloatAsState(if (draw1) 30f else 5f).value,
                   translationX = animateFloatAsState(if (draw1) 320f else 0f).value,
                   rotationY = animateFloatAsState(if (draw1) 45f else 0f).value,
                   translationY = 0f
               )
               .clickable { draw1 = !draw1 }
        )
        Image(
            painter = painterResource(id = R.drawable.eggfruit),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw1) 30f else 10f).value,
                    translationX = animateFloatAsState(if (draw1) -320f else 0f).value,
                    rotationY = animateFloatAsState(if (draw1) 45f else 0f).value,
                    translationY = animateFloatAsState(if (draw1) 0f else 30f).value
                )
                .clickable { draw1 = !draw1 }
        )
        Image(
            painter = painterResource(id = R.drawable.fig),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw1) 30f else 5f).value,
                    translationY = animateFloatAsState(if (draw1) 0f else 50f).value,
                    rotationY = animateFloatAsState(if (draw1) 45f else 0f).value
                )
                .clickable { draw1 = !draw1 }
        )
    }

    Spacer(modifier = Modifier.padding(30.dp))
    var draw2 by remember { mutableStateOf(false) }

    Box {
        Image(
            painter = painterResource(id = R.drawable.grapes),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw2) 30f else 5f).value,
                    translationX = animateFloatAsState(if (draw2) 320f else 0f).value,
                    rotationZ = animateFloatAsState(if (draw2) 45f else 0f).value,
                    translationY = 0f
                )
                .clickable { draw2 = !draw2 }
        )
        Image(
            painter = painterResource(id = R.drawable.hackberry),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw2) 30f else 10f).value,
                    translationX = animateFloatAsState(if (draw2) -320f else 0f).value,
                    rotationZ = animateFloatAsState(if (draw2) 45f else 0f).value,
                    translationY = animateFloatAsState(if (draw2) 0f else 30f).value
                )
                .clickable { draw2 = !draw2 }
        )
        Image(
            painter = painterResource(id = R.drawable.imbe),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(150.dp)
                .graphicsLayer(
                    shadowElevation = animateFloatAsState(if (draw2) 30f else 5f).value,
                    translationY = animateFloatAsState(if (draw2) 0f else 50f).value,
                    rotationZ = animateFloatAsState(if (draw2) 45f else 0f).value,
                )
                .clickable { draw2 = !draw2 }
        )
        Spacer(modifier = Modifier.padding(60.dp))
    }
}
























