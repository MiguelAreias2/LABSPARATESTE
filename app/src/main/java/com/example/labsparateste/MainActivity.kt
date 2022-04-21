package com.example.labsparateste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
const val PARAM1_NAME = "nome"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,R.string.mensagem,Toast.LENGTH_SHORT).show()

    }


    override fun onResume() {
        super.onResume()
        Toast.makeText(this,R.string.mensagem,Toast.LENGTH_SHORT).show()

    }




    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.Clean -> {
                 findViewById<EditText>(R.id.etPreco).setText("")
                 findViewById<EditText>(R.id.etQuantidade).setText("")
                 findViewById<TextView>(R.id.tvPreco).setText("")

                true
            }else -> super.onOptionsItemSelected(item)
        }
    }

    fun calculaPagamento(view: View) {
        val editTextPreco = findViewById<EditText>(R.id.etPreco)
        val editTextQuantidade = findViewById<EditText>(R.id.etQuantidade)
        val checkBox = findViewById<CheckBox>(R.id.cbIva)
        val tvPreco = findViewById<TextView>(R.id.tvPreco)

        var precoFinal = 0.0
        if(checkBox.isChecked){
            precoFinal = (editTextPreco.text.toString().toFloat() + editTextQuantidade.text.toString().toFloat()) *  1.23
        }else{
            precoFinal =
                (editTextPreco.text.toString().toFloat() + editTextQuantidade.text.toString().toFloat()).toDouble()
        }

        tvPreco.text = precoFinal.toString()
    }
}
