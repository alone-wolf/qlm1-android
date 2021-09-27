package com.example.qlm1.ui.page

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconToggleButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qlm1.Utils
import com.example.qlm1.ui.compose.TopSearchBarPart
import com.example.qlm1.ui.theme.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

object Home {
    @ExperimentalPagerApi
    @Composable
    fun HomePage(context: Context) {
        val verticalScrollStatus = rememberScrollState(0)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = GrayBackGround)
                .verticalScroll(verticalScrollStatus),
//            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val pagerState = rememberPagerState(pageCount = 2)
            HorizontalPager(state = pagerState) { page ->
                // Our page content
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .background(color = if (page == 0) PagerColor1 else PagerColor2),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = "Hi There Hello What Hot Cold $page",
                    )
                }
            }
            PList()
            PList()
            PList()
            PList()
            Text(text = "End of List")
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            TopSearchBarPart(scoreDp = Utils.px2dip(context, verticalScrollStatus.value), context)
        }
    }
}

@Composable
fun PList() {
    Column(
        modifier = Modifier.fillMaxWidth(0.95F),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BigTitle()
        var a = 0;
        while (a < 4) {
            a++
            Row {
                PListItem {}
            }
            Spacer(modifier = Modifier.size(14.dp))
        }
    }
}

@Composable
fun BigTitle() {
    Row(
        modifier = Modifier
            .fillMaxWidth(0.95F)
            .padding(top = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "ABCDEFG", fontWeight = FontWeight.Bold, fontSize = 22.sp)
            Spacer(modifier = Modifier.size(12.dp))
            Icon(
                imageVector = Icons.Outlined.LocationOn,
                contentDescription = "",
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.size(2.dp))
            Text(text = "HengShui", fontWeight = FontWeight.Light)
        }
        Text(text = "See More >", color = SeeMoreTextColor, fontSize = 14.sp)
    }
}

@Composable
fun PListItem(onClick:()->Unit={}) {
    Column(
        modifier = Modifier
            .background(
                color = ItemBackGround,
                shape = RoundedCornerShape(4.dp)
            )
            .clip(shape = RoundedCornerShape(4.dp))
            .clickable(enabled = true, onClick = onClick)
            .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 10.dp)
            .fillMaxWidth()
    ) {
        Row {
            Text(
                text = "和田市努尔巴格街道办事处的合同公告",
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
        Spacer(modifier = Modifier.size(4.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column() {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "中标", modifier = Modifier
                            .padding(end = 8.dp)
                            .background(
                                color = ItemTagABackground,
                                shape = RoundedCornerShape(topStart = 4.dp, bottomEnd = 4.dp)
                            )
                            .padding(top = 2.dp, bottom = 2.dp, start = 3.dp, end = 3.dp),
                        color = ItemTagAForeground,
                        fontSize = 12.sp
                    )
                    Text(text = "和田市", color = ItemTagBTextColor, fontSize = 12.sp)
                    Text(
                        text = "|",
                        color = ItemTagBTextColor,
                        modifier = Modifier.padding(start = 4.dp, end = 4.dp),
                        fontSize = 12.sp
                    )
                    Text(text = "中标", color = ItemTagBTextColor, fontSize = 12.sp)
                    Text(
                        text = "|",
                        color = ItemTagBTextColor,
                        modifier = Modifier.padding(start = 4.dp, end = 4.dp),
                        fontSize = 12.sp
                    )
                    Text(text = "2021-05-06", color = ItemTagBTextColor, fontSize = 12.sp)

                }
            }
            Column() {
                IconToggleButton(
                    checked = false,
                    onCheckedChange = {},
                    modifier = Modifier.size(20.dp)
                ) {
                    Icon(imageVector = Icons.Outlined.Star, contentDescription = "",tint = PrimaryForeground)
                }
            }
        }
    }
}