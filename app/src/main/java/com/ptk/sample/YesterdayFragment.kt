package com.ptk.sample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView


class YesterdayFragment : Fragment(R.layout.fragment_yesterday) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvYesterday = view.findViewById<RecyclerView>(R.id.rvYesterday)

        val dummyYesterdayList =
            listOf<String>(
                "1:00PM", "12:00PM",
                "9:00AM", "10:00AM",
                "11:00AM", "9:00AM",
                "12:00PM", "8:00AM"
            )
        val attendanceAdapter = AttendanceAdapter(dummyYesterdayList)
        rvYesterday.adapter = attendanceAdapter
    }
}