package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_each_grade_appraisal_pattern")
class EvaluationList {

    @Id
    @Column(name = "appraisal_pattern")
    var a_pattern:String?=null

    @Column(name = "officer")
    var officer:String?=null

    @Column(name = "grade1_item")
    var g1_item:String?=null

    @Column(name = "grade1_evaluation_points")
    var g1_e_points:String?=null

    @Column(name = "grade1_weight_salary_increase")
    var g1_w_s_increase:String?=null

    @Column(name = "grade1_weight_bonus")
    var g1_w_bonus:String?=null

    @Column(name = "grade2_item")
    var g2_item:String?=null

    @Column(name = "grade2_evaluation_points")
    var g2_e_points:String?=null

    @Column(name = "grade2_weight_salary_increase")
    var g2_w_s_increase:String?=null

    @Column(name = "grade2_weight_bonus")
    var g2_w_bonus:String?=null

    @Column(name = "grade3_item")
    var g3_item:String?=null

    @Column(name = "grade3_evaluation_points")
    var g3_e_points:String?=null

    @Column(name = "grade3_weight_salary_increase")
    var g3_w_s_increase:String?=null

    @Column(name = "grade3_weight_bonus")
    var g3_w_bonus:String?=null

    @Column(name = "grade4_item")
    var g4_item:String?=null

    @Column(name = "grade4_evaluation_points")
    var g4_e_points:String?=null

    @Column(name = "grade4_weight_salary_increase")
    var g4_w_s_increase:String?=null

    @Column(name = "grade4_weight_bonus")
    var g4_w_bonus:String?=null

    @Column(name = "grade5_item")
    var g5_item:String?=null

    @Column(name = "grade5_evaluation_points")
    var g5_e_points:String?=null

    @Column(name = "grade5_weight_salary_increase")
    var g5_w_s_increase:String?=null

    @Column(name = "grade5_weight_bonus")
    var g5_w_bonus:String?=null

    @Column(name = "ability1_item")
    var ab1_item:String?=null

    @Column(name = "ability1_evaluation_points")
    var ab1_e_points:String?=null

    @Column(name = "ability1_weight_salary_increase")
    var ab1_w_s_increase:String?=null

    @Column(name = "ability1_weight_bonus")
    var ab1_w_bonus:String?=null

    @Column(name = "ability2_item")
    var ab2_item:String?=null

    @Column(name = "ability2_evaluation_points")
    var ab2_e_points:String?=null

    @Column(name = "ability2_weight_salary_increase")
    var ab2_w_s_increase:String?=null

    @Column(name = "ability2_weight_bonus")
    var ab2_w_bonus:String?=null

    @Column(name = "ability3_item")
    var ab3_item:String?=null

    @Column(name = "ability3_evaluation_points")
    var ab3_e_points:String?=null

    @Column(name = "ability3_weight_salary_increase")
    var ab3_w_s_increase:String?=null

    @Column(name = "ability3_weight_bonus")
    var ab3_w_bonus:String?=null

    @Column(name = "ability4_item")
    var ab4_item:String?=null

    @Column(name = "ability4_evaluation_points")
    var ab4_e_points:String?=null

    @Column(name = "ability4_weight_salary_increase")
    var ab4_w_s_increase:String?=null

    @Column(name = "ability4_weight_bonus")
    var ab4_w_bonus:String?=null

    @Column(name = "approach_attitude1_item")
    var ap_at1_item:String?=null

    @Column(name = "approach_attitude1_evaluation_points")
    var ap_at1_e_points:String?=null

    @Column(name = "approach_attitude1_weight_salary_increase")
    var ap_at1_w_s_increase:String?=null

    @Column(name = "approach_attitude1_weight_bonus")
    var ap_at1_w_bonus:String?=null

    @Column(name = "approach_attitude2_item")
    var ap_at2_item:String?=null

    @Column(name = "approach_attitude2_evaluation_points")
    var ap_at2_e_points:String?=null

    @Column(name = "approach_attitude2_weight_salary_increase")
    var ap_at2_w_s_increase:String?=null

    @Column(name = "approach_attitude2_weight_bonus")
    var ap_at2_w_bonus:String?=null

    @Column(name = "approach_attitude3_item")
    var ap_at3_item:String?=null

    @Column(name = "approach_attitude3_evaluation_points")
    var ap_at3_e_points:String?=null

    @Column(name = "approach_attitude3_weight_salary_increase")
    var ap_at3_w_s_increase:String?=null

    @Column(name = "approach_attitude3_weight_bonus")
    var ap_at3_w_bonus:String?=null

    @Column(name = "approach_attitude4_item")
    var ap_at4_item:String?=null

    @Column(name = "approach_attitude4_evaluation_points")
    var ap_at4_e_points:String?=null

    @Column(name = "approach_attitude4_weight_salary_increase")
    var ap_at4_w_s_increase:String?=null

    @Column(name = "approach_attitude4_weight_bonus")
    var ap_at4_w_bonus:String?=null
}