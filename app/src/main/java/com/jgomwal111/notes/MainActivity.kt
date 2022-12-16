package com.jgomwal111.notes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.jgomwal111.notes.data.DataBaseConfig
import com.jgomwal111.notes.model.dataObject.User

class MainActivity : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var tvWelcome: TextView

    private var db:DataBaseConfig?=null
    private var list:MutableList<User> = ArrayList()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_view)
        initUi()
        db = DataBaseConfig(this)
    }

    fun goSecondary(view:View){
        val go = Intent(this, SecondaryController::class.java)
        startActivity(go)
    }

    private fun initUi(){
        initView()
    }

    private fun initView(){
        tvWelcome = findViewById(R.id.welcomeText)
        etName = findViewById(R.id.etNote)
    }

    fun addUserData(view: View) {
        list!!.add(User(etName.text.toString()))
        db!!.insert(list)
        etName.setText("")
    }
}