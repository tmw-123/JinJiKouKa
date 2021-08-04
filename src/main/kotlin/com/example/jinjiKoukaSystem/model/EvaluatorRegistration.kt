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
         ,approver1_id : String? = null
         ,approver1_officer : String? = null
         ,approver1_grade  : Int? = null
         ,approver1_name : String? = null
         ,approver2_id : String? = null
         ,approver2_officer : String? = null
         ,approver2_grade : Int? = null
         ,approver2_name : String? = null
         ,approver3_id : String? = null
         ,approver3_officer : String? = null
         ,approver3_grade : Int? = null
         ,approver3_name : String? = null
         ,register_datetime : String? = null
         ,update_datetime : String? = null


    ): super() {
        this.employee_cd  =  employee_cd
        this.approver1_id  = approver1_id
        this.approver1_officer  =  approver1_officer
        this.approver1_grade  = approver1_grade
        this.approver1_name  = approver1_name
        this.approver2_id  = approver2_id
        this.approver2_officer  = approver2_officer
        this.approver2_grade  = approver2_grade
        this.approver2_name  = approver2_name
        this.approver3_id  = approver3_id
        this.approver3_officer  = approver3_officer
        this.approver3_grade  = approver3_grade
        this.approver3_name  = approver3_name
        this.register_datetime  = register_datetime
        this.update_datetime  = update_datetime

        }

}

