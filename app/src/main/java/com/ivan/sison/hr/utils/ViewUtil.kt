package com.ivan.sison.hr.utils

import android.content.Context
import android.util.DisplayMetrics

object ViewUtil {

    fun calculateNoOfColumns(context: Context, columnWidthDp: Float): Int {
        val displayMetrics: DisplayMetrics = context.getResources().getDisplayMetrics()
        val screenWidthDp = displayMetrics.widthPixels / displayMetrics.density
        return (screenWidthDp / columnWidthDp + 0.5).toInt()
    }
}