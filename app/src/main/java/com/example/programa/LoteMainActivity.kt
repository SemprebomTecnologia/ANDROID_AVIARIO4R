package com.example.programa


import android.content.Intent
import android.os.Bundle
import android.view.View.OnFocusChangeListener
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.programa.databinding.ActivityLoteMainBinding
import com.example.programa.databinding.ActivityPrincipalMainBinding

//importamos a classe DateTime
import com.example.programa.DateTime


class LoteMainActivity : AppCompatActivity() {

    private  lateinit  var MainPrincipal    : ActivityPrincipalMainBinding
    private  lateinit  var MainLote         : ActivityLoteMainBinding

    //public  lateinit  var MainPrincipal  : ActivityPrincipalMainBinding
    //private lateinit  var MainColeta     : ActivityColetaMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        //vamos inflar este  layout
        MainLote = ActivityLoteMainBinding.inflate(layoutInflater)
        //inflo o layout
        setContentView(MainLote.root)

        //val EdtProd = findViewById<EditText>(R.id.EdtProdutoLista)
        //var ProdutoLista: String = EdtProd.toString()

        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/


        MainLote.btnLIMPAR.setOnClickListener(){
            var DataLote = MainLote.editTextDate.text.toString()
            MainLote.txtTitulo.text = DataLote.toString()


        }



        //programo o evento do botao

        MainLote.btnPRINCIPAL.setOnClickListener(){
            //INFORMO A TELA
            val MudarTela = Intent(this,PrincipalMainActivity::class.java)
            //MOSTRO A TELA
            startActivity(MudarTela)

        }


    }
}