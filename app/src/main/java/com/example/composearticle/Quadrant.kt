package com.example.composearticle

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composearticle.ui.theme.ComposeArticleTheme

@Composable
fun Content(title: String, subtitle: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {
        Text(title, fontWeight = FontWeight.Bold)
        Text(
            subtitle,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxHeight(0.5F)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5F)
                    .background(Color(0xFFEADDFF))
            ) {
                Content(
                    stringResource(R.string.text_composable),
                    stringResource(R.string.text_composable_content)
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFD0BCFF))
            ) {
                Content(
                    title = stringResource(R.string.image_composable),
                    subtitle = stringResource(R.string.image_composable_content)
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.5F)
                    .background(Color(0xFFB69DF8))
            ) {
                Content(
                    title = stringResource(R.string.row_composable),
                    subtitle = stringResource(R.string.row_composable_content)
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF6EDFF))
            ) {
                Content(
                    title = stringResource(R.string.column_composable),
                    subtitle = stringResource(R.string.column_composable_content)
                )
            }
        }
    }
}

@Preview
@Composable
fun QuadrantPreview() {
    ComposeArticleTheme {
        Quadrant()
    }
}