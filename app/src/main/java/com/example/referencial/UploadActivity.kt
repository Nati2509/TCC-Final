package com.example.referencial

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.MimeTypeMap
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.StorageTask
//import com.malkinfo.addinformationfirebase.MainActivity
//import com.malkinfo.addinformationfirebase.R
//import com.malkinfo.addinformationfirebase.model.Nota
import kotlinx.android.synthetic.main.activity_upload.*
import kotlinx.android.synthetic.main.row_item.*

class UploadActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    private var mStorageRef:StorageReference? = null
    private var mDatabaseRef:DatabaseReference? = null
    private var mUploadTask: StorageTask<*>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)

        //set data
        mStorageRef = FirebaseStorage.getInstance().getReference("notas_uploads")
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("notas_uploads")

        upLoadBtn.setOnClickListener {
            if (mUploadTask != null && mUploadTask!!.isInProgress){
                Toast.makeText(this@UploadActivity,
                    "Um texto ainda está sendo salvo",
                    Toast.LENGTH_SHORT).show()
            }
            else{
                uploadFile()
            }
        }
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

    private fun uploadFile() {
        if (mStorageRef != null) {
            Toast.makeText(this@UploadActivity, "O texto foi salvo", Toast.LENGTH_LONG ).show()
            val upload = Nota(
                name = nameEditText!!.text.toString().trim { it <= ' ' },)
            val uploadId = mDatabaseRef!!.push().key
            mDatabaseRef!!.child((uploadId)!!).setValue(upload)
            openImagesActivity()
        }
    }

    private fun  openImagesActivity() {
        startActivity(Intent(this@UploadActivity, MainActivity::class.java))
    }

}