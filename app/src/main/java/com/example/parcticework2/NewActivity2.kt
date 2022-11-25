package com.example.parcticework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)
    }

    override fun onStart() {
        super.onStart()
        val rootMenu = findViewById<Button>(R.id.rootMenuButton)
        rootMenu.visibility = View.VISIBLE
    }


    fun showRootMenu(view: View) {
        val rootAct = Intent(this, MainActivity::class.java)
        startActivity(rootAct)
    }


}