package com.sam.mycomposables

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextF() {
    var username by remember {
        mutableStateOf("Sam")
    }
    val mContext = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = username,
            onValueChange = { value -> username = value },
            supportingText = {
                Text(
                    text = "This is my supporting text",
                    color = MaterialTheme.colorScheme.error
                )
            },
            singleLine = true,
            maxLines = 1,
            keyboardActions = KeyboardActions(onDone = {
                Toast.makeText(
                    mContext,
                    username,
                    Toast.LENGTH_LONG
                ).show()
            }),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Text
            ),
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextPrev() {
    TextF()
}