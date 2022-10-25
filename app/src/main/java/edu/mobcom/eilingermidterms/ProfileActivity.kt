package edu.mobcom.eilingermidterms

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val logoutBtn: Button = findViewById(R.id.pLogout)
        val rID = intent!!.getStringExtra("IDNumber")
        val rFN = intent!!.getStringExtra("First Name")
        val rLN = intent!!.getStringExtra("Last Name")
        val rEM = intent!!.getStringExtra("Email Address")
        val rP= intent!!.getStringExtra("Password")
        val rCP = intent!!.getStringExtra("Confirm Password")
        val pInfo = findViewById<TextView>(R.id.infoTV)
        val rInfo = findViewById<TextView>(R.id.rInforTV)
        val pDetails = "IDNumber:$rID\nFirst Name:$rFN\nLast Name:$rLN\nEmail Address:$rEM\nPassword:$rP"
        rInfo.text = "$rFN $rLN"
        pInfo.text = pDetails


        logoutBtn.setOnClickListener {
            openLogout()
        }

    }

    fun openLogout(){
        val rFN = intent!!.getStringExtra("First Name")
        val rLN = intent!!.getStringExtra("Last Name")
        val i= Intent(this, LoginActivity::class.java)
        try {
            Toast.makeText(this, "Goodbye, $rFN $rLN " , Toast.LENGTH_LONG).show()
        }catch (e: ActivityNotFoundException){
            Toast.makeText(this, "Content Error!", Toast.LENGTH_LONG).show()
        }
        startActivity(i)
    }


}