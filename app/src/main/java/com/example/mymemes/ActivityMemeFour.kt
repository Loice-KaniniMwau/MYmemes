package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityMemeFour : AppCompatActivity() {
    lateinit var btNext4:TextView
    lateinit var btPrevious4:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        btNext4=findViewById(R.id.btNext4)
        btNext4.setOnClickListener {
           val intent= Intent(this,ActivityMeme5::class.java)
            startActivity(intent)

        }
        btPrevious4=findViewById(R.id.btPrevious4)
        btPrevious4.setOnClickListener {
            val intent=Intent(this,ActivityMemeThree::class.java)
            startActivity(intent)
        }
    }
}