package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG ="Main Activity"
class MainActivity : AppCompatActivity() {
    fun division(){
        val numerator=60
        val denominator=4
        repeat(5){
            Log.v(TAG, "${numerator/denominator}")
        }
    }
    fun logging(){
        Log.v{TAG, "Hello World"}
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }
}