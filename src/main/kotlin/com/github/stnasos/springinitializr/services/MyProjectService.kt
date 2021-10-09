package com.github.stnasos.springinitializr.services

import com.intellij.openapi.project.Project
import com.github.stnasos.springinitializr.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
