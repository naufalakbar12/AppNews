package com.example.appnews

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var editTextTextEmailAddress2: EditText
    lateinit var editTextTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnLogin = findViewById(R.id.btnLogin)
        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2)
        editTextTextPassword = findViewById(R.id.editTextTextPassword)


        btnLogin.setOnClickListener {
            if (editTextTextEmailAddress2.text.isEmpty() && editTextTextPassword.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Harap isi Email dan Password terlebih dahulu",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("result", editTextTextEmailAddress2.toString())
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        editTextTextEmailAddress2
    }
}
