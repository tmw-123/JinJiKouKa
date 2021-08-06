package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "password")
class Password{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, length = 4,name = "employee_id")
    private var employee_id: Long? = null

    @Column(nullable = false, unique = true,name = "employee_cd")
    var employee_cd : String? = null

    @Column(name = "sakura_cd")
    var sakura_cd : String? = null

    @Column(nullable = false, length = 255,name = "password")
    private var encrytedPassword: String? = null

    @Column(name = "name")
    var name : String? = null

    @Column(name = "reserve_01")
    var reserve_01 : String? = null

    @Column(name = "reserve_02")
    var reserve_02 : String? = null

    constructor(
        employee_id : Long? = null
        ,employee_cd : String? = null
        ,sakura_cd : String? = null
        ,encrytedPassword : String? = null
        ,name : String? = null
        ,reserve_01 : String? = null
        ,reserve_02 : String? = null

        ): super() {
        this.employee_id = employee_id
            this.employee_cd = employee_cd
            this.sakura_cd = sakura_cd
            this.encrytedPassword = encrytedPassword
            this.name = name
            this.reserve_01 = reserve_01
            this.reserve_02 = reserve_02

        }

    constructor(employee_id: Long?,employee_cd: String?,encrytedPassword: String?) : super() {
        this.employee_id = employee_id
        this.employee_cd = employee_cd
        this.encrytedPassword = encrytedPassword
    }


    fun getEmployeeId(): Long? {
        return employee_id
    }

    fun setEmployeeId(employee_id: Long?) {
        this.employee_id = employee_id
    }

    fun getEmployeeCd(): String? {
        return employee_cd
    }

    fun setEmployeeCd(employee_cd: String?) {
        this.employee_cd = employee_cd
    }


    fun getEncrytedPassword(): String? {
        return encrytedPassword
    }

    fun setEncrytedPassword(encrytedPassword: String?) {
        this.encrytedPassword = encrytedPassword
    }


}

