package com.ritikcoder.project16ofandroidcoursewithsaumyasingh_simpledynamicphotoframeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ritikcoder.project16ofandroidcoursewithsaumyasingh_simpledynamicphotoframeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)

        Handler().postDelayed({
            val intentToOpenMainActivity2= Intent(this, MainActivity2::class.java)
            startActivity(intentToOpenMainActivity2)
            finish()
        }, 1000)
    }
}