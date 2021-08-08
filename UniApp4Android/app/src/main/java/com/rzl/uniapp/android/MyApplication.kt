package com.rzl.uniapp.android

import android.app.Application
import io.dcloud.feature.sdk.DCUniMPSDK
import java.util.*
import io.dcloud.feature.sdk.DCSDKInitConfig
import io.dcloud.feature.sdk.MenuActionSheetItem


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // sdk初始化代码
        val sheetItems: List<MenuActionSheetItem> =
            ArrayList<MenuActionSheetItem>()
        val config: DCSDKInitConfig = DCSDKInitConfig.Builder()
            .setCapsule(true)
            .setMenuDefFontSize("16px")
            .setMenuDefFontColor("#ff00ff")
            .setMenuDefFontWeight("normal")
            .setMenuActionSheetItems(sheetItems)
            .build()

        DCUniMPSDK.getInstance().initialize(this, config)
    }
}