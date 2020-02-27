package com.ivan.sison.hr.utils

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.ivan.sison.hr.R

object NavigateUtil {

    fun onDisplayFragment(manager: FragmentManager?, newFragment: Fragment) {
        manager?.beginTransaction()?.replace(R.id.frame_view, newFragment)?.commit()
    }
}