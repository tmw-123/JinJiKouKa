package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service

@Service
class AppUserServiceImpl : AppUserService {
    override fun findPaginated1(
        pageNo: Int,
        pageSize: Int,
        sortField: String?,
        sortDirection: String?
    ): Page<AppUser?>? {
        TODO("Not yet implemented")
    }

}