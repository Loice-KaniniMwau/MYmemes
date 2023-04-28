package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityMemeThree : AppCompatActivity() {
    lateinit var btPrevious3:TextView
    lateinit var btNext3:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)

        btNext3=findViewById(R.id.btNext3)
        btNext3.setOnClickListener {
            val intent=Intent(this,ActivityMemeFour::class.java)
            startActivity(intent)
        }
        btPrevious3=findViewById(R.id.btPrevious3)
        btPrevious3.setOnClickListener {
            val intent=Intent(this,ActivityMemeTwo::class.java)
            startActivity(intent)
        }



    }
}