package com.example.homeworksapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homeworksapp.homework16.*
import com.example.homeworksapp.homework17.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val goToHomework16Button: Button = findViewById<Button>(R.id.goToHomework16Button)
        goToHomework16Button.setOnClickListener {
            val intent = Intent(this, Homework16MainActivity::class.java)
            startActivity(intent)
        }

        val goToHomework17Button: Button = findViewById<Button>(R.id.goToHomework17Button)
        goToHomework17Button.setOnClickListener {
            val intent = Intent(this, Homework17MainActivity::class.java)
            startActivity(intent)
        }


    }

}