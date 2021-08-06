package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.repository.AppUserRepository
import com.example.jinjiKoukaSystem.utils.WebUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.security.Principal
import java.util.Arrays.toString

@Controller
class LoginController {

    @Autowired
    private val userRepo: AppUserRepository? = null

    @RequestMapping(value = ["/", "/loginPage"], method = [RequestMethod.GET]) // login logout home page
    fun welcomePage(model: Model): String {
        model.addAttribute("title", "Welcome")
        model.addAttribute("message", "This is welcome page!")
        return "loginPage"
    }

    @RequestMapping(value = ["/userAccountInfo"], method = [RequestMethod.GET])
    fun userInfoAccountInfo(model: Model, principal: Principal): String {
        val userName = principal.name
        println("User Name: $userName")
        val listUsers = userRepo!!.findAll()
        val loginedUser = (principal as Authentication).principal as User
        val userInfo = WebUtils.toString(loginedUser)
        model.addAttribute("userInfo", userInfo)
        model.addAttribute("userInfo", listUsers)

        model.addAttribute("nameEnglish",userRepo.selectNameEng(userName))

        return "administratorSettingPage"
    }


    @RequestMapping("/loginfail")
    fun loginfail(model: Model): String {
        return "loginFailPage"
    }

    @RequestMapping(value = ["/403"], method = [RequestMethod.GET])
    // user will do login in admin login page ,this error
    // message will appear with this page.
    fun accessDenied(model: Model, principal: Principal?): String {
        if (principal != null) {
            val loginedUser = (principal as Authentication).principal as User
            val userInfo = WebUtils.toString(loginedUser)
            model.addAttribute("userInfo", userInfo)
            val message = ("Hi " + principal.getName() //
                    + "<br> You do not have permission to access this page!Please click the Logout  to get admin access account from the menu...")
            model.addAttribute("message", message)
        }
        return "403Page"
    }
}