package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface AppUserRepository :JpaRepository<AppUser,Long>{
    @Query(value = "SELECT name FROM password WHERE employee_cd like %:employeeCd%", nativeQuery = true)
    fun selectNameEng(@Param("employeeCd") employeeCd: String?): String?

}