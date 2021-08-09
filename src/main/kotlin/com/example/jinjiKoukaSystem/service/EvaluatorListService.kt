package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.EvaluatorForm

interface EvaluatorListService {
    @Throws(java.lang.Exception::class)
    fun saveEvaluatorForm(evaluatorForm: EvaluatorForm?): EvaluatorForm?
}

