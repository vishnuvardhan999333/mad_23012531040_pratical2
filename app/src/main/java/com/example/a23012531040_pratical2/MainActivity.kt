
package com.example.a23012531040_pratical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logAndShowMessage("onCreate")
    }

    override fun onStart() {
        super.onStart()
        logAndShowMessage("onStart")
    }

    override fun onResume() {
        super.onResume()
        logAndShowMessage("onResume")
    }

    override fun onPause() {
        super.onPause()
        logAndShowMessage("onPause")
    }

    override fun onStop() {
        super.onStop()
        logAndShowMessage("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        logAndShowMessage("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        logAndShowMessage("onDestroy")
    }

    private fun logAndShowMessage(message: String) {
        Log.d(TAG, "Activity Life Cycle: $message")
        Toast.makeText(this, "Activity Life Cycle: $message", Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.main), "Activity Life Cycle: $message", Snackbar.LENGTH_SHORT).show()
    }
}
