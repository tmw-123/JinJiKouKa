package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_personal_appraisal_name")
class AppraisalName{

    @Id
    @Column(name = "display_order")
    var display_order: Int? = null


    @Column(name = "appraisal_name")
    var appraisal_name: String? = null

    @Column(name = "personal_appraisal_name")
    var personal_appraisal_name: String? = null

    constructor(
        display_order : Int?
        ,appraisal_name : String?
        ,personal_appraisal_name : String?

        ): super() {
            this.display_order = display_order
            this.appraisal_name = appraisal_name
            this.personal_appraisal_name = personal_appraisal_name


        }
}

