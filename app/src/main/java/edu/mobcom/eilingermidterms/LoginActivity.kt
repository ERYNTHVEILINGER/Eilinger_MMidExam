package edu.mobcom.eilingermidterms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val LOGIN: Button = findViewById(R.id.Login)
        LOGIN.setOnClickListener(this)
        val REG: Button = findViewById(R.id.Register)


        REG.setOnClickListener {
            val i= Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }
    }
    private fun openLogin() {
        val i= Intent(this, MessageActivity::class.java)
        startActivity(i)
    }

    private fun openReg() {
        val i= Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.Register->{
                openReg()
            }

            R.id.Login->{
                openLogin()
            }
        }
    }
}