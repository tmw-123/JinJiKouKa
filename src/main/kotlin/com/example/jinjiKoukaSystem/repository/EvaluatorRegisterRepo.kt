package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.EvaluatorForm
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EvaluatorRegisterRepo : CrudRepository<EvaluatorForm, Long> {

}