package edu.mobcom.eilingermidterms

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val regBtn: Button = findViewById(R.id.rregisterButton)
        val logoutBtn: Button = findViewById(R.id.rlogoutButton)

        logoutBtn.setOnClickListener {
            openLogout()
        }

        regBtn.setOnClickListener {
            openRegister()
        }
    }

    fun openLogout() {
        val i= Intent(this, LoginActivity::class.java)
        startActivity(i)
    }

    fun openRegister() {
        val id = findViewById<EditText>(R.id.idET)
        val fname = findViewById<EditText>(R.id.fnameET)
        val lname = findViewById<EditText>(R.id.lnameET)
        val email = findViewById<EditText>(R.id.emailET)
        val password = findViewById<EditText>(R.id.rpasswordET)
        val cpass = findViewById<EditText>(R.id.rcpasswordaET)
        val pass = password.text.toString()
        val pass2 = cpass.text.toString()
        if (pass == pass2){
            val i = Intent(this@RegisterActivity, ProfileActivity::class.java)
            with(i) {
                putExtra("IDNumber", id.text.toString())
                putExtra("First Name", fname.text.toString())
                putExtra("Last Name", lname.text.toString())
                putExtra("Email Address", email.text.toString())
                putExtra("Password", password.text.toString())
                putExtra("Confirm Password", cpass.text.toString())
            }
            try {
                startActivity(i)
                Toast.makeText(
                    this,
                    "Success!",
                    Toast.LENGTH_LONG
                ).show()
            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, "Content Error!", Toast.LENGTH_LONG).show()
            }
        } else{
            Toast.makeText(
                this,
                "Password and Confirm Password must be the same.",
                Toast.LENGTH_LONG
            ).show()
        }


    }
}
