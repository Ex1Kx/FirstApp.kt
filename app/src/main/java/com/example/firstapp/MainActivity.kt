package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton:Button= findViewById(R.id.buttonEnter)
        myButton.setOnClickListener { onclick() }
    }

    private fun onclick(){
        val textCamp:EditText=findViewById(R.id.editTextTextName)
        var name:String=textCamp.text.toString()
        Toast.makeText(this,"Welcome $name",Toast.LENGTH_LONG).show()
    }
}