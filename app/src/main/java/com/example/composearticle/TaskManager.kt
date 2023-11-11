package com.example.composearticle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

@Composable
fun TaskManager (modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(stringResource(R.string.all_tasks_completed), fontWeight = FontWeight.Bold,  modifier = Modifier.padding(top=24.dp, bottom = 8.dp))
        Text(stringResource(R.string.nice_work), fontSize = 16.sp)
    }
}

@Preview
@Composable
fun TaskManagerPreview () {
    ComposeArticleTheme {
        TaskManager()
    }
}