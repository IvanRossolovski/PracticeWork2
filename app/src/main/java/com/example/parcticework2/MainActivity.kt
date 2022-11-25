package com.example.parcticework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val foodStuff = findViewById<Button>(R.id.foodStuffButton)
        foodStuff.visibility = View.VISIBLE

        val contactsStuff = findViewById<Button>(R.id.contactsButton)
        contactsStuff.visibility = View.VISIBLE
    }

        fun showFoodStuffMenu(view: View) {
            val newAct = Intent(this, NewActivity::class.java)
            startActivity(newAct)
        }


            fun showContactsMenu(view: View) {
            val newAct2 = Intent(this, NewActivity::class.java)
            startActivity(newAct2)
    }

}