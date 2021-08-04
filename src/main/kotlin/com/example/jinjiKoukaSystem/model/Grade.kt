package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_each_grade_appraisal_pattern")
class Grade{

    @Id
    @Column(name = "appraisal_pattern")
    var appraisal_pattern: String? = null

    @Column(name = "officer")
    var officer: String? = null

    @Column(name = "grade")
    var grade: String? = null

    @Column(name = "grade1_item")
    var grade1_item: String? = null

    @Column(name = "grade1_evaluation_points")
    var grade1_evaluation_points: String? = null

    @Column(name = "grade1_weight_salary_increase")
    var grade1_weight_salary_increase: String? = null

    @Column(name = "grade1_weight_bonus")
    var grade1_weight_bonus: String? = null

    @Column(name = "grade2_item")
    var grade2_item: String? = null

    @Column(name = "grade2_evaluation_points")
    var grade2_evaluation_points: String? = null

    @Column(name = "grade2_weight_salary_increase")
    var grade2_weight_salary_increase: String? = null

    @Column(name = "grade2_weight_bonus")
    var grade2_weight_bonus: String? = null

    @Column(name = "grade3_item")
    var grade3_item: String? = null

    @Column(name = "grade3_evaluation_points")
    var grade3_evaluation_points: String? = null

    @Column(name = "grade3_weight_salary_increase")
    var grade3_weight_salary_increase: String? = null

    @Column(name = "grade3_weight_bonus")
    var grade3_weight_bonus: String? = null

    @Column(name = "grade4_item")
    var grade4_item: String? = null


    @Column(name = "grade4_evaluation_points")
    var grade4_evaluation_points: String? = null

    @Column(name = "grade4_weight_salary_increase")
    var grade4_weight_salary_increase: String? = null

    @Column(name = "grade4_weight_bonus")
    var grade4_weight_bonus: String? = null

    @Column(name = "grade5_item")
    var grade5_item: String? = null

    @Column(name = "grade5_evaluation_points")
    var grade5_evaluation_points: String? = null

    @Column(name = "grade5_weight_salary_increase")
    var grade5_weight_salary_increase: String? = null

    @Column(name = "grade5_weight_bonus")
    var grade5_weight_bonus: String? = null

    @Column(name = "ability1_item")
    var ability1_item: String? = null

    @Column(name = "ability1_evaluation_points")
    var ability1_evaluation_points: String? = null

    @Column(name = "ability1_weight_salary_increase")
    var ability1_weight_salary_increase: String? = null

    @Column(name = "ability1_weight_bonus")
    var ability1_weight_bonus: String? = null

    @Column(name = "ability2_item")
    var ability2_item: String? = null

    @Column(name = "ability2_evaluation_points")
    var ability2_evaluation_points: String? = null

    @Column(name = "ability2_weight_salary_increase")
    var ability2_weight_salary_increase: String? = null

    @Column(name = "ability2_weight_bonus")
    var ability2_weight_bonus: String? = null

    @Column(name = "ability3_item")
    var ability3_item: String? = null

    @Column(name = "ability3_evaluation_points")
    var ability3_evaluation_points: String? = null

    @Column(name = "ability3_weight_salary_increase")
    var ability3_weight_salary_increase: String? = null

    @Column(name = "ability3_weight_bonus")
    var ability3_weight_bonus: String? = null

    @Column(name = "ability4_item")
    var ability4_item: String? = null

    @Column(name = "ability4_evaluation_points")
    var ability4_evaluation_points: String? = null

    @Column(name = "ability4_weight_salary_increase")
    var ability4_weight_salary_increase: String? = null

    @Column(name = "ability4_weight_bonus")
    var ability4_weight_bonus: String? = null

    @Column(name = "approach_attitude1_item")
    var approach_attitude1_item: String? = null

    @Column(name = "approach_attitude1_evaluation_points")
    var approach_attitude1_evaluation_points: String? = null

