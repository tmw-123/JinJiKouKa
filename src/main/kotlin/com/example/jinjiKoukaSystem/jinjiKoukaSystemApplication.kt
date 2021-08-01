package com.example.jinjiKoukaSystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class JinjiKoukaSystemApplication

fun main(args: Array<String>) {
	runApplication<JinjiKoukaSystemApplication>(*args)
}
