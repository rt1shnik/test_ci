package com.example.testci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testci.adapter.RadioButtonsAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerVew: RecyclerView
    private lateinit var adapter: RadioButtonsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerVew = findViewById(R.id.recyclerView)
        adapter = RadioButtonsAdapter()
        recyclerVew.adapter = adapter
        recyclerVew.layoutManager = LinearLayoutManager(this)

        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener {
            Toast.makeText(this, adapter.lastClickedItemPosition.toString(), Toast.LENGTH_SHORT).show()
        }

        interceptorLayout.setOnClickListener {
            Log.d("searchView", "OnClick frame")
        }
    }
}
