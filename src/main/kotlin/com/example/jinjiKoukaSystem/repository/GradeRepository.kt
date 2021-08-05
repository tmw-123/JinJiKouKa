package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.Grade
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface GradeRepository : CrudRepository<Grade, String> {
    @Query(
        value = "SELECT * FROM m_each_grade_appraisal_pattern",
        nativeQuery = true
    )
    fun appraisalPattern(): List<Grade?>?


    @Query(
        value = "SELECT * FROM m_each_grade_appraisal_pattern WHERE grade_id =:grade_id",
        nativeQuery = true
    )
    fun gardeNumber(@Param("grade_id") grade_id: String?): Grade


    @Query(value = "SELECT grade_id FROM m_each_grade_appraisal_pattern ORDER BY grade_id DESC LIMIT 1", nativeQuery = true)
    fun selectLastRecordGradeId(): String?
}