package com.ivan.sison.hr.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

import com.ivan.sison.hr.R
import com.ivan.sison.hr.utils.DummyUtil
import com.ivan.sison.hr.utils.GridItemDecorationUtil
import com.ivan.sison.hr.utils.ViewUtil
import com.ivan.sison.hr.views.adapters.LegendAdapter

/**
 * A simple [Fragment] subclass.
 */
class CalendarViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_calendar_view, container, false)

        val recyclerApplication: RecyclerView = root.findViewById(R.id.rv_legends)
        recyclerApplication.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL)
        recyclerApplication.addItemDecoration(GridItemDecorationUtil(5, 5))
        recyclerApplication.adapter = LegendAdapter(DummyUtil.getApplicationTypes(), activity?.applicationContext!!)

        return root
    }
}
