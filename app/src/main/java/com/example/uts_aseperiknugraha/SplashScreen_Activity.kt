package com.example.uts_aseperiknugraha

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Tunggu selama 2 detik sebelum berpindah ke Login Activity
        Handler().postDelayed({
            val intent = Intent(this, Login_Activity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}