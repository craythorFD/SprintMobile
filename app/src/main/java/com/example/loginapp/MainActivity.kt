package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var NomeInput : EditText
    lateinit var SenhaInput : EditText
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        NomeInput = findViewById(R.id.Nome_input)
        SenhaInput = findViewById(R.id.Senha_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val usurname = NomeInput.text.toString()
            val password = SenhaInput.text.toString()
            Log.i("Test Credentials", "Usurname : $usurname and Password : $password" )

        }

        }
    }
