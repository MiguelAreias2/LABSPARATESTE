package com.example.labsparateste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adicionei o metodo A

        //add method B
        
        //john added method c
    }
    fun button1(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editTextPersonName)
        Toast.makeText(this,editTextHello.text.toString(),Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(editTextHello.text)
    }

    fun button3(view: View) {

    }
}
