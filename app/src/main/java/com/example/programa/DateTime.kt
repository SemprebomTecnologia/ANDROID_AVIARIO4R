package com.example.programa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.sql.Time
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class DateTime(){
    //  VARIAVEIS DA CLASSE
    lateinit var Data                : Date
    lateinit var Tempo               : Time
    lateinit var DataTempo           : DateTime
    lateinit var Calendario          : Calendar
    lateinit var SimplesDataFormato  : SimpleDateFormat

    //obtem a data do sistema
    //  System.currentTimeMillis()

    //funcao para obter a hora  data atual do systema
    fun Dia( txt: String ): Date {

        Data  = DateFormat().format("dd.MM.yyyy")

            simpleDateFormat.format(txt).toString()
    }




   // val dateTimeInLongTextView.text = datesysval.toString()






}


/*
 val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formatted = current.format(formatter)


    calendar = Calendar.getInstance()
    simpleDateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm:ss aaa z")
    dateTime = simpleDateFormat.format(calendar.time).toString()
    format1.text = dateTime




Primeiramente, a instância do Calendar é criada e o formato desejado da data e hora
a serem mostradas é passado para o método SimpleDateFormat .
A String deve incluir os seguintes caracteres e pode-se incluir separadores como -, / etc.



class DateTime: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lote_main)

        var dateTime: String
        var calendar: Calendar
        var simpleDateFormat: SimpleDateFormat

        // register all the text view with appropriate IDs
        val dateTimeInLongTextView: TextView = findViewById(R.id.txtDataEntradaLote)


        val format1: TextView = findViewById(R.id.txtDataEntradaLote)
        //val format2: TextView = findViewById(R.id.format2)
        //val format3: TextView = findViewById(R.id.format3)
        //val format4: TextView = findViewById(R.id.format4)
        //val format5: TextView = findViewById(R.id.format5)
        //val format6: TextView = findViewById(R.id.format6)
        //val format7: TextView = findViewById(R.id.format7)

        // get the Long type value of the current system date
        val dateValueInLong: Long = System.currentTimeMillis()

        dateTimeInLongTextView.text = dateValueInLong.toString()

        // different format type to format the
        // current date and time of the system
        // format type 1
        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm:ss aaa z")
        dateTime = simpleDateFormat.format(calendar.time).toString()
        format1.text = dateTime
/*
        // format type 2
        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("dd-MM-yyyy HH:mm:ss aaa z")
        dateTime = simpleDateFormat.format(calendar.time).toString()
        format2.text = dateTime

        // format type 3
        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa z")
        dateTime = simpleDateFormat.format(calendar.time).toString()
        format3.text = dateTime

        // format type 4
        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("dd.LLL.yyyy HH:mm:ss aaa z")
        dateTime = simpleDateFormat.format(calendar.time).toString()
        format4.text = dateTime

        // format type 5
        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("dd.LLLL.yyyy HH:mm:ss aaa z")
        dateTime = simpleDateFormat.format(calendar.time).toString()
        format5.text = dateTime

        // format type 6
        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("E.LLLL.yyyy HH:mm:ss aaa z")
        dateTime = simpleDateFormat.format(calendar.time).toString()
        format6.text = dateTime

        // format type 7
        calendar = Calendar.getInstance()
        simpleDateFormat = SimpleDateFormat("EEEE.LLLL.yyyy KK:mm:ss aaa z")
        dateTime = simpleDateFormat.format(calendar.time).toString()
        format7.text = dateTime
        */
    }
}


 */