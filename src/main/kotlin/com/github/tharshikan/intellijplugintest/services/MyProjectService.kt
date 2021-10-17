package com.github.tharshikan.intellijplugintest.services

import com.intellij.openapi.project.Project
import com.github.tharshikan.intellijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
