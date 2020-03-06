package com.ivan.sison.hr.utils

import com.ivan.sison.hr.R
import com.ivan.sison.hr.models.ApplicationType

object DummyUtil {

    fun getApplicationTypes() : ArrayList<ApplicationType> {
        var types: ArrayList<ApplicationType> = ArrayList()

        types.add(ApplicationType(0, "Vacation Leave", R.color.colorApplicationVacation, 1))
        types.add(ApplicationType(1, "Sick Leave", R.color.colorApplicationSick, 1))
        types.add(ApplicationType(2, "Overtime Work", R.color.colorApplicationOvertime, 1))
        types.add(ApplicationType(3, "Reimbursement", R.color.colorApplicationReimbursement, 1))
        types.add(ApplicationType(4, "Out of Office", R.color.colorApplicationOutOfOffice, 1))

        return types
    }
}