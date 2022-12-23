package com.example.appnews

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var txt_judul : TextView
    lateinit var editText : EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        txt_judul = findViewById(R.id.txt_judul)
        editText = findViewById(R.id.editEmailAddress)
        editText = findViewById(R.id.editPassword)
        btnLogin = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {
            if (editText.text.isEmpty() && editText.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Harap isi Email dan Password terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }


            val intentlanjut = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("result", editText.toString())
            startActivity(intentlanjut)
        }

    }

}

