package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_job")
class Job{


    @Id
    @Column(name = "job_cd")
    var job_cd: Int? = null

    @Column(name = "officer")
    var officer: String? = null


    constructor(
        job_cd : Int?
        ,officer : String?

        ): super() {
            this.job_cd = job_cd
            this.officer = officer
        }

}

