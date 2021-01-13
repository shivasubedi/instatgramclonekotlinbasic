package com.instagram.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.instagram.R


class RegUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg_user)
        val country = arrayOf<String>("BATCH 25", "BATCH 26", "BATCH 27")
        val mySpinner = findViewById(R.id.batch_spinner) as Spinner

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, country)
        mySpinner.adapter = adapter
        // eText.setText(InputType.TYPE_NULL);
        val coventryid = findViewById<EditText>(R.id.coventryid)
        val firstname = findViewById<EditText>(R.id.firstname)
        val lastname = findViewById<EditText>(R.id.lastname)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val saveBtn = findViewById<Button>(R.id.saveBtn)
        coventryid.setText("").toString()
        firstname.setText("").toString()
        lastname.setText("").toString()
        username.setText("").toString()
        password.setText("").toString()


        //handle button click
        saveBtn.setOnClickListener {
            if (username?.getText().toString() == "pooja@gmail.com" && password?.getText().toString() == "12345") {
                Toast.makeText(this, "sucessfully Signup with username \n" + username.text.toString() + "\n Thank you !!", Toast.LENGTH_SHORT).show()
                coventryid.setText("").toString()
                firstname.setText("").toString()
                lastname.setText("").toString()
                username.setText("").toString()
                password.setText("").toString()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Filled all Details"+"\nWrong usernam/password!!", Toast.LENGTH_SHORT).show()
            }


        }
        //LISTENER
        mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
                if (country[i].toString() == "BATCH 25")
                else if (country[i].toString() == "BATCH 26")
                else if (country[i].toString() == "BATCH 27")  {
                     }

            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {
            }
        }
    }
}