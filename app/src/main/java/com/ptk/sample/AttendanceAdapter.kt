package com.ptk.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AttendanceAdapter(val attendanceList: List<String>) :
    RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AttendanceViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_attendance, parent, false)
        return AttendanceViewHolder(v)
    }

    override fun onBindViewHolder(
        holder: AttendanceViewHolder,
        position: Int
    ) {
        holder.tvTime.text = attendanceList[position]
    }

    override fun getItemCount() = attendanceList.size

    class AttendanceViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val tvTime = v.findViewById<TextView>(R.id.tvTimeArrive)
    }
}