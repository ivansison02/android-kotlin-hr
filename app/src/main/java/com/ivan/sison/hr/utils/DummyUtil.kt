package com.ivan.sison.hr.utils

import com.ivan.sison.hr.models.ApplicationType

object DummyUtil {

    fun getApplicationTypes() : ArrayList<ApplicationType> {
        var types: ArrayList<ApplicationType> = ArrayList()

        types.add(ApplicationType(0, "Vacation Leave", 1))
        types.add(ApplicationType(1, "Sick Leave", 1))
        types.add(ApplicationType(2, "Overtime Work", 1))
        types.add(ApplicationType(3, "Reimbursement", 1))
        types.add(ApplicationType(4, "Out of Office", 1))

        return types
    }
}