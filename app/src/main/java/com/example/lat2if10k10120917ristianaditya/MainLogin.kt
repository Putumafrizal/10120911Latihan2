//Nim   : 10120911
//Nama  : Putu Mafrizal Alif Astika
//Kelas : IF10K
//TGL   : 30 04 2023

package com.example.lat2if10k10120911

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainLogin : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide();

        val btnRegister : TextView = findViewById(R.id.textButtonRegister)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.textButtonRegister -> {
                val moveIntent = Intent(this@MainLogin, RegisterActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}