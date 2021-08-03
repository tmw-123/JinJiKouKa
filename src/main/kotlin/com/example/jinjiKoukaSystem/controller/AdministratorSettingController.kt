package com.example.jinjiKoukaSystem.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import com.example.jinjiKoukaSystem.repository.GradeRepository
import com.example.jinjiKoukaSystem.service.GradeServiceImpl

@Controller
class AdministratorSettingController {

    @Autowired
    private val gradeServiceImpl: GradeServiceImpl? = null

    @Autowired
    private val repository: GradeRepository? = null


    @RequestMapping("/administratorPage")
    fun administratorPage(model: Model): String {
        return "administratorSettingPage"
    }

    @RequestMapping("/gradeRegistration")
    fun gradeRegistration(model: Model): String {
        return "gradeRegistration"
    }

    @RequestMapping("/primaryEvaluation")
    fun primaryEvaluation(model: Model): String {
        return "primaryEvaluationScreen"
    }

    @RequestMapping("/primarysecondaryEvaluation")
    fun primarysecondaryEvaluation(model: Model): String {
        return "primaryEvaluationScreen"
    }

    @RequestMapping("/selfEvaluationScreen")
    fun selfEvaluationScreen(model: Model): String {
        return "selfEvaluationScreen"
    }
}