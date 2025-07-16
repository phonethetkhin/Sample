package com.ptk.sample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


class TodayFragment : Fragment(R.layout.fragment_today) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvToday = view.findViewById<RecyclerView>(R.id.rvToday)

        val dummyTodayList =
            listOf<String>(
                "1:00PM", "12:00PM",

            )
        val attendanceAdapter = AttendanceAdapter(dummyTodayList)
        rvToday.adapter = attendanceAdapter
    }
}