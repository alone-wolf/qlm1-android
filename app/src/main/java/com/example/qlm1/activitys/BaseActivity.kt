package com.example.qlm1.activitys

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity

open class BaseActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.decorView?.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        window?.statusBarColor = Color.TRANSPARENT


        window.attributes.apply {
            // 设置视图内容是否显示到异形切口区域
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                // 如果最低版本支持小于28，需要增加判断，防止在低版本系统运行时找不到系统API崩溃
                layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
            }
        }

            window?.navigationBarColor = Color.parseColor("#FFFFFFFF")
    }
}