package com.jgomwal111.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SecondaryController : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondary_view)
    }

    fun goMain(view: View){
        val go = Intent(this, MainActivity::class.java)
        startActivity(go)
    }
}