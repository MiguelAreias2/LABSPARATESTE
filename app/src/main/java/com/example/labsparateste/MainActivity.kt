package com.example.labsparateste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adicionei o metodo A

        //add method B
        
        //john added method c

        // add method d
        Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show()
    }
}
