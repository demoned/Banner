package com.zhpan.indicator.annotation

import androidx.annotation.IntDef
import com.zhpan.indicator.enums.IndicatorSlideMode.Companion.COLOR
import com.zhpan.indicator.enums.IndicatorSlideMode.Companion.NORMAL
import com.zhpan.indicator.enums.IndicatorSlideMode.Companion.SCALE
import com.zhpan.indicator.enums.IndicatorSlideMode.Companion.SMOOTH
import com.zhpan.indicator.enums.IndicatorSlideMode.Companion.WORM


@IntDef(NORMAL, SMOOTH, WORM, COLOR, SCALE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD)
annotation class AIndicatorSlideMode
