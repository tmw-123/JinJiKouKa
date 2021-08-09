package com.example.jinjiKoukaSystem.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "evaluator_registration")
class EvaluatorForm{
    @GeneratedValue(strategy =  GenerationType.AUTO)
    var id: Long? = 0

    @Id
//    var id: Long? = 0

    @Column(name = "employee_cd")
    var empCd :String? = null

    @Column(name = "appraisal_type")
    var appraisalType: String? = null

//    @Column(name = "approver1_id")
//    var approveId: String? = null

    @Column(name = "grade")
    var grade: Integer? = null

    @Column(name = "name")
    var name: String? = null

    @Column(name = "position_name")
    var positionName: String? = null

    @Column(name = "register_datetime")
    var registerDatetime: String? = null


//    var empCd :String? = null
//
//    var approveId: String? = null
//
//    var officer: String? = null
//
//    var grade: Integer? = null
//
//    var name: String? = null



//    var approver1_name: String? = null
//
//    var approver2_id: String? = null
//
//    var approver2_officer: String? = null
//
//    var approver2_grade: Integer? = null
//
//    var approver2_name: String? = null
//
//    var approver3_id: String? = null
//
//    var approver3_officer: String? = null
//
//    var approver3_grade: Integer? = null
//
//    var approver3_name: String? = null
//
//    var register_datetime: String? =null
//
//    var update_datetime: String? =null

    constructor(id: Long?,empCd: String?, appraisalType: String?, grade: Integer?, name: String?, positionName: String?, registerDatetime: String?) : super() {
//        this.id = id
        this.empCd = empCd
        this.appraisalType = appraisalType
        this.grade = grade
        this.name = name
        this.positionName = positionName
        this.registerDatetime = registerDatetime
    }

}