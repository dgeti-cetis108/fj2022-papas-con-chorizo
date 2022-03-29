package com.cetis108.papasconchorizo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class LifeCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("Estoy en onStart")
    }

    // onCreate, onStart, onResume, onPause, onStop, onRestart, onDestroy

    override fun onResume() {
        super.onResume()
        showMessage("Estoy en onResume")
    }

    override fun onPause() {
        super.onPause()
        showMessage("Estoy en onPause")
    }

    override fun onStop() {
        super.onStop()
        showMessage("Estoy en onStop")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("Estoy en onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("Estoy en onDestroy")
    }
}