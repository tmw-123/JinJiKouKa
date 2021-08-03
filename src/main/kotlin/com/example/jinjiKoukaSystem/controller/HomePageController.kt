package com.example.jinjiKoukaSystem.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import com.example.jinjiKoukaSystem.respository.GradeRepository
import com.example.jinjiKoukaSystem.service.GradeServiceImpl
import com.example.jinjiKoukaSystem.model.Grade

@Controller
class HomePageController {

    @Autowired
    private val gradeServiceImpl: GradeServiceImpl? = null

    @Autowired
    private val repository: GradeRepository? = null


    @RequestMapping("/homePage")
    fun homePage(model: Model): String {
        return "homePage"
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