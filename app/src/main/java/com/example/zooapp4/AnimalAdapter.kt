package com.example.zooapp4

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(val context : Context , val list_of_animals : List<Animal>):RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var Txt_name : TextView = itemView.findViewById(R.id.Txt_name)
        var Txt_des : TextView = itemView.findViewById(R.id.Txt_des)
        var Imganimal : ImageView = itemView.findViewById(R.id.Img_animal)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.listdesign,parent,false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.Txt_name.text = list_of_animals[position].name
        holder.Txt_des.text= list_of_animals[position].des
        list_of_animals[position].img ?.let { holder.Imganimal.setImageResource(it) }

        holder.Imganimal.setOnClickListener {
         val intent = Intent(context,listdesign3::class.java)
            intent.putExtra("name",list_of_animals[position].name)
            intent.putExtra("des",list_of_animals[position].des)
            intent.putExtra("img",list_of_animals[position].img)

            context.startActivity(intent)

        }

    }



    override fun getItemCount(): Int {
        return list_of_animals.size
    }
}


