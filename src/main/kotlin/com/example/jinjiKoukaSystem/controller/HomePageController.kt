package com.example.jinjiKoukaSystem.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class HomePageController {

    @RequestMapping("/homePage")
    fun homePage(model: Model): String {
        return "homePage"
    }
}