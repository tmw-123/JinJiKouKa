package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.AppraisalResult
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Suppress("SpellCheckingInspection")
@Repository
interface AppraisalResultRespository : CrudRepository<AppraisalResult, String> {
    @Query(
        value = "SELECT * FROM p_appraisal_result_db",
        nativeQuery = true
    )
    fun appraisalResult(): List<AppraisalResult?>?

    @Query(
        value = "SELECT * FROM p_appraisal_result_db WHERE name = %:name%",
        nativeQuery = true
    )
    fun appraisalSearchWithName(@Param("name") name: String?): List<AppraisalResult?>?

    @Query(
        value = "SELECT * FROM p_appraisal_result_db WHERE grade = %:name%",
        nativeQuery = true
    )
    fun appraisalSearchWithGrade(): List<AppraisalResult?>?

    @Query(
        value = "SELECT * FROM p_appraisal_result_db",
        nativeQuery = true
    )
    fun appraisalSearchWithGradeandName(): List<AppraisalResult?>?

}