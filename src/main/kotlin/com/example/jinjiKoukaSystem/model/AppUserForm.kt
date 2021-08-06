package com.example.jinjiKoukaSystem.model

import java.io.Serializable

class AppUserForm:Serializable {

    private val serialVersionUID = 1L
    private var userId: Long = 0
    private var userCd: String? = null
    private var encrytedPassword: String? = null


    fun getUserId(): Long {
        return userId
    }

    fun setUserId(userId: Long) {
        this.userId = userId
    }

    fun getUserName(): String? {
        return userCd
    }

    fun setUserName(userCd: String?) {
        this.userCd = userCd
    }

    fun getEncrytedPassword(): String? {
        return encrytedPassword
    }

    fun setEncrytedPassword(encrytedPassword: String?) {
        this.encrytedPassword = encrytedPassword
    }

    fun getSerialversionuid(): Long {
        return serialVersionUID
    }


}