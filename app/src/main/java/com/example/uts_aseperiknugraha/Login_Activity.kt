package com.example.uts_aseperiknugraha

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Implementasi login logic di sini

        // Contoh: Pindah ke News Portal Dashboard setelah login berhasil
        val intent = Intent(this, News_Portal_Dashboard_Activity::class.java)
        startActivity(intent)
        finish()
        }
    }
}