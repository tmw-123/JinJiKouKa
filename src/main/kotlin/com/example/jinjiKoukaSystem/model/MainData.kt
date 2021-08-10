package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_user")
class MainData{

    @Id
    @Column(name = "id")
    var id: String? = null

    @Column(name = "employee_cd")
    var employee_cd: String? = null

    @Column(name = "ad_grade")
    var ad_grade: String? = null

    @Column(name = "ad_name")
    var ad_name: String? = null




    constructor()
    constructor(id: String?, employee_cd: String?, ad_grade: String?, ad_name: String?) {
        this.id = id
        this.employee_cd = employee_cd
        this.ad_grade = ad_grade
        this.ad_name = ad_name
    }


}