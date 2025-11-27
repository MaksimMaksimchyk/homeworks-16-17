package com.example.homeworksapp.homework16

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.widget.Toast

class WifiStateReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == WifiManager.WIFI_STATE_CHANGED_ACTION) {
            val state = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, -1)
            when (state) {
                WifiManager.WIFI_STATE_ENABLED ->
                    Toast.makeText(context, "Wi-Fi включен", Toast.LENGTH_LONG).show()
                WifiManager.WIFI_STATE_DISABLED ->
                    Toast.makeText(context, "Wi-Fi выключен", Toast.LENGTH_LONG).show()
            }
        }
    }
}