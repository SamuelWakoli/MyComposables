package com.sam.mycomposables

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.EaseOutSine
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//TODO: Hoist states for expandable card

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextExpandableCard() {
    var isExpandedState by remember {
        mutableStateOf(false)
    }
    val rotationState by animateFloatAsState(
        targetValue = if (isExpandedState) 180f else 0f
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 400,
                    easing = EaseOutSine
                )
            ),
        shape = MaterialTheme.shapes.medium,
        onClick = { isExpandedState = !isExpandedState },
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = stringResource(R.string.title_text),
                    fontSize = MaterialTheme.typography.headlineSmall.fontSize,
                    fontWeight = FontWeight.Bold,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.weight(9f)
                )
                IconButton(
                    onClick = { isExpandedState = !isExpandedState },
                    modifier = Modifier
                        .weight(1f)
                        .rotate(rotationState),
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = stringResource(R.string.show_card_content),
                        modifier = Modifier.size(42.dp),
                    )
                }
            }
            if (isExpandedState) Text(
                text = stringResource(id = R.string.lorem_ipsum),
                fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                overflow = TextOverflow.Ellipsis,
                maxLines = 6,
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextExpandableCardPrev() {
    Column(modifier = Modifier.padding(16.dp)) {
        TextExpandableCard()
    }
}