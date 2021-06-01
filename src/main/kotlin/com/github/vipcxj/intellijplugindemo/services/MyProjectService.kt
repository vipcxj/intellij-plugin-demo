package com.github.vipcxj.intellijplugindemo.services

import com.github.vipcxj.intellijplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
