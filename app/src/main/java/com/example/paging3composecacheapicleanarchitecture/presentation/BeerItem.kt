package com.example.paging3composecacheapicleanarchitecture.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.paging3composecacheapicleanarchitecture.domain.Beer
import com.example.paging3composecacheapicleanarchitecture.ui.theme.Paging3ComposeCacheAPICleanArchitectureTheme

@Composable
fun BeerItem(
    beer: Beer,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier,
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(IntrinsicSize.Max)
        ) {
            AsyncImage(
                model = beer.imageUrl,
                contentDescription = beer.name,
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = beer.name,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = beer.tagline,
                    fontStyle = FontStyle.Italic,
                    color = Color.LightGray,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = beer.description,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "First Brewed in ${beer.firstBrewed}",
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 8.sp,
                    textAlign = TextAlign.End
                )
            }
        }
    }

}

@Preview
@Composable
fun BeerItemPreview() {
    Paging3ComposeCacheAPICleanArchitectureTheme {
        BeerItem(
            beer = Beer(
                id = 1,
                name = "Beer",
                tagline = "coolest beer probably",
                firstBrewed = "07/2023",
                "This is a cool beer\nThis is the next line",
                null
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}
