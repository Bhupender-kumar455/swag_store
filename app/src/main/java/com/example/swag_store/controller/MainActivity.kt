package com.example.swag_store.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.swag_store.Adapters.CategoryAdapter
import com.example.swag_store.R
import com.example.swag_store.Services.DataService
import com.example.swag_store.model.Category

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categoryView = findViewById<ListView>(R.id.categoryListView)
            adapter=CategoryAdapter(this,DataService.category)
        categoryView.adapter=adapter
    }
}