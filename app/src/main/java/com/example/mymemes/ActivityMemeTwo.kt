package com.example.mymemes

import android.app.ActionBar
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ActivityMemeTwo : AppCompatActivity() {
    lateinit var tvBack1:TextView
    lateinit var tvNext2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tvBack1=findViewById(R.id.tvBack1)
        tvBack1.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        tvNext2=findViewById(R.id.tvNext2)
        tvNext2.setOnClickListener {
            var intent=Intent(this,ActivityMemeThree::class.java)
            startActivity(intent)
        }





    }

}