    @Column(name = "approach_attitude1_weight_salary_increase")
    var approach_attitude1_weight_salary_increase: String? = null

    @Column(name = "approach_attitude1_weight_bonus")
    var approach_attitude1_weight_bonus: String? = null

    @Column(name = "approach_attitude2_item")
    var approach_attitude2_item: String? = null

    @Column(name = "approach_attitude2_evaluation_points")
    var approach_attitude2_evaluation_points: String? = null

    @Column(name = "approach_attitude2_weight_salary_increase")
    var approach_attitude2_weight_salary_increase: String? = null

    @Column(name = "approach_attitude2_weight_bonus")
    var approach_attitude2_weight_bonus: String? = null

    @Column(name = "approach_attitude3_item")
    var approach_attitude3_item: String? = null

    @Column(name = "approach_attitude3_evaluation_points")
    var approach_attitude3_evaluation_points: String? = null

    @Column(name = "approach_attitude3_weight_salary_increase")
    var approach_attitude3_weight_salary_increase: String? = null

    @Column(name = "approach_attitude3_weight_bonus")
    var approach_attitude3_weight_bonus: String? = null

    @Column(name = "approach_attitude4_item")
    var approach_attitude4_item: String? = null

    @Column(name = "approach_attitude4_evaluation_points")
    var approach_attitude4_evaluation_points: String? = null

    @Column(name = "approach_attitude4_weight_salary_increase")
    var approach_attitude4_weight_salary_increase: String? = null

    @Column(name = "approach_attitude4_weight_bonus")
    var approach_attitude4_weight_bonus: String? = null

    fun getAppraisalPattern(): String? {
        return appraisal_pattern
    }

    fun setAppraisalPattern(appraisal_pattern: String?) {
        this.appraisal_pattern = appraisal_pattern
    }

