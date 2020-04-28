package com.zhpan.indicator.drawer

import android.graphics.Canvas

import com.zhpan.indicator.option.IndicatorOptions
class RoundRectDrawer internal constructor(indicatorOptions: IndicatorOptions) : RectDrawer(indicatorOptions) {

    override fun drawRoundRect(canvas: Canvas, rx: Float, ry: Float) {
        canvas.drawRoundRect(mRectF, rx, ry, mPaint)
    }
}
