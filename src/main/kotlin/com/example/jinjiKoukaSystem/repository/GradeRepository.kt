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
        value = "SELECT * FROM m_each_grade_appraisal_pattern WHERE appraisal_pattern =:appraisal_pattern",
        nativeQuery = true
    )
    fun selectGradeEdit(@Param("appraisal_pattern") appraisal_pattern: String?): Grade
}