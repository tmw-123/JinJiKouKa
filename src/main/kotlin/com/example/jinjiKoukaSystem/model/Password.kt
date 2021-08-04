package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "password")
class Password{


    @Id
    @Column(name = "employee_cd")
    var employee_cd : String? = null

    @Column(name = "sakura_cd")
    var sakura_cd : String? = null

    @Column(name = "password")
    var password : String? = null

    @Column(name = "name")
    var name : String? = null

    @Column(name = "reserve_01")
    var reserve_01 : String? = null

    @Column(name = "reserve_02")
    var reserve_02 : String? = null

    constructor(
        employee_cd : String? = null
        ,sakura_cd : String? = null
        ,password : String? = null
        ,name : String? = null
        ,reserve_01 : String? = null
        ,reserve_02 : String? = null

        ): super() {
            this.employee_cd = employee_cd
            this.sakura_cd = sakura_cd
            this.password = password
            this.name = name
            this.reserve_01 = reserve_01
            this.reserve_02 = reserve_02

        }

}

