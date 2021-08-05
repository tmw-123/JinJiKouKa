package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.Base
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorizerRegistrationRepository : CrudRepository<Base, String> {
    @Query(
        value = "SELECT * FROM m_base",
        nativeQuery = true
    )
    fun allAuthorizerList(): List<Base?>?

/*
    @Query(
        value = "SELECT * FROM m_base WHERE approver_id =:approver_id",
        nativeQuery = true
    )
    fun selectAuthorizerEdit(@Param("approver_id") appraisal_pattern: String?): Base
*/

}