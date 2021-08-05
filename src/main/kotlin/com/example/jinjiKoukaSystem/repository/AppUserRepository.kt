package com.example.jinjiKoukaSystem.repository

import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface AppUserRepository :JpaRepository<AppUser,Long>{
    @Query(value = "SELECT name_eng FROM user_master WHERE user_cd like %:userCd%", nativeQuery = true)
    fun selectNameEng(@Param("userCd") userCd: String?): String?

}