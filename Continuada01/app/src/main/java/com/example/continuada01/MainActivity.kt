package com.example.continuada01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(componente: View) {
        Toast.makeText(this, "calculando...", Toast.LENGTH_SHORT).show()

        //transformando dados em inteiros/String
        val usuario = et_usuario.text.toString()
        val anoAtual = et_anoAtual.text.toString().toInt()
        val idade = et_idade.text.toString().toInt()

        var anoQueNasceu = anoAtual - idade

        // validando ano e idade
        if (anoAtual <= 2019 || anoAtual >=2021 || idade <= -1) {
            tv_resultado.text = "Dados Inválidos"
            tv_resultado.setTextColor(Color.RED)
        } else if (anoQueNasceu >= 2000 && anoQueNasceu <= 2010) {
            tv_resultado.text = "${usuario} nasceu em ${anoQueNasceu} e é Geração X"
            tv_resultado.setTextColor(Color.BLUE)
        } else if (anoQueNasceu >= 2011) {
            tv_resultado.text = "${usuario} nasceu em ${anoQueNasceu} e é Geração 1000"
            tv_resultado.setTextColor(Color.MAGENTA)
        } else {
            tv_resultado.text = "${usuario} nasceu em ${anoQueNasceu} e é Geração YZ"
            tv_resultado.setTextColor(Color.GREEN)
        }


    }

}