package com.example.calculatoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide();

        BtnCalcular.setOnClickListener {
            val peso = EditPeso.text.toString().toDouble();
            val altura = EditAltura.text.toString().toDouble();

            val resultado = peso/(altura*altura)

            Resultado.text = "Seu IMC é %.2f".format(resultado)


        }

    }

}

