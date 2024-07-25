package com.example.batteryalarmapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import androidx.compose.runtime.Composable

class BatteryAlarmReciever(private val isBatteryLow: (Boolean)->Unit): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            when (intent.action) {
                Intent.ACTION_BATTERY_LOW -> isBatteryLow(true)
                Intent.ACTION_BATTERY_OKAY -> isBatteryLow(false)
            }
        }
    }
}