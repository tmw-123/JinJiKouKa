package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.MainData
import com.example.jinjiKoukaSystem.model.MainPage
import com.example.jinjiKoukaSystem.repository.MainPageRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MainPageServiceImpl : MainPageService {

    @Autowired
    private val ListRepo: MainPageRepository? = null

    override fun getAllMainPageData(): List<MainPage?>? {
        return ListRepo?.getAllMainPageData()
    }

    @Autowired
    private val ListRepo1: MainPageRepository? = null

    override fun getAllMainPage(): String? {
        return ListRepo1?.getAllMainPage()
    }







}