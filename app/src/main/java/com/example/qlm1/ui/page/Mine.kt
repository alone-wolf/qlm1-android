package com.example.qlm1.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.qlm1.ui.compose.IconLabel
import com.example.qlm1.ui.compose.StatusBarPlaceHolder
import com.example.qlm1.ui.theme.GrayBackGround
import com.example.qlm1.ui.theme.ItemBackGround
import com.example.qlm1.ui.theme.PrimaryForeground

object Mine {
    @Composable
    fun MinePage() {
        Column(
            modifier = Modifier.background(color = GrayBackGround),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .background(color = PrimaryForeground)) {
                StatusBarPlaceHolder()
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "")
                    Icon(imageVector = Icons.Outlined.ExitToApp, contentDescription = "")
                }
                Spacer(modifier = Modifier.size(8.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "",
                        modifier = Modifier
                            .size(60.dp)
                            .background(color = Color.LightGray, shape = CircleShape)
                    )
                    Column {
                        Text(text = "username")
                        Row {
                            Text(text = "bbbbbb>")
                        }
                    }
                }
            }
            Column(
                modifier = Modifier.fillMaxWidth(0.95F)
            ) {
                Spacer(modifier = Modifier.size(8.dp))

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(color = ItemBackGround, shape = RoundedCornerShape(4.dp))) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 40.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 40.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 40.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 40.dp)
                    }
                }
                Spacer(modifier = Modifier.size(8.dp))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = ItemBackGround, shape = RoundedCornerShape(4.dp)),
                ) {
                    Row {
                        Text(text = "changyonggongju")
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        IconLabel(size = 60.dp,icon = Icons.Outlined.Share, label = "Publish", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Outlined.Favorite, label = "Watch", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                    }
                    Spacer(modifier = Modifier.size(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                        IconLabel(size = 60.dp,icon = Icons.Default.Star, label = "Saved", iconSize = 30.dp)
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "kfrx: 400-688-2000")
            }
        }
    }
}