package com.cetis108.papasconchorizo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}