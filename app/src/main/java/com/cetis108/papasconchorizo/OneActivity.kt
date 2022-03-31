package com.cetis108.papasconchorizo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        val btnGoTwo = findViewById<Button>(R.id.buttonOneGoTwo)
        btnGoTwo.setOnClickListener {
            val intent = Intent(this, TwoActivity::class.java)
            this.startActivity(intent)
            this.finish()
        }
    }
}