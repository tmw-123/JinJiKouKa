package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.MainPage
import com.example.jinjiKoukaSystem.repository.MainPageRepository
import org.springframework.beans.factory.annotation.Autowired

//import com.example.jinjiKoukaSystem.model.MainPage


interface MainPageService {

    fun getAllMainPageData(): List<MainPage?>?



}

