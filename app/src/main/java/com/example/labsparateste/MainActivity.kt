package com.example.labsparateste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
const val PARAM1_NAME = "nome"
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
        var edit1 = findViewById<EditText>(R.id.editTextPersonName)
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, edit1.text.toString())
        }

        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.create_new -> {
                Toast.makeText(this,"create_new", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao2 -> {
                Toast.makeText(this,"opcao2", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao3 -> {
                Toast.makeText(this,"opcao3", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao4 -> {
                Toast.makeText(this,"opcao4", Toast.LENGTH_SHORT).show()
                true
            } else -> super.onOptionsItemSelected(item)
        }
    }
}
