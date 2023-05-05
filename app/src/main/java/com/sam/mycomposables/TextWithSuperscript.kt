package com.sam.mycomposables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextWithSuperscript(
    text: String,
    superScriptText: String,
    textFontSize: TextUnit = 14.sp,
    superScriptTextFontSize: TextUnit = 8.sp,
) {
    Text(text = buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = textFontSize,
            )
        ) { append(text) }
        withStyle(
            style = SpanStyle(
                baselineShift = BaselineShift.Superscript,
                fontSize = superScriptTextFontSize,
            )
        ) { append(superScriptText) }
    })
}

@Preview(showBackground = true)
@Composable
fun TextWithSuperscriptPrev() {
    TextWithSuperscript(
        text = "Android", superScriptText = "TM",
    )
}