package com.example.f1tracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DriverAdapter(private val drivers: List<Driver>) :
    RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {

    class DriverViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvPosition: TextView = itemView.findViewById(R.id.tvPosition)
        val tvDriverName: TextView = itemView.findViewById(R.id.tvDriverName)
        val tvTeamName: TextView = itemView.findViewById(R.id.tvTeamName)
        val tvPoints: TextView = itemView.findViewById(R.id.tvPoints)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_driver, parent, false)
        return DriverViewHolder(view)
    }

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        val driver = drivers[position]
        holder.tvPosition.text = driver.position.toString()
        holder.tvDriverName.text = driver.name
        holder.tvTeamName.text = driver.team
        holder.tvPoints.text = "${driver.points} pts"
    }

    override fun getItemCount(): Int = drivers.size
}