package com.example.kotlin_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {


    lateinit var TextView : TextView
    lateinit var EditText : EditText
    lateinit var Button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextView = findViewById(R.id.text_view)
        EditText = findViewById(R.id.edit_text)
        Button = findViewById(R.id.button_view)


        Button.setOnClickListener{
            var Toast = Toast.makeText(this,"Hello, " + EditText.text,Toast.LENGTH_SHORT).show()
        }

    }

    fun myToast(view : View){
        var Toast = Toast.makeText(this,"Hello!",Toast.LENGTH_SHORT)

        Toast.show()
    }



}