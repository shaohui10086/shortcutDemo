package com.tinyable.shortcutexample

import android.content.Context
import android.content.Intent
import android.content.pm.ShortcutInfo
import android.content.pm.ShortcutManager
import android.graphics.drawable.Icon
import android.os.Build
import android.support.annotation.RequiresApi

/**
 * Created by flipboard on 2017/7/23.
 */
object SimpleShortcutManager {

    private val IDS = arrayOf("world_hot", "today", "daily_video", "recommendation")

    @RequiresApi(Build.VERSION_CODES.N_MR1)
    fun configShortcut(context: Context) {
        val shortcutManager = context.getSystemService(ShortcutManager::class.java)

        val worldHot = ShortcutInfo.Builder(context, IDS[0])
                .setShortLabel(context.getString(R.string.label_world_hot))
                .setIcon(Icon.createWithResource(context, R.drawable.ic_world_hot))
                .setIntent(Intent("com.tinyable.WorldHot"))
                .build()

        shortcutManager.dynamicShortcuts = arrayListOf(worldHot)

        val dailyVideo = ShortcutInfo.Builder(context, IDS[1])
                .setShortLabel(context.getString(R.string.label_daily_video))
                .setIcon(Icon.createWithResource(context, R.drawable.ic_world_hot))
                .setIntent(Intent("com.tinyable.DailyVideo"))
                .build()

        val today = ShortcutInfo.Builder(context, IDS[2])
                .setShortLabel(context.getString(R.string.label_today))
                .setIcon(Icon.createWithResource(context, R.drawable.ic_world_hot))
                .setIntent(Intent("com.tinyable.Today"))
                .build()

        val recommendation = ShortcutInfo.Builder(context, IDS[3])
                .setShortLabel(context.getString(R.string.label_recommendation))
                .setIcon(Icon.createWithResource(context, R.drawable.ic_world_hot))
                .setIntent(Intent("com.tinyable.Recommendation"))
                .build()

        shortcutManager.dynamicShortcuts = arrayListOf(worldHot, dailyVideo, today, recommendation)
    }

    fun disableShortcut() {

    }

    fun trackUsage() {

    }

}