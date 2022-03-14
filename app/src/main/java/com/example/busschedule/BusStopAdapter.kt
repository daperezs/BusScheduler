package com.example.busschedule

import android.widget.ListAdapter
import database.Schedule.Schedule

class BusStopAdapter(private val onItemClicked: (Schedule) -> Unit) : ListAdapter<Schedule, BusStopAdapter.BusStopViewHolder>(DiffCallback) {
}