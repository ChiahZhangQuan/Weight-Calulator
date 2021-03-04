package com.example.weightevaluator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener{

            val name = findViewById<EditText>(R.id.editTextTextPersonName3)
            val intent = Intent(this, Activity2::class.java);
            intent.putExtra("personName", name.text)
            startActivity(intent);
        }

    }
}