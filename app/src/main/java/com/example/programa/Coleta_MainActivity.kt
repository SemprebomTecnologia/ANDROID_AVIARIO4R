package com.example.programa

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.programa.databinding.ActivityColetaMainBinding
import com.example.programa.databinding.ActivityPrincipalMainBinding

class Coleta_MainActivity : AppCompatActivity() {

    private  lateinit  var MainPrincipal  : ActivityPrincipalMainBinding
    private  lateinit  var MainColeta     : ActivityColetaMainBinding

    //public  lateinit  var MainPrincipal  : ActivityPrincipalMainBinding
    //private lateinit  var MainColeta     : ActivityColetaMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //vamos inflar este  layout
        MainColeta = ActivityColetaMainBinding.inflate(layoutInflater)
        //inflo o layout
        setContentView(MainColeta.root)
        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        //programo o evento do botao
        MainColeta.btnINICIO.setOnClickListener(){
            //INFORMO A TELA
            val MudarTela = Intent(this,PrincipalMainActivity::class.java)
            //MOSTRO A TELA
            startActivity(MudarTela)

        }
    }
}