package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.controller.AuthorizerRegistrationController
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import com.example.jinjiKoukaSystem.model.Base

@Repository
interface AuthorizerRegistrationRepository : CrudRepository<AuthorizerRegistrationController, String> {
    @Query(
        value = "SELECT * FROM m_base",
        nativeQuery = true
    )
    fun authorizerData(): List<AuthorizerRegistrationController?>?
    abstract fun save(newAuthorizerReg: Base)
}