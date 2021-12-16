package com.example.referencial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.nav_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.sobre -> {
                val intent = Intent(this, ActivitySobre :: class.java)
                startActivity(intent)
                true
            }
            R.id.addnota -> {
                val intent = Intent(this, UploadActivity :: class.java)
                startActivity(intent)
                true
            }
            R.id.minhasnotas -> {
                val intent = Intent(this, NotasActivity :: class.java)
                startActivity(intent)
                true
            }
            R.id.categorias -> {
                val intent = Intent(this, MainActivity :: class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCultura = findViewById<ImageButton>(R.id.botao_cultura)
        botaoCultura.setOnClickListener {
            val intent = Intent(this, ActivityCultura :: class.java)
            startActivity(intent)
            }

        val botaoEconomia = findViewById<ImageButton>(R.id.botao_economia)
        botaoEconomia.setOnClickListener {
            val intent = Intent(this, ActivityEconomia :: class.java)
            startActivity(intent)
        }

        val botaoEducacao = findViewById<ImageButton>(R.id.botao_educacao)
        botaoEducacao.setOnClickListener {
            val intent = Intent(this, ActivityEducacao :: class.java)
            startActivity(intent)
        }

        val botaoJuventude = findViewById<ImageButton>(R.id.botao_juventude)
        botaoJuventude.setOnClickListener {
            val intent = Intent(this, ActivityJuventude :: class.java)
            startActivity(intent)
        }

        val botaoMeioAmbiente = findViewById<ImageButton>(R.id.botao_meio_ambiente)
        botaoMeioAmbiente.setOnClickListener {
            val intent = Intent(this, ActivityMeioAmbiente :: class.java)
            startActivity(intent)
        }

        val botaoPolitica = findViewById<ImageButton>(R.id.botao_politica)
        botaoPolitica.setOnClickListener {
            val intent = Intent(this, ActivityPolitica :: class.java)
            startActivity(intent)
        }

        val botaoPreconceito = findViewById<ImageButton>(R.id.botao_preconceito)
        botaoPreconceito.setOnClickListener {
            val intent = Intent(this, ActivityPreconceito :: class.java)
            startActivity(intent)
        }

        val botaoSaude = findViewById<ImageButton>(R.id.botao_saude)
        botaoSaude.setOnClickListener {
            val intent = Intent(this, ActivitySaude :: class.java)
            startActivity(intent)
        }

        val botaoSociedade = findViewById<ImageButton>(R.id.botao_sociedade)
        botaoSociedade.setOnClickListener {
            val intent = Intent(this, ActivitySociedade :: class.java)
            startActivity(intent)
        }

        val botaoTecnologia = findViewById<ImageButton>(R.id.botao_tecnologia)
        botaoTecnologia.setOnClickListener {
            val intent = Intent(this, ActivityTecnologia :: class.java)
            startActivity(intent)
        }

        val botaoViolencia = findViewById<ImageButton>(R.id.botao_violencia)
        botaoViolencia.setOnClickListener {
            val intent = Intent(this, ActivityViolencia :: class.java)
            startActivity(intent)
        }

        }
    }


