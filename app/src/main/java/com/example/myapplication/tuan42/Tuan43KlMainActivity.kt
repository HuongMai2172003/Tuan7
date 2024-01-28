package com.example.myapplication.tuan42

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class Tuan43KlMainActivity : AppCompatActivity() {
    var btn :Button?=null
    var tvkQ:TextView?=null
    var context: Context=this
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan43_kl_main)
        btn=findViewById(R.id.button2)
        tvkQ=findViewById(R.id.textView2)
        val fn=Tuan42VolleyFNKL()
        btn!!.setOnClickListener {
            fn.getJSONArrayObjects(context,tvkQ!!)
        }
    }
}