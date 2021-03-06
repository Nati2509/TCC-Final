package com.example.referencial

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.referencial.Copiar.ObjetoCopiarFrases
import kotlinx.android.synthetic.main.row_item.view.*

class ListAdapter (var mContext:Context,var notaList:List<Nota>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    inner class ListViewHolder(var v: View) : RecyclerView.ViewHolder(v) {
        var nameT: TextView

        init {
            nameT = v.findViewById(R.id.nameTextView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.row_item, parent, false)
        return ListViewHolder(v)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        var newList = notaList[position]
        holder.nameT.text = newList.name
        holder.v.setOnClickListener {
        }
        holder.itemView.botao_copiar.setOnClickListener {
            ObjetoCopiarFrases.copiar(holder.itemView.context, holder.itemView.nameTextView)
        }
    }

    override fun getItemCount(): Int = notaList.size

}