package com.bojun.bannerview.annotation;

import androidx.annotation.IntDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.bojun.bannerview.constants.IndicatorGravity.CENTER;
import static com.bojun.bannerview.constants.IndicatorGravity.END;
import static com.bojun.bannerview.constants.IndicatorGravity.START;


/**
 * 指示器显示位置
 */
@IntDef({CENTER, START, END})
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PARAMETER)
public @interface AIndicatorGravity {

}
