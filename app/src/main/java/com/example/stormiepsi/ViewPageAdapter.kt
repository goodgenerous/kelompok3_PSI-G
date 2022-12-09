package com.example.stormiepsi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPageAdapter(private val context: Context): PagerAdapter() {
    private val title = arrayOf(R.string.pelanggan, R.string.agen)
    private val descs = arrayOf(R.string.text_pelanggan, R.string.text_agen)

    override fun getCount(): Int {
        return 2
    }

    override fun isViewFromObject(view: View, objects: Any): Boolean {
        return view == objects
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view: View = LayoutInflater.from(container.context).inflate(R.layout.slider_layout,container, false)
        val slideTitle: TextView = view.findViewById(R.id.tv_title)
        val slideDescription: TextView = view.findViewById(R.id.tv_description)
        slideTitle.text = context.resources.getString(title[position])
        slideDescription.text = context.resources.getString(descs[position])
        val viewPager: ViewPager = container as ViewPager
        viewPager.addView(view, 0)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, objects: Any) {
        val viewPager: ViewPager = container as ViewPager
        val view: View = objects as View
        viewPager.removeView(view)
    }
}