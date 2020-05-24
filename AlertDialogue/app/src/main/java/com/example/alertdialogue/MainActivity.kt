package com.example.alertdialogue

import android.app.DatePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var a:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a = findViewById(R.id.alert)

        a.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle("dialogTitle")
            //set message for alert dialog
            builder.setMessage("dialogMessage")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            //performing positive action
            builder.setPositiveButton("Yes"){dialogInterface, which ->

                finish()
            }
            //performing cancel action
            builder.setNeutralButton("Cancel"){dialogInterface , which ->

                dialogInterface.dismiss()

            }
            //performing negative action
            builder.setNegativeButton("No"){dialogInterface, which ->
                dialogInterface.cancel()
            }
            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }

    fun date(view: View) {
        val cala=Calendar.getInstance()

        val year = cala.get(Calendar.YEAR)
        val month = cala.get(Calendar.MONTH)
        val day = cala.get(Calendar.DAY_OF_MONTH)


    }
}