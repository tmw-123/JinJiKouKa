package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.MainPage
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MainPageRepository : CrudRepository<MainPage, String> {

    @Query(
        value = "SELECT * FROM p_appraisal_result_db",
        nativeQuery = true
    )
    fun getAllMainPageData(): List<MainPage?>?




}