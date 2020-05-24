package com.example.contextualmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var t:TextView

    private val contact = arrayOf<String>("Akash","Vikash","John","Rahul","Ajay")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        t=findViewById(R.id.gopal)
        registerForContextMenu(t)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.context,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }


    override fun onContextItemSelected(item: MenuItem): Boolean
    {
        when(item.itemId)
        {
            R.id.m1->
            {
                Toast.makeText(applicationContext,"share",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.m2->
            {
                Toast.makeText(applicationContext,"delete",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.m3->
            {
                Toast.makeText(applicationContext,"edit",Toast.LENGTH_LONG).show()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
}
