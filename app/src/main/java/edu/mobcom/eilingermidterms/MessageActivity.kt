package edu.mobcom.eilingermidterms

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val backBtn: Button = findViewById(R.id.Logout)
        val sendMail =  findViewById<Button>(R.id.D)
        val subj = findViewById<EditText>(R.id.C)
        val msg = findViewById<EditText>(R.id.B)
        val recipients = findViewById<EditText>(R.id.A)
        val LOGOUT: Button = findViewById(R.id.Logout)
        var iSend: Intent

        sendMail?.setOnClickListener {
            iSend = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf(recipients.text.toString()))
                putExtra(Intent.EXTRA_SUBJECT, subj.text.toString())
                putExtra(Intent.EXTRA_TEXT, msg.text.toString())
            }
            try {
                startActivity(iSend)
                Toast.makeText(this, "Message Sent!", Toast.LENGTH_LONG).show()
            }catch (e: ActivityNotFoundException){
                Toast.makeText(this, "Content Error!", Toast.LENGTH_LONG).show()
            }
        }
        //explicit intent->launch or start an activity
        backBtn.setOnClickListener {
            val i= Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        LOGOUT.setOnClickListener {
            val i= Intent(this, LoginActivity::class.java)
            startActivity(i)
        }
    }
}