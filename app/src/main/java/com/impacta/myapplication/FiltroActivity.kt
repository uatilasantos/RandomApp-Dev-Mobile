package com.impacta.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FiltroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filtro)

        val botaoVoltar: ImageButton = findViewById(R.id.botaoVoltar)
        botaoVoltar.setOnClickListener{
            finish()
        }

        val btProximo: Button = findViewById(R.id.btProximo)
        btProximo.setOnClickListener{
            val intent= Intent(this,SurpresaActivity::class.java)
            startActivity(intent)
        }

    }
}
