package com.example.labsparateste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("****TAG ", "onCreate")
        //adicionei o metodo A

        //add method B
        
        //john added method c
    }

    override fun onPause() {
        super.onPause()
        Log.d("****TAG ", "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("****TAG ", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("****TAG ", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("****TAG ", "onDestroy")
    }

    override fun onResume() {
        super.onResume()
        Log.d("****TAG ", "onResume")
    }
}
