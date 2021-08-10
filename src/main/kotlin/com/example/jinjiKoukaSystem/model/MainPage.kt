package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "p_appraisal_result_db")
class MainPage{

    @Id
    @Column(name = "id")
    var id: String? = null

    @Column(name = "belong")
    var belong: String? = null

    @Column(name = "officer")
    var officer: String? = null

    @Column(name = "grade")
    var grade: String? = null

    @Column(name = "name")
    var name: String? = null

    @Column(name = "evaluation_status")
    var evaluation_status: String? = null

    @Column(name = "secondary_evaluation_rank_bonus")
    var secondary_evaluation_rank_bonus: String? = null

    @Column(name = "primary_evaluation_rank_bonus")
    var primary_evaluation_rank_bonus: String? = null


    constructor()
    constructor(
        id: String?,
        belong: String?,
        officer: String?,
        grade: String?,
        name: String?,
        evaluation_status: String?,
        secondary_evaluation_rank_bonus: String?,
        primary_evaluation_rank_bonus: String?
    ) {
        this.id = id
        this.belong = belong
        this.officer = officer
        this.grade = grade
        this.name = name
        this.evaluation_status = evaluation_status
        this.secondary_evaluation_rank_bonus = secondary_evaluation_rank_bonus
        this.primary_evaluation_rank_bonus = primary_evaluation_rank_bonus
    }


}