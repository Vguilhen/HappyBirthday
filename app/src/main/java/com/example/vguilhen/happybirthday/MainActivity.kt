package com.example.vguilhen.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get intent object, and data from intent

        val intent = getIntent()
        val editTo = intent.getStringExtra("editTo")
        val editFrom = intent.getStringExtra("editFrom")

        //form one textview for the final result

        val nameTo = findViewById<TextView>(R.id.nameTo)
        val from = findViewById<TextView>(R.id.fromMyName)

        nameTo.text = editTo
        from.text = editFrom


    }
}

