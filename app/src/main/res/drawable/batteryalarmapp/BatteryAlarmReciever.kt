package com.example.batteryalarmapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager

class BatteryAlarmReciever(private val reciever:(Boolean)->Unit): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            if(Intent.ACTION_BATTERY_CHANGED.equals(intent.action)) {
                val level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
                val scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
                val batteryPctLow = (level * 100 / scale).toInt() <20
            }
        }
    }

    }