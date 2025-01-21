package com.example.programa

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.programa.databinding.ActivityColetaMainBinding
import com.example.programa.databinding.ActivityPrincipalMainBinding

class PrincipalMainActivity : AppCompatActivity() {

    private lateinit var MainPrincipal : ActivityPrincipalMainBinding
    //public lateinit var MainColeta    : ActivityColetaMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //vamos inidicar qual o layout é o principal do sistema
        MainPrincipal = ActivityPrincipalMainBinding.inflate(layoutInflater)
        //indico o layout
        setContentView(MainPrincipal.root)

        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        //Programando o evento do botao
        MainPrincipal.btnCHEGADA.setOnClickListener(){
            //informo a tela
            val MudarTela = Intent(this,Coleta_MainActivity::class.java)
            //mostro a atividade
            startActivity(MudarTela)
        }


    }
}