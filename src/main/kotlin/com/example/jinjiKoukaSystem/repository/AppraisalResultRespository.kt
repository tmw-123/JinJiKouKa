package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.AppraisalResult
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AppraisalResultRespository : CrudRepository<AppraisalResult, String> {
    @Query(
        value = "SELECT * FROM p_appraisal_result_db",
        nativeQuery = true
    )
    fun appraisalResult(): List<AppraisalResult?>?
}