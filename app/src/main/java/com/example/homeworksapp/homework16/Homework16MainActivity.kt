package com.example.homeworksapp.homework16

import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homeworksapp.R

class Homework16MainActivity : AppCompatActivity() {
    private lateinit var wifiReceiver: WifiStateReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homework16_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        wifiReceiver = WifiStateReceiver()
        val filter = IntentFilter(WifiManager.WIFI_STATE_CHANGED_ACTION)
        registerReceiver(wifiReceiver, filter)
        Toast.makeText(this, "BroadcastReceiver зарегистрирован", Toast.LENGTH_SHORT).show()

        val homework16MainButton: Button = findViewById<Button>(R.id.homework16MainButton)
        homework16MainButton.setOnClickListener {
            val editText: EditText = findViewById<EditText>(R.id.homework16EditText)
            val userName = editText.text.toString().trim()
            val intent = Intent(this, Homework16SecondActivity::class.java)
            intent.putExtra("username", userName)
            startActivity(intent)
        }

        Log.i("Logging", "Homework16 main activity created")

    }


    override fun onStart() {
        super.onStart()
        Log.i("Logging", "Homework16 main activity started")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Logging", "Homework16 main activity resumed")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Logging", "Homework16 main activity stopped")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Logging", "Homework16 main activity restarted")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Logging", "Homework16 main activity destroyed")
    }


}