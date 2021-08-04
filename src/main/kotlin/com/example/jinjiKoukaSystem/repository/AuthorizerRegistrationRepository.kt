package com.example.jinjiKoukaSystem.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorizerRegistrationRepository : CrudRepository<AuthorizerSetting, String> {
    @Query(
        value = "SELECT * FROM m_base",
        nativeQuery = true
    )
    fun authorizerData(): List<AuthorizerSetting?>?
}