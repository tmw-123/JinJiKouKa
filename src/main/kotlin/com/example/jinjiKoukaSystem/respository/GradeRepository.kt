package com.example.jinjiKoukaSystem.model

import com.example.jinjiKoukaSystem.model.Grade
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
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
    fun appraisalPattern(@Param("appraisal_pattern") appraisal_pattern: String?): List<Grade?>?


}