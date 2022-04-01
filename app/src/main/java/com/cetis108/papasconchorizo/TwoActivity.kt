package com.cetis108.papasconchorizo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val  btnGoThree = findViewById<Button>(R.id.buttonTwoGoThree)
        btnGoThree.setOnClickListener {
            val intent = Intent(this, ThreeActivity::class.java)
            this.startActivity(intent)
        }
    }
}