package com.example.jinjiKoukaSystem.repository

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import com.example.jinjiKoukaSystem.model.Base
import org.springframework.data.repository.query.Param

@Repository
interface AuthorizerRegistrationRepository : CrudRepository<Base, String> {
    @Query(
        value = "SELECT * FROM m_base",
        nativeQuery = true
    )

    fun allAuthorizerList(): List<Base?>?

    @Query(
        value = "SELECT * FROM m_base WHERE approver_id =:id",
        nativeQuery = true
    )
    fun baseNo(@Param("id") id: String?): Base


    @Query(value = "SELECT grade_id FROM m_each_grade_appraisal_pattern ORDER BY grade_id DESC LIMIT 1", nativeQuery = true)
    fun selectLastRecordGradeId(): String?

    @Query(value = "delete FROM m_base WHERE id =:id", nativeQuery = true)
    fun deleteAuthorizer(@Param("id") id: String?): Base

}