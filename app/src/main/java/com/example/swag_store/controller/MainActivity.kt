package com.example.swag_store.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.swag_store.R
import com.example.swag_store.Services.DataService
import com.example.swag_store.model.Category

class MainActivity : AppCompatActivity() {
    lateinit var adapter:ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val categoryView = findViewById<ListView>(R.id.categoryListView)
        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.category)
        categoryView.adapter=adapter
    }
}