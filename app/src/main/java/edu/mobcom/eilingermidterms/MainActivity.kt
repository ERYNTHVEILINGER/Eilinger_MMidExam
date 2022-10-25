package edu.mobcom.eilingermidterms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextbtn: Button = findViewById(R.id.NEXT)

        nextbtn.setOnClickListener {
            val i= Intent(this, LoginActivity::class.java)
            startActivity(i)
        }
    }
}