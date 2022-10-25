package edu.mobcom.eilingermidterms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val LOGIN: Button = findViewById(R.id.Login)
        val REG: Button = findViewById(R.id.Register)

        LOGIN.setOnClickListener {
            val i= Intent(this, MessageActivity::class.java)
            startActivity(i)
        }

        REG.setOnClickListener {
            val i= Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }
    }
}