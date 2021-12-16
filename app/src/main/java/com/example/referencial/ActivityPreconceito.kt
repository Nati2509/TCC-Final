package com.example.referencial

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.referencial.pagesPreconceito.CitacoesPreconceito
import com.example.referencial.pagesPreconceito.DadosPreconceito
import com.example.referencial.pagesPreconceito.ReferencialPreconceito

class ActivityPreconceito : AppCompatActivity() {

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

    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preconceito)

            viewPager = findViewById(R.id.view_pager)

            val fragments: ArrayList<Fragment> = arrayListOf(
                CitacoesPreconceito(),
                DadosPreconceito(),
                ReferencialPreconceito()
            )

            val adapter = ViewPagerAdapter(fragments, this)
            viewPager.adapter = adapter
        }

        override fun onBackPressed() {
            if(viewPager.currentItem == 0){
                super.onBackPressed()
            } else {
                viewPager.currentItem = viewPager.currentItem - 1
            }
    }
}