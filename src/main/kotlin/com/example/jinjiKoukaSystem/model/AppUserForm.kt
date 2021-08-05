package com.example.jinjiKoukaSystem.model

import java.io.Serializable

class AppUserForm : Serializable {
    var userId: Long = 0
    var userName: String? = null
    var encrytedPassword: String? = null

    companion object {
        const val serialversionuid = 1L
    }
}