package com.example.jinjiKoukaSystem.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class EvaluatorsListController {

    @GetMapping("/evaluatorList")
    fun evaluator(model: Model): String? {
//        model.addAttribute("PjList", pjListRepo.findAll())
        return "EvaluatorsList"
    }

}