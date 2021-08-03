package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.AuthorizerSetting
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorizerSettingRepository : CrudRepository<AuthorizerSetting, String> {
    @Query(
        value = "SELECT * FROM m_base",
        nativeQuery = true
    )
    fun authorizerData(): List<AuthorizerSetting?>?
}