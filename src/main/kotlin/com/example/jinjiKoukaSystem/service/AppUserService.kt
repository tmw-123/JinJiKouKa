package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.data.domain.Page

interface AppUserService {

    @Throws(Exception::class)
    fun findPaginated1(pageNo: Int, pageSize: Int, sortField: String?, sortDirection: String?): Page<AppUser?>?
}