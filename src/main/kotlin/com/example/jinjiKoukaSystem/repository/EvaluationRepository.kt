package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.EvaluationList
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EvaluationRepository: CrudRepository<EvaluationList, String> {

}