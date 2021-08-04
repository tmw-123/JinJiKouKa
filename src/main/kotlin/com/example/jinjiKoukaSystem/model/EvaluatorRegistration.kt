package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "evaluator_registration")
class EvaluatorRegistration{

    @Column(name = "employee_cd")
    var employee_cd : String? = null

    @Column(name = "approver1_id")
    var approver1_id : String? = null

    @Column(name = "approver1_officer")
    var approver1_officer : String? = null

    @Column(name = "approver1_grade")
    var approver1_grade : Int? = null

    @Column(name = "approver1_name")
    var approver1_name : String? = null

    @Column(name = "approver2_id")
    var approver2_id : String? = null

    @Column(name = "approver2_officer")
    var approver2_officer : String? = null

    @Column(name = "approver2_name")
    var approver2_grade : Int? = null

    @Column(name = "")
    var  approver2_name : String? = null

    @Column(name = "approver3_id")
    var approver3_id : String? = null

    @Column(name = "approver3_officer")
    var approver3_officer : String? = null

    @Column(name = "approver3_grade")
    var approver3_grade : Int? = null

    @Column(name = "approver3_name")
    var approver3_name : String? = null

    @Column(name = "register_datetime")
    var register_datetime : String? = null

    @Column(name = "update_datetime")
    var update_datetime : String? = null



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

