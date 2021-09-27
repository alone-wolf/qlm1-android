package com.example.qlm1.ui.page

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qlm1.activitys.SubSettingsActivity
import com.example.qlm1.ui.compose.StatusBarPlaceHolder
import com.example.qlm1.ui.theme.SubViewTopTitleBarColor

object Sub {
    @Composable
    fun SubPage(context: Context?=null) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = SubViewTopTitleBarColor)
        ) {
            StatusBarPlaceHolder()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "订阅设置",
                    color = Color.Transparent,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 16.dp)
                )
                Text(text = "我的订阅", color = Color.White, fontSize = 20.sp)
                Text(text = "订阅设置", color = Color.White, fontSize = 16.sp, modifier = Modifier
                    .padding(end = 16.dp)
                    .clickable {
                        context?.startActivity(
                            Intent(
                                context,
                                SubSettingsActivity::class.java
                            )
                        )
                    })
            }
        }
    }
}