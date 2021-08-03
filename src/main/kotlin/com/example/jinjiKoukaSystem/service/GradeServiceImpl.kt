package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.Grade
import com.example.jinjiKoukaSystem.respository.GradeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GradeServiceImpl {
    @Autowired
    private val ListRepo: GradeRepository? = null

    fun patternSearch(): List<Grade?>? {
        return ListRepo?.appraisalPattern()
    }
}