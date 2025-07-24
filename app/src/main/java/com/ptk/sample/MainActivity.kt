package com.ptk.sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.vpMain)

        viewPager.adapter = ViewPagerAdapter(this)

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                viewPager.post {
                    val recyclerView = viewPager.getChildAt(0) as RecyclerView
                    val holder = recyclerView.findViewHolderForAdapterPosition(position)
                    val view = holder?.itemView

                    if (view != null) {
                        view.measure(
                            View.MeasureSpec.makeMeasureSpec(view.width, View.MeasureSpec.EXACTLY),
                            View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
                        )
                        val measuredHeight = view.measuredHeight
                        viewPager.layoutParams.height = measuredHeight
                        viewPager.requestLayout()
                    }
                }
            }
        })
    }
}