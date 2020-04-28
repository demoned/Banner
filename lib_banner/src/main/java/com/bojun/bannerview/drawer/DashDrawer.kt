package com.zhpan.indicator.drawer

import android.graphics.Canvas

import com.zhpan.indicator.option.IndicatorOptions

/**
 * Dash Indicator Drawer.
 */
class DashDrawer internal constructor(indicatorOptions: IndicatorOptions) : RectDrawer(indicatorOptions) {

    override fun drawDash(canvas: Canvas) {
        canvas.drawRect(mRectF, mPaint)
    }
}
