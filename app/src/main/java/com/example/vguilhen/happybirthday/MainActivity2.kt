package com.example.vguilhen.happybirthday

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.vguilhen.happybirthday.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextFrom = binding.textInputEditFrom.text
        val editTextTo = binding.textInputEditFrom.text

        binding.button.setOnClickListener {
            if (editTextFrom.toString().isNotEmpty() || editTextTo.toString().isNotEmpty()) {
                openNextActivity();updateTextView()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Os campos não podem estar vazios!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }

    private fun openNextActivity() {
        //open second activity
        Intent(this, MainActivity::class.java)

    }

    private fun updateTextView() {
        //Collect data from edit Text
        val editTo = binding.textInputEditTo.text.toString()
        val editFrom = binding.textInputEditFrom.text.toString()
        //start intent for new Activity and pass data
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("editTo", editTo)
        intent.putExtra("editFrom", editFrom)
        startActivity(intent)


    }
}

