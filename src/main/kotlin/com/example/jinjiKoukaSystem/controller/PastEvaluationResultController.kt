package com.example.jinjiKoukaSystem.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import com.example.jinjiKoukaSystem.model.Grade
import com.example.jinjiKoukaSystem.repository.GradeRepository
import com.example.jinjiKoukaSystem.service.GradeServiceImpl
import org.springframework.beans.factory.annotation.Autowired

@Controller
class PastEvaluationResultController {
    @Autowired
    private val gradeServiceImpl: GradeServiceImpl? = null

    @Autowired
    private val repository: GradeRepository? = null


    @RequestMapping("/gradeList")
    fun appraisal(model: Model): String {
        val grade: List<Grade?>? = gradeServiceImpl?.patternSearch() as List<Grade?>?
        model.addAttribute("grade", grade)
        return "pastEvaluation"
    }

}