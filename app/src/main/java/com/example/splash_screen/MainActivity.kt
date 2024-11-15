package com.example.splash_screen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.xml.sax.HandlerBase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.setFlags(
            WindowManager.LayoutParams .FLAG_FULLSCREEN,
            WindowManager.LayoutParams .FLAG_FULLSCREEN
        )
        val myLogo: ImageView = findViewById(R.id.imageView)
        val myAnim = AnimationUtils.loadAnimation(this, R.anim.my_anim)
        myLogo.startAnimation(myAnim)

        Handler().postDelayed({

            startActivity(Intent(this, MainActivity2::class.java))

            finish()
        }, 3000)

        }
    }