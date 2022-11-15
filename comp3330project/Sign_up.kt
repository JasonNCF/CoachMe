package com.example.comp3330project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        /*var back: ImageButton = ImageButton(findViewById(R.id.back_button))
        back.setOnClickListener {
            to_main_page()
        }*/

        var sign_up_now: Button = findViewById(R.id.button6)
        sign_up_now.setOnClickListener {
            to_sign_in()
        }
    }

    fun to_main_page(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun to_sign_in(){
        val intent = Intent(this, Sign_in::class.java)
        startActivity(intent)
    }

}