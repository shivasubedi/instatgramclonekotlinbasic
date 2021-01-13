package com.instagram.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.instagram.R

class Postadd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postadd)

        val posttitle = findViewById<EditText>(R.id.posttitle)
        val saveBtn = findViewById<Button>(R.id.saveBtn)
        val postdesc = findViewById<EditText>(R.id.postdetails)
        //handle button click
        saveBtn.setOnClickListener {
            Toast.makeText(this, "New Post added" +"\n Sucessfully!!", Toast.LENGTH_SHORT).show()
            postdesc.setText("").toString()
            posttitle.setText("").toString()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}