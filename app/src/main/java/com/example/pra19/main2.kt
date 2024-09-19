package com.example.pra19

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



class main2 : AppCompatActivity() {

 lateinit var  checkbox1:CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




    }

    fun clck(view: View) {

        checkbox1=findViewById(R.id.crime_solved)
        val message = if (checkbox1.isChecked) "Чекбокс включен" else "Чекбокс выключен"
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()

    }

    fun cl(view: View) {
        var bb: Button
        val currentDate = Date()

        val dateFormat: DateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
        val dateText: String = dateFormat.format(currentDate)

      /*  val timeFormat: DateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val timeText: String = timeFormat.format(currentDate)*/
        bb=findViewById(R.id.crime_date)
        bb.setText("Сегодня " + dateText);

    }
}