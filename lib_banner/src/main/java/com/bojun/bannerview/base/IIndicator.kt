package com.zhpan.indicator.base

import androidx.viewpager.widget.ViewPager

import com.zhpan.indicator.option.IndicatorOptions

interface IIndicator : ViewPager.OnPageChangeListener {

    fun notifyDataChanged()

    fun setIndicatorOptions(options: IndicatorOptions)

}
