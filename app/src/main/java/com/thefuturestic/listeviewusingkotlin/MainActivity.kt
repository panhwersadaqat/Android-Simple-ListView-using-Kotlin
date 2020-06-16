package com.thefuturestic.listeviewusingkotlin

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var array = arrayOf("sample 1","sample 2","sample 3","sample 4","sample 5","sample 6","sample 7","sample 8","sample 9")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this,
                R.layout.mylist, array)

        val listView:ListView = findViewById(R.id.listView)
        listView.setAdapter(adapter)

        listView.onItemClickListener = object : OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view: View,
                                     position: Int, id: Long) {
                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String
                // Toast the values
                Toast.makeText(applicationContext,
                        "Position :$position\nvalue: $itemValue", Toast.LENGTH_LONG)
                        .show()
            }
        }//list view listener end

    }
}