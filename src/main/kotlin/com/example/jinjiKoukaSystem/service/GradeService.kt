package com.example.jinjiKoukaSystem.service

//import com.example.jinjiKoukaSystem.model.Grade
import com.example.jinjiKoukaSystem.model.Grade

interface GradeService {

    @Throws(java.lang.Exception::class)
    fun saveGrade(grade: Grade?): Grade?

    @Throws(Exception::class)
    open fun deleteGrade(grade: Grade?): Grade?

    fun deleteGradeById(grade_id: String)
}

