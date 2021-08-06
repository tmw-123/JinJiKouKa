package com.example.jinjiKoukaSystem.model

import javax.persistence.*


@Entity
@Table(name = "password")
class AppUser {

    /*fun AppUser(userId: Long?) {
        this.userId = userId
    }*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, length = 4)
    private var userId: Long? = null

    @Column(nullable = false, unique = true, length = 45, name = "employee_cd")
    private var userCd: String? = null

    @Column(nullable = false, length = 64,name = "password")
    private var encrytedPassword: String? = null

    @Column(name = "name")
    private var nameEng: String? = null

    fun AppUser(userId: Long?, userCd: String?, encrytedPassword: String?) {
        this.userId = userId
        this.userCd = userCd
        this.encrytedPassword = encrytedPassword
    }

    fun getUserId(): Long? {
        return userId
    }

    fun setUserId(userId: Long?) {
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

    constructor(userId: Long?,userCd: String?,encrytedPassword: String?) : super() {
        this.userId = userId
        this.userCd = userCd
        this.encrytedPassword = encrytedPassword
    }

    constructor(userId: Long?,userCd: String?,encrytedPassword: String?,nameEng:String?) : super() {
        this.userId = userId
        this.userCd = userCd
        this.encrytedPassword = encrytedPassword
        this.nameEng=nameEng
    }

    constructor(userId: Long?) : super() {
        this.userId = userId
    }

    constructor() : super() {        // TODO Auto-generated constructor stub
    }

}