package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "p_appraisal_login_db")
class AppraisalLogin{

    @Column(name = "register_datetime")
    var register_datetime : String? = null

    @Column(name = "update_datetime")
    var update_datetime : String? = null

    @Column(name = "double_flg")
    var double_flg : String? = null

    @Column(name = "evaluator_id")
    var evaluator_id : String? = null

    @Column(name = "password")
    var password : String? = null

    @Column(name = "person_in_charge_name")
    var person_in_charge_name : String? = null

    @Column(name = "mail_address")
    var mail_address : String? = null

    @Column(name = "personal_flg")
    var personal_flg : String? = null

    constructor(
        register_datetime : String? = null
        ,update_datetime : String? = null
        ,double_flg : String? = null
        ,evaluator_id : String? = null
        ,password : String? = null
        ,person_in_charge_name : String? = null
        ,mail_address : String? = null
        ,personal_flg : String? = null
        ): super() {
            this. register_datetime = register_datetime
            this.update_datetime = update_datetime
            this.double_flg = double_flg
            this.evaluator_id = evaluator_id
            this.password = password
            this.person_in_charge_name = person_in_charge_name
            this.mail_address = mail_address
            this.personal_flg = personal_flg


        }
}

