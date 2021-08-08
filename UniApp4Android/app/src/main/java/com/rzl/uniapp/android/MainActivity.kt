package com.rzl.uniapp.android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.dcloud.feature.sdk.DCUniMPSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startUniapp(view : View) {
        // 启动测试小程序
        try {
            DCUniMPSDK.getInstance().startApp(applicationContext, "__UNI__C0C0F45")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}