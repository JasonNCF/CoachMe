package com.example.comp3330project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sign_in: Button = findViewById(R.id.button)
        sign_in.setOnClickListener {
            to_sign_in()
        }

        var sign_up: Button = findViewById(R.id.button2)
        sign_up.setOnClickListener {
            to_sign_up()
        }

        var sign_up_now: Button = findViewById(R.id.button6)
        sign_up_now.setOnClickListener {
            to_sign_up()
        }
    }

    fun to_sign_in(){
        val intent = Intent(this, Sign_in::class.java)
        startActivity(intent)
    }

    fun to_sign_up(){
        val intent = Intent(this, Sign_up::class.java)
        startActivity(intent)
    }
}