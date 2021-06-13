package com.szxc.bluezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Thesecret : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thesecret)
        val button = findViewById<Button>(R.id.back)
        button.setOnClickListener() {
            val intent: Intent = Intent(this, Khai_bao_y_te::class.java)
            startActivity(intent)

        }
    }
}