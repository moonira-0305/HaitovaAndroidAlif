package com.example.mydictproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mytests.DbHelper



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userLogin: EditText =findViewById(R.id.user_login)
        val userEmail: EditText =findViewById(R.id.user_email)
        val userPass: EditText =findViewById(R.id.user_pass)
        val button: Button =findViewById(R.id.button_reg)

        val  link_to_auth: TextView =findViewById(R.id.link_to_auth)


        button.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val pass = userPass.text.toString().trim()

            if (login == "" || pass == "") {
                Toast.makeText(this, "@string/NeVsePolyaZapolneni", Toast.LENGTH_LONG).show()
            } else {
                val user = User(login, email, pass)
                val db = DbHelper(this, null)
                db.addUsers(user)
                Toast.makeText(this, "{$login} @string/added", Toast.LENGTH_LONG).show()

                userLogin.text.clear()
                userEmail.text.clear()
                userPass.text.clear()
            }

            val intent= Intent(this,AuthActivity::class.java)
            startActivity(intent)
        }
    }
}