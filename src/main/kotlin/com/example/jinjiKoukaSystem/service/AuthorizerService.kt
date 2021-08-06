package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.Base

interface AuthorizerService {

    @Throws(java.lang.Exception::class)
    fun saveAuthorizer(authorizer: Base?): Base?

    @Throws(Exception::class)
    open fun deleteAuthorizer(authorizer: Base?): Base?

    fun deleteAuthorizerById(id: Long)
}

