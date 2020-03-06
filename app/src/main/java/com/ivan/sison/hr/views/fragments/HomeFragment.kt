package com.ivan.sison.hr.views.fragments


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner

import com.ivan.sison.hr.R
import com.ivan.sison.hr.models.ApplicationType
import com.ivan.sison.hr.utils.ConstantUtil
import com.ivan.sison.hr.utils.DummyUtil
import com.ivan.sison.hr.utils.NavigateUtil

class HomeFragment : Fragment() {

    private var mViewCalendar: Int = 0
    private var mViewList: Int = 1
    private var mViewCurrent: Int = mViewCalendar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_home, container, false)

        val viewType: ImageView = root.findViewById(R.id.img_view_type)
        viewType.setOnClickListener {
            if (mViewCurrent == mViewCalendar) {
                mViewCurrent = mViewList
                onDisplayView(ListViewFragment())
            }
            else {
                mViewCurrent = mViewCalendar
                onDisplayView(CalendarViewFragment())
            }
        }

        var applicationTypes: ArrayList<String>  = ArrayList()

        for (type: ApplicationType in DummyUtil.getApplicationTypes()) {
            applicationTypes.add(type.name)
        }

        val spinner: Spinner = root.findViewById(R.id.spn_application)
        spinner.adapter = ArrayAdapter(activity!!.applicationContext, R.layout.layout_spn, applicationTypes)

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val type = parent?.getItemAtPosition(position).toString()

            }
        }

        onDisplayView(CalendarViewFragment())

        return root
    }

    fun onDisplayView(newView: Fragment) {
        NavigateUtil.onDisplayFragment(activity?.supportFragmentManager, newView)
    }
}
