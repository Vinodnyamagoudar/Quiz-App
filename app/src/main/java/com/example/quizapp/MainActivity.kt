package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnStart = findViewById<Button>(R.id.btnStart)
        var etName = findViewById<TextView>(R.id.etName)

        btnStart.setOnClickListener{
            if(etName.text.isEmpty()){
                Toast.makeText(this, "please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())

                startActivity(intent)
                finish()
            }
        }

    }
}