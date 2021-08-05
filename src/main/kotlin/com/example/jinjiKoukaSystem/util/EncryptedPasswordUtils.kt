package com.example.jinjiKoukaSystem.util

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

object EncrytedPasswordUtils {
    fun encrytePassword(password: String?): String {
        val encoder = BCryptPasswordEncoder()
        return encoder.encode(password)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val password = "1234"
        val encrytedPassword = encrytePassword(password)
        println("Encryted Password: $encrytedPassword")
    }
}