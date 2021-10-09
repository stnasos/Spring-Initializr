package com.github.stnasos.springinitializr.services

import com.github.stnasos.springinitializr.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))
    }
}
