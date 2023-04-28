package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityMeme5 : AppCompatActivity() {
    lateinit var btPrevious5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        btPrevious5=findViewById(R.id.btPrevious5)
        btPrevious5.setOnClickListener {
            val intent=Intent(this,ActivityMemeFour::class.java)
            startActivity(intent)
        }

    }
}
//btNext4=findViewById(R.id.btNext4)
//btNext4.setOnClickListener {
//    val intent= Intent(this,ActivityMeme5::class.java)
//    startActivity(intent)