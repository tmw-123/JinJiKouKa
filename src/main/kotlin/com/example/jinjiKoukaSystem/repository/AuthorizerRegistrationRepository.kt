package com.example.jinjiKoukaSystem.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import com.example.jinjiKoukaSystem.model.Base

@Repository
interface AuthorizerRegistrationRepository : CrudRepository<Base, String> {
    @Query(
        value = "SELECT * FROM m_base",
        nativeQuery = true
    )
    fun authorizerData(): List<Base?>?
}