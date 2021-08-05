package com.example.jinjiKoukaSystem.service

//import com.example.jinjiKoukaSystem.model.Grade
import com.example.jinjiKoukaSystem.model.Grade
import org.springframework.data.domain.Page

interface GradeService {

    @Throws(java.lang.Exception::class)
    fun saveGrade(grade: Grade?): Grade?

}

