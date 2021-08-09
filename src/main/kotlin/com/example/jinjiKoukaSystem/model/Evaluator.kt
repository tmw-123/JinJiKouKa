package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_user")
class Evaluator (
 @Id @GeneratedValue(strategy =  GenerationType.AUTO)

@Column(name = "employee_cd")
val empCd: String,

@Column(name = "name")
val name: String,

@Column(name = "company_entry_date")
val companyEntryDate: String,

@Column(name = "birthday")
val birthday: String,

@Column(name = "grade")
val grade: Integer,

@Column(name = "appraisal_type")
val appraisalType: String,

 @Column(name = "belong_cd")
 val belongCd: Integer,

 @Column(name = "belong_name")
 val belongName: String,

 @Column(name = "position_cd")
val positionCd: String,

 @Column(name = "position_name")
 val positionName: String

)