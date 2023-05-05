package com.sam.mycomposables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SelectableText(text: String) {
    SelectionContainer() {
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun SelectableTextPrev() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        SelectableText(stringResource(id = R.string.lorem_ipsum))
    }
}

@Composable
fun PartialSelectableText(text: String) {
    SelectionContainer(modifier = Modifier.fillMaxSize()) {
        Column {
            Text(text = text)
            DisableSelection {
                Text(text = text)
            }
            Text(text = text)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PartialSelectableTextPrev() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        PartialSelectableText(stringResource(id = R.string.lorem_ipsum))
    }
}