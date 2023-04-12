package com.example.rvapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvDevices: ListView
        var arrDevices: ArrayList<String>
        arrDevices = ArrayList<String>()

        lvDevices = findViewById(R.id.dv_list)

        arrDevices.add("one")
        arrDevices.add("two")
        arrDevices.add("three")

        val adapter: ArrayAdapter<String>
        adapter = ArrayAdapter( this, android.R.layout.simple_list_item_1, arrDevices)

        lvDevices.adapter = adapter
    }
}