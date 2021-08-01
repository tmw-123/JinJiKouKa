package com.example.jinjiKoukaSystem.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class LoginController {

    @RequestMapping(value = ["/", "/loginPage"], method = [RequestMethod.GET]) // login logout home page
    fun welcomePage(model: Model): String {
        model.addAttribute("title", "Welcome")
        model.addAttribute("message", "This is welcome page!")
        return "loginPage"
    }
}