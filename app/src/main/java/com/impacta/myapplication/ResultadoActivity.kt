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

class ResultadoActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resultado)

        val btFinalizar: Button = findViewById(R.id.btFinalizar)
        btFinalizar.setOnClickListener{
            val intent = Intent(this, BusinessCardActivity::class.java)
            startActivity(intent)
        }

        val btVoltar3: ImageButton = findViewById(R.id.btVoltar3)
        btVoltar3.setOnClickListener {
            finish()
        }
    }
}