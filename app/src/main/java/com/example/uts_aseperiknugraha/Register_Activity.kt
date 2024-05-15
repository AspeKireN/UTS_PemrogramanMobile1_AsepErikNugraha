package com.example.uts_aseperiknugraha

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Register_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Implementasi register logic di sini

        // Contoh: Pindah ke Login Activity setelah register berhasil
        val intent = Intent(this, Login_Activity::class.java)
        startActivity(intent)
        finish()
        }
    }
}