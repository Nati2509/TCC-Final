package com.example.referencial

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_items.*
import kotlinx.android.synthetic.main.activity_sobre.*
import kotlinx.android.synthetic.main.row_item.*
import kotlinx.android.synthetic.main.row_item.view.*
import java.util.*
import kotlin.collections.ArrayList

class NotasActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    private var mStorage:FirebaseStorage? = null
    private var mDatabaseRef:DatabaseReference? = null
    private var mDBListener:ValueEventListener? = null
    private lateinit var mNotas:MutableList<Nota>
    private lateinit var listAdapter: ListAdapter

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        //firebase
        /**set adapter*/
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this@NotasActivity)
        mNotas = ArrayList()
        listAdapter = ListAdapter(this@NotasActivity, mNotas)
        mRecyclerView.adapter = listAdapter

        /**set Firebase Database*/
        mStorage = FirebaseStorage.getInstance()
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("notas_uploads")
        mDBListener = mDatabaseRef!!.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@NotasActivity, error.message, Toast.LENGTH_SHORT).show()
            }

            override fun onDataChange(snapshot: DataSnapshot) {
                mNotas.clear()
                for (notaSnapshot in snapshot.children) {
                    val upload = notaSnapshot.getValue(Nota::class.java)
                    upload!!.key = notaSnapshot.key
                    mNotas.add(upload)
                }
                listAdapter.notifyDataSetChanged()
            }
        })

//        val botao1 = findViewById<Button>(R.id.botao_copiar)
//        val frase = findViewById<TextView>(R.id.nameTextView)

        /* if (botao1 != null) {
         botao1.setOnClickListener {
             val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
             val clipData = ClipData.newPlainText("TextView", frase?.text.toString())

             clipboardManager.setPrimaryClip(clipData)

             Toast.makeText(this, "Copiado", Toast.LENGTH_SHORT).show();

         }
     }*/

    }

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

    override fun onDestroy () {
        super.onDestroy()
        mDatabaseRef!!.removeEventListener(mDBListener!!)

    }
}
