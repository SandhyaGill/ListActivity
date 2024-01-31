package com.example.listactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var arrayList = arrayListOf("1","2","3")
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, arrayList)
        binding.list.adapter = adapter

        binding.btnUpdateList.setOnClickListener {
        arrayList.add((arrayList.size+1).toString())
            adapter.notifyDataSetChanged()
        }
    }
}