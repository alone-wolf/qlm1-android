package com.example.qlm1.ui.compose

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qlm1.activitys.MainSearchActivity
import com.example.qlm1.ui.theme.TopSearchBarIconColor
import com.example.qlm1.ui.theme.TopSearchBarTextColor

@Composable
fun TopSearchBarPart(
    scoreDp: Int,
    context: Context? = null,
    hotWordsList: List<String> = listOf(
        "Bob",
        "Jack",
        "Amy",
        "Sarah",
        "Light",
        "Dark"
    )
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.Gray,
                        Color.DarkGray
                    )
                ), alpha = if (scoreDp < 250F) (scoreDp / 250F) % 1F else 1F
            )
            .padding(top = 45.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(0.9F),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White, shape = RoundedCornerShape(23.dp))
                    .height(46.dp)
                    .clip(RoundedCornerShape(23.dp))
                    .border(width = 0.7.dp, color = Color.White, shape = RoundedCornerShape(23.dp))
                    .clickable {
                        context?.startActivity(Intent(context, MainSearchActivity::class.java))
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Spacer(modifier = Modifier.size(20.dp))
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    modifier = Modifier.size(30.dp),
                    tint = TopSearchBarIconColor,
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(text = "Search main abc or def", color = TopSearchBarTextColor)
            }
            Spacer(modifier = Modifier.size(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(0.8F),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "HOT", fontSize = 14.sp, color = Color.DarkGray)
                Text(text = "|", fontSize = 14.sp, color = Color.Gray,modifier = Modifier.padding(start = 4.dp,end = 4.dp))
                hotWordsList.forEach {
                    Text(text = it, fontSize = 14.sp, color = Color.Gray, modifier = Modifier
                        .clickable {
                            context?.startActivity(Intent(context, MainSearchActivity::class.java).apply {
                                putExtra("keyword",it)
                            })
                        }
                        .padding(8.dp))
                }
            }
        }

    }
}