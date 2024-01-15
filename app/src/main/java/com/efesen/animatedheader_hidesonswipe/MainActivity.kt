package com.efesen.animatedheader_hidesonswipe


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.efesen.animatedheader_hidesonswipe.adapter.Adapter
import com.efesen.animatedheader_hidesonswipe.databinding.ActivityMainBinding
import com.efesen.animatedheader_hidesonswipe.model.Item

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = Item.generateMockData()

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        val adapter = Adapter(items)
        binding.recyclerView.adapter = adapter

    }
}