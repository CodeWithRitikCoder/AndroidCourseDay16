package com.ritikcoder.project16ofandroidcoursewithsaumyasingh_simpledynamicphotoframeapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ritikcoder.project16ofandroidcoursewithsaumyasingh_simpledynamicphotoframeapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    private var currentImage= 0
    private lateinit var image: ImageView
    //val name= arrayOf("Khushi", "Rani", "Sunder Patchi", "priyanka choprda", "kajal aggrabal", "Alon musk", "Kajal aggrabal", "Ritik roshan", "Akashya kumar", "Fohoren 1")

    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()//It is used to hide support action bar.

        val prevImageButton: ImageButton= findViewById(R.id.imageButtonForPrevious)
        val nextImageButton: ImageButton= findViewById(R.id.imageButtonForNext)

        //click listener of Previous image button.
        prevImageButton.setOnClickListener {
            Toast.makeText(this, "Previous image", Toast.LENGTH_SHORT).show()
            //Hiding the image is here..
            val idCurrentImageString= "img$currentImage"
            //convert string id into integer address associated with it
            val idCurrentImageInteger= this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image= findViewById(idCurrentImageInteger)
            image.alpha= 0f

            //showing image is here..
            currentImage= (10+ currentImage-1)% 10
            val idCurrentImageStringToShow= "img$currentImage"
            //convert string id into integer address associated with it
            val idCurrentImageIntegerToShow= this.resources.getIdentifier(idCurrentImageStringToShow, "id", packageName)
            image= findViewById(idCurrentImageIntegerToShow)
            image.alpha= 1f

        }

        //click listener of Next image button.
        nextImageButton.setOnClickListener {
            Toast.makeText(this, "Next image", Toast.LENGTH_SHORT).show()
            //Hiding the image is here..
            val idCurrentImageString= "img$currentImage"
            //convert string id into integer address associated with it
            val idCurrentImageInteger= this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image= findViewById(idCurrentImageInteger)
            image.alpha= 0f

            //showing image is here..
            currentImage= (10+ currentImage+1)% 10
            val idCurrentImageStringToShow= "img$currentImage"
            //convert string id into integer address associated with it
            val idCurrentImageIntegerToShow= this.resources.getIdentifier(idCurrentImageStringToShow, "id", packageName)
            image= findViewById(idCurrentImageIntegerToShow)
            image.alpha= 1f

        }

    }
}