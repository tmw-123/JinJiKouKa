package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.AppraisalResult
import com.example.jinjiKoukaSystem.repository.AppraisalResultRespository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AppraisalResultServiceImpl {
    @Autowired
    private val ListRepo: AppraisalResultRespository? = null

    fun appraisalResult(): List<AppraisalResult?>? {
        return ListRepo?.appraisalResult()
    }
}