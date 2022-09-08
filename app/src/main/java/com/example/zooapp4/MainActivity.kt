package com.example.zooapp4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var ImgAnimal : ImageView
    lateinit var Txt_name : TextView
    lateinit var Txt_des : TextView
    lateinit  var rec: RecyclerView
     var listofanimal = ArrayList<Animal>()
    var adapter: AnimalAdapter ?= null



  //  @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ImgAnimal = findViewById(R.id.Img_animal)
//        Txt_name = findViewById(R.id.Txt_name)
//        Txt_des= findViewById(R.id.Txt_des)


        rec = findViewById(R.id.recyclerview)
        rec.setHasFixedSize(true)
        rec.layoutManager = LinearLayoutManager(this)

        listofanimal.add(Animal("Baboon","It is an animal who live with other animal",R.drawable.baboon))
        listofanimal.add(Animal("Bulldog","It is an animal who live with other animal",R.drawable.bulldog))
        listofanimal.add(Animal("Panda","It is an animal who live with other animal",R.drawable.panda))
        listofanimal.add(Animal("Swallow Bird","It is an animal who live with other animal",R.drawable.swallow_bird))
        listofanimal.add(Animal("White tiger","It is an animal who live with other animal",R.drawable.white_tiger))
        listofanimal.add(Animal("Zebra","It is an animal who live with other animal",R.drawable.zebra))

        adapter = AnimalAdapter(this,listofanimal)
        rec.adapter = adapter





    }
}