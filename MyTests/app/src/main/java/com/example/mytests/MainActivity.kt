package com.example.mytests

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userLogin:EditText=findViewById(R.id.user_login)
        val userEmail:EditText=findViewById(R.id.user_email)
        val userPass:EditText=findViewById(R.id.user_pass)
        val button:Button=findViewById(R.id.button_reg)
        val  link_to_auth: TextView =findViewById(R.id.link_to_auth)
        link_to_auth.setOnClickListener(){
            val intent= Intent(this,AuthActivity::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val login=userLogin.text.toString().trim()
            val email=userEmail.text.toString().trim()
            val pass=userPass.text.toString().trim()

            if(login==""||email==""||pass==""){
                Toast.makeText(this,"Не все поля заполнены",Toast.LENGTH_LONG).show()
            }
            else{
                val user=User(login,email,pass)
                val db=DbHelper(this,null)
                db.addUsers(user)
                Toast.makeText(this,"$login dobavlen",Toast.LENGTH_LONG).show()

                userLogin.text.clear()
                userEmail.text.clear()
                userPass.text.clear()
            }
        }
    }
}