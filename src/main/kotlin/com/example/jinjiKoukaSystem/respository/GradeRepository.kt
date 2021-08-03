package com.example.jinjiKoukaSystem.respository

import com.example.jinjiKoukaSystem.model.Grade
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface GradeRepository : CrudRepository<Grade, String> {
    @Query(
        value = "SELECT * FROM m_each_grade_appraisal_pattern",
        nativeQuery = true
    )
    fun appraisalPattern(): List<Grade?>?
}