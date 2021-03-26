package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {

    private lateinit var enterName: EditText
    private lateinit var textView: TextView
    private lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enterName = findViewById<EditText>(R.id.enterName)
        textView = findViewById<TextView>(R.id.textView)
        btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener{

            if(enterName.text.isNotEmpty()) {
                textView.text = ("Hi Welcome " + enterName.text.toString())
                enterName.setText("")
                val snack = Snackbar.make(it,"Greetings!",Snackbar.LENGTH_LONG)
                snack.setAction("Reset" ,{textView.setText("")})
                snack.setActionTextColor(ContextCompat.getColor(this, R.color.colorSnackBar))
                snack.show()
            }else{
                Toast.makeText(this,"Please Enter Name",Toast.LENGTH_SHORT).show()
            }
        }
    }
}