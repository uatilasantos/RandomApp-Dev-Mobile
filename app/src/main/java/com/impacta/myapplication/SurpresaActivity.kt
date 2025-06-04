package com.impacta.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SurpresaActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surpresa)

        val btSurpresa: Button = findViewById(R.id.btSurpresa)
        btSurpresa.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)
            startActivity(intent)
        }

        val btVoltar2: ImageButton = findViewById(R.id.btVoltar2)
        btVoltar2.setOnClickListener {
            finish()

        }
    }
}