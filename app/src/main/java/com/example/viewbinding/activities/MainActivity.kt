package com.example.viewbinding.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainActivityBn1.setOnClickListener {
            Toast.makeText(this,"Binding Jesus", Toast.LENGTH_SHORT).show()
        }

        /*
        val btn = findViewById<Button>(R.id.main_activity_bn_1)

        btn.setOnClickListener {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }*/
    }
}