    constructor(
        appraisal_pattern: String?
                 ,officer: String?
                 ,grade: String?
                 ,grade1_item: String?
                 ,grade1_evaluation_points: String?
                 ,grade1_weight_salary_increase: String?
                 ,grade1_weight_bonus: String?
                 ,grade2_item: String?
                 ,grade2_evaluation_points: String?
                 ,grade2_weight_salary_increase: String?
                 ,grade2_weight_bonus: String?
                 ,grade3_item: String?
                 ,grade3_evaluation_points: String?
                 ,grade3_weight_salary_increase: String?
                 ,grade3_weight_bonus: String?
                 ,grade4_item: String?
                 ,grade4_evaluation_points: String?
                 ,grade4_weight_salary_increase: String?
                 ,grade4_weight_bonus: String?
                 ,grade5_item: String?
                 ,grade5_evaluation_points: String?
                 ,grade5_weight_salary_increase: String?
                 ,grade5_weight_bonus: String?
                 ,ability1_item: String?
                 ,ability1_evaluation_points: String?
                 ,ability1_weight_salary_increase: String?
                 ,ability1_weight_bonus: String?
                 ,ability2_item: String?
                 ,ability2_evaluation_points: String?
                 ,ability2_weight_salary_increase: String?
                 ,ability2_weight_bonus: String?
                 ,ability3_item: String?
                 ,ability3_evaluation_points: String?
                 ,ability3_weight_salary_increase: String?
                 ,ability3_weight_bonus: String?
                 ,ability4_item: String?
                 ,ability4_evaluation_points: String?
                 ,ability4_weight_salary_increase: String?
                 ,ability4_weight_bonus: String?
                 ,approach_attitude1_item: String?
                 ,approach_attitude1_evaluation_points: String?
                 ,approach_attitude1_weight_salary_increase: String?
                 ,approach_attitude1_weight_bonus: String?
                 ,approach_attitude2_item: String?
                 ,approach_attitude2_evaluation_points: String?
                 ,approach_attitude2_weight_salary_increase: String?
                 ,approach_attitude2_weight_bonus: String?
                 ,approach_attitude3_item: String?
                 ,approach_attitude3_evaluation_points: String?
                 ,approach_attitude3_weight_salary_increase: String?
                 ,approach_attitude3_weight_bonus: String?
                 ,approach_attitude4_item: String?
                 ,approach_attitude4_evaluation_points: String?
                 ,approach_attitude4_weight_salary_increase: String?
                 ,approach_attitude4_weight_bonus: String? ): super() {

            this.appraisal_pattern =appraisal_pattern
            this.officer = officer
            this.grade = grade
            this.grade1_item = grade1_item
            this.grade1_evaluation_points = grade1_evaluation_points
            this.grade1_weight_salary_increase = grade1_weight_salary_increase
            this.grade1_weight_bonus = grade1_weight_bonus
        this.grade2_item = grade2_item
        this.grade2_evaluation_points  = grade2_evaluation_points
        this.grade2_weight_salary_increase = grade2_weight_salary_increase
        this.grade2_weight_bonus = grade2_weight_bonus
        this.grade3_item = grade3_item
        this.grade3_evaluation_points = grade3_evaluation_points
        this.grade3_weight_salary_increase = grade3_weight_salary_increase
        this.grade3_weight_bonus = grade3_weight_bonus
        this.grade4_item = grade4_item
        this.grade4_evaluation_points =  grade4_evaluation_points
        this.grade4_weight_salary_increase  = grade4_weight_salary_increase
        this.grade4_weight_bonus = grade4_weight_bonus
        this.grade5_item = grade5_item
        this.grade5_evaluation_points = grade5_evaluation_points
        this.grade5_weight_salary_increase = grade5_weight_salary_increase
        this.grade5_weight_bonus = grade5_weight_bonus
        this.ability1_item = ability1_item
        this.ability1_evaluation_points = ability1_evaluation_points
        this.ability1_weight_salary_increase = ability1_weight_salary_increase
        this.ability1_weight_bonus = ability1_weight_bonus
        this.ability2_item = ability2_item
        this.ability2_evaluation_points = ability2_evaluation_points
        this.ability2_weight_salary_increase = ability2_weight_salary_increase
        this.ability2_weight_bonus = ability2_weight_bonus
        this.ability3_item = ability3_item
        this.ability3_evaluation_points = ability3_evaluation_points
        this.ability3_weight_salary_increase = ability3_weight_salary_increase
        this.ability3_weight_bonus = ability3_weight_bonus
        this.ability4_item = ability4_item
        this.ability4_evaluation_points = ability4_evaluation_points
        this.ability4_weight_salary_increase = ability4_weight_salary_increase
        this.ability4_weight_bonus = ability4_weight_bonus
        this.approach_attitude1_item = approach_attitude1_item
        this.approach_attitude1_evaluation_points = approach_attitude1_evaluation_points
        this.approach_attitude1_weight_salary_increase = approach_attitude1_weight_salary_increase
        this.approach_attitude1_weight_bonus = approach_attitude1_weight_bonus
        this.approach_attitude2_item = approach_attitude2_item
        this.approach_attitude2_evaluation_points = approach_attitude2_evaluation_points
        this.approach_attitude2_weight_salary_increase = approach_attitude2_weight_salary_increase
        this.approach_attitude2_weight_bonus = approach_attitude2_weight_bonus
        this.approach_attitude3_item = approach_attitude3_item
        this.approach_attitude3_evaluation_points = approach_attitude3_evaluation_points
        this.approach_attitude3_weight_salary_increase = approach_attitude3_weight_salary_increase
        this.approach_attitude3_weight_bonus = approach_attitude3_weight_bonus
        this.approach_attitude4_item = approach_attitude4_item
        this.approach_attitude4_evaluation_points = approach_attitude4_evaluation_points
        this.approach_attitude4_weight_salary_increase = approach_attitude4_weight_salary_increase
        this.approach_attitude4_weight_bonus = approach_attitude4_weight_bonus }


}

