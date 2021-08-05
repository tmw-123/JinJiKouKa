package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.model.Base
import com.example.jinjiKoukaSystem.model.Grade
import com.example.jinjiKoukaSystem.repository.AuthorizerRegistrationRepository
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
    private val gradeRepository: GradeRepository? = null

    @Autowired
    private val authoRegRepository: AuthorizerRegistrationRepository? = null

    @RequestMapping("/administratorPage")
    fun administratorPage(model: Model): String {
        return "administratorSettingPage"
    }

    @RequestMapping("/authorizerRegistration")
    fun authorizerRegistration(model: Model, @ModelAttribute authorizerReg: Base): String {
        model.addAttribute("allAuthorizerLists", authoRegRepository?.findAll())
        return "authorizerRegistration"
    }

    @RequestMapping("/gradeRegistration")
    fun gradeRegistration(model: Model, @ModelAttribute grade: Grade): String {
        model.addAttribute("allGradeLists", gradeRepository?.findAll())
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