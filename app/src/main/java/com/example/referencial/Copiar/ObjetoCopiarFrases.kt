package com.example.referencial.Copiar

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.TextView
import android.widget.Toast

object ObjetoCopiarFrases {

    fun copiar(context: Context, textView: TextView){
        val clipboardManager =
            context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("TextView", textView.text.toString())

        clipboardManager.setPrimaryClip(clipData)

        Toast.makeText(context, "Copiado", Toast.LENGTH_SHORT).show()

    }

}