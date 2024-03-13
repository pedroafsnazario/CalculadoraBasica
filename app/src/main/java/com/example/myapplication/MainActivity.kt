package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var soma = findViewById<Button>(R.id.Soma)

        var multiplica = findViewById<Button>(R.id.Multiplicar)

        var subtrai = findViewById<Button>(R.id.Subtrair)

        var divide = findViewById<Button>(R.id.Dividir)



        var valorum = findViewById<TextView>(R.id.valor1).toString()
        var valordois = findViewById<TextView>(R.id.valor2).toString()

        var resultado = findViewById<TextView>(R.id.resultado)

        soma.setOnClickListener {

            if (valorum == null || valordois == null) {
                error("Insira um valor por favor")

            } else {

                var calculo: Double = valordois.toDouble()+valorum.toDouble()

                resultado.text = calculo.toString()

            }
        }

        subtrai.setOnClickListener {

            if (valorum == null ||  valordois == null) {
                error("Insira um valor por favor")

            }

            else {

                var calculo: Double = valorum.toDouble()-valordois.toDouble()

                resultado.text = calculo.toString()

            }

        }

        multiplica.setOnClickListener {


            if (valorum == null ||  valordois == null) {
                error("Insira um valor por favor")

            }

            else {


                var calculo: Double = valorum.toDouble()*valordois.toDouble()

                resultado.text = calculo.toString()

            }

        }

        divide.setOnClickListener {


            if (valorum == null ||  valordois == null) {
                error("Insira um valor por favor")

            }

            else {


                var calculo: Double = valorum.toDouble()/valordois.toDouble()

                resultado.text = calculo.toString()

            }

        }

    }
}