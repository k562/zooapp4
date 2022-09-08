package com.example.zooapp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.reflect.Array.getInt

class listdesign3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listdesign3)

         val name = intent.getStringExtra("name")
        val des = intent.getStringExtra("des")
        val img = intent.getIntExtra("img",1)






    }
}


