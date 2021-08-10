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

    @Column(name = "grade")
    var grade: String? = null

    @Column(name = "name")
    var name: String? = null




    constructor()
    constructor(id: String?, employee_cd: String?, grade: String?, name: String?) {
        this.id = id
        this.employee_cd = employee_cd
        this.grade = grade
        this.name = name
    }


}