package com.example.f1tracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lista fake de pilotos, só pra testar o layout
        val fakeDrivers = listOf(
            Driver(1, "Max Verstappen", "Red Bull Racing", 393),
            Driver(2, "Lando Norris", "McLaren", 331),
            Driver(3, "Charles Leclerc", "Ferrari", 307),
            Driver(4, "Oscar Piastri", "McLaren", 262),
            Driver(5, "Carlos Sainz", "Ferrari", 244)
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewDrivers)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DriverAdapter(fakeDrivers)
    }
}