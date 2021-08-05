package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "app_user")
class AppUser {
    constructor(userId: Long?) : super() {
        this.userId = userId
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, length = 45)
    var userId: Long? = null

    @Column(nullable = false, unique = true, length = 45, name = "user_name")
    var userName: String? = null

    @Column(nullable = false, length = 64)
    var encrytedPassword: String? = null

    constructor() {}
    constructor(userId: Long?, userName: String?, encrytedPassword: String?) {
        this.userId = userId
        this.userName = userName
        this.encrytedPassword = encrytedPassword
    }

    override fun toString(): String {
        return userName + "/" + encrytedPassword
    }
}