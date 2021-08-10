package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.model.MainData
import com.example.jinjiKoukaSystem.model.MainPage
import com.example.jinjiKoukaSystem.repository.MainPageRepository
import com.example.jinjiKoukaSystem.service.MainPageService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@Controller
class MainPageController {


    @Autowired
    private val MainPageRepository: MainPageRepository? = null

    @Autowired
    private val MainPageService: MainPageService? = null

    //save all MainPage data in table
    @RequestMapping("/MainPage")
    fun viewMainPage(model: Model, @ModelAttribute MainPage: MainPage): String? {



        val mainPageData: List<MainPage> = MainPageService?.getAllMainPageData() as List<MainPage>

        val mainData: String? = MainPageService?.getAllMainPage()





        model.addAttribute("mainPageData", mainPageData);

        model.addAttribute("mainData", mainData);






        return "Main Page"
    }











}