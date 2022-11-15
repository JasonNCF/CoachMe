package com.example.comp3330project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class Sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        /*var back: ImageButton = ImageButton(findViewById(R.id.back_button))
        back.setOnClickListener {
            to_main_page()
        }*/

        var sign_in: Button = findViewById(R.id.button5)
        sign_in.setOnClickListener {
            to_main_coach()
        }

        var sign_up_now: Button = findViewById(R.id.button6)
        sign_up_now.setOnClickListener {
            to_sign_up()
        }
    }

    fun to_main_page(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun to_main_coach(){
        val intent = Intent(this, main_coach::class.java)
        startActivity(intent)
    }

    fun to_sign_up(){
        val intent = Intent(this, Sign_up::class.java)
        startActivity(intent)
    }


}
