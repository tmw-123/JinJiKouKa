package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_belongs")
class Belong{

    @Id
    @Column(name = "belong_cd")
    var belong_cd: Int? = null


    @Column(name = "belong_name")
    var belong_name: String? = null

    @Column(name = "display_data_status")
    var display_data_status : String? = null





    constructor(
        ): super() {

           }
}

