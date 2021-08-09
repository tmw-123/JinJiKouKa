package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.Evaluator
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface EvaluatorListRepo : CrudRepository<Evaluator, String> {

    @Query(
        value = "SELECT * FROM m_user  WHERE grade <= 5",
        nativeQuery = true
    )
    fun empCd(): List<Evaluator?>?

    @Query(
        value = "SELECT * FROM m_user  WHERE grade >= 6",
        nativeQuery = true
    )
    fun evaluatorList(): List<Evaluator?>?

    @Query(
        value = "SELECT * FROM m_user WHERE employee_cd=:empCd",
        nativeQuery = true
    )
    fun approveID(@Param("empCd") empCd: String?): Evaluator

    @Query(
        value = "SELECT * FROM m_user WHERE employee_cd=:empCd AND grade <= 5",
        nativeQuery = true
    )
    fun empID(@Param("empCd") empCd: String?): Evaluator

    @Query(
        value = "SELECT * FROM m_belongs",
        nativeQuery = true
    )
    fun belongsList(): List<Evaluator?>?
}