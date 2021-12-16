package com.example.referencial

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity


class ActivitySobre : AppCompatActivity(){

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
        setContentView(R.layout.activity_sobre)
    }
}