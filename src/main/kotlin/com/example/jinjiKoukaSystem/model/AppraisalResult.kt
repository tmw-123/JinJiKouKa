package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "p_appraisal_result_db")
class AppraisalResult{
    @Id
    @Column(name = "register_datetime")
    var register_datetime : String? = null

    @Column(name = "update_datetime")
    var update_datetime : String? = null

    @Column(name = "illegal_address_flg")
    var illegal_address_flg : String? = null

    @Column(name = "mobile_domain_flg")
    var mobile_domain_flg : String? = null

    @Column(name = "double_flg")
    var double_flg : String? = null

    @Column(name = "deliver_err_count")
    var deliver_err_count : String? = null

    @Column(name = "user_ip_address")
    var user_ip_address : String? = null

    @Column(name = "user_agent")
    var user_agent : String? = null

    @Column(name = "update_delete_key")
    var update_delete_key : String? = null

    @Column(name = "belong")
    var belong : String? = null

    @Column(name = "officer")
    var officer : String? = null

    @Column(name = "grade")
    var grade : String? = null

    @Column(name = "name")
    var name : String? = null

    @Column(name = "personal_appraisal_name")
    var personal_appraisal_name : String? = null

    @Column(name = "evaluation_status")
    var evaluation_status : String? = null

    @Column(name = "self_evaluation_id")
    var self_evaluation_id : String? = null

    @Column(name = "primary_evaluation_id")
    var primary_evaluation_id : String? = null

    @Column(name = "secondary_evaluation_id")
    var secondary_evaluation_id : String? = null

    @Column(name = "primary_secondary_evaluation_id")
    var primary_secondary_evaluation_id : String? = null

    @Column(name = "self_evaluation_flg")
    var self_evaluation_flg : String? = null

    @Column(name = "self_evaluation_rank")
    var self_evaluation_rank : String? = null

    @Column(name = "self_evaluation_total_score")
    var self_evaluation_total_score : Long? = null

    @Column(name = "self_evaluation_rank_bonus")
    var self_evaluation_rank_bonus : String? = null

    @Column(name = "self_evaluation_total_score_bonus")
    var self_evaluation_total_score_bonus : Long? = null

    @Column(name = "primary_evaluation_rank")
    var primary_evaluation_rank : String? = null

    @Column(name = "primary_evaluation_total_score")
    var primary_evaluation_total_score : Long? = null

    @Column(name = "primary_evaluation_rank_bonus")
    var primary_evaluation_rank_bonus : String? = null

    @Column(name = "primary_evaluation_total_score_bonus")
    var primary_evaluation_total_score_bonus : Long? = null

    @Column(name = "primary_evaluator_entry_field")
    var primary_evaluator_entry_field : Long? = null

    @Column(name = "primary_evaluator_entry_date")
    var primary_evaluator_entry_date : String? = null

    @Column(name = "secondary_evaluation_rank")
    var secondary_evaluation_rank : String? = null

    @Column(name = "secondary_evaluation_total_score")
    var secondary_evaluation_total_score : Long? = null

    @Column(name = "secondary_evaluation_rank_bonus")
    var secondary_evaluation_rank_bonus : String? = null

    @Column(name = "secondary_evaluation_total_score_bonus")
    var secondary_evaluation_total_score_bonus : Long? = null

    @Column(name = "secondary_evaluator_entry_field")
    var secondary_evaluator_entry_field : Long? = null

    @Column(name = "secondary_evaluator_entry_date")
    var secondary_evaluator_entry_date : String? = null

    @Column(name = "depart_adjust_rank")
    var depart_adjust_rank : String? = null

    @Column(name = "depart_adjust_total_score")
    var depart_adjust_total_score : Long? = null

    @Column(name = "depart_adjust_rank_bonus")
    var depart_adjust_rank_bonus : String? = null

    @Column(name = "depart_adjust_total_score_bonus")
    var depart_adjust_total_score_bonus : Long? = null

    @Column(name = "grade1_item")
    var grade1_item : String? = null

    @Column(name = "grade1_evaluation_points")
    var grade1_evaluation_points : Long? = null

    @Column(name = "grade1_weight_salary_increase")
    var grade1_weight_salary_increase : String? = null

    @Column(name = "grade1_weight_bonus")
    var grade1_weight_bonus : String? = null

    @Column(name = "grade1_self_evaluation_points")
    var grade1_self_evaluation_points : String? = null

    @Column(name = "grade1_primary_evaluation_points")
    var grade1_primary_evaluation_points : String? = null

    @Column(name = "grade1_secondary_evaluation_points")
    var grade1_secondary_evaluation_points : String? = null

    @Column(name = "grade1_depart_adjust_points")
    var grade1_depart_adjust_points : String? = null

    @Column(name = "grade2_item")
    var grade2_item : String? = null

    @Column(name = "grade2_evaluation_points")
    var grade2_evaluation_points : Long? = null

    @Column(name = "grade2_weight_salary_increase")
    var grade2_weight_salary_increase : String? = null

    @Column(name = "grade2_weight_bonus")
    var grade2_weight_bonus : String? = null

    @Column(name = "grade2_self_evaluation_points")
    var grade2_self_evaluation_points : String? = null

    @Column(name = "grade2_primary_evaluation_points")
    var grade2_primary_evaluation_points : String? = null

    @Column(name = "grade2_secondary_evaluation_points")
    var grade2_secondary_evaluation_points : String? = null

    @Column(name = "grade2_depart_adjust_points")
    var grade2_depart_adjust_points : String? = null

    @Column(name = "grade3_item")
    var grade3_item : String? = null

    @Column(name = "grade3_evaluation_points")
    var grade3_evaluation_points : Long? = null

    @Column(name = "grade3_weight_salary_increase")
    var grade3_weight_salary_increase : String? = null

    @Column(name = "grade3_weight_bonus")
    var grade3_weight_bonus : String? = null

    @Column(name = "grade3_self_evaluation_points")
    var grade3_self_evaluation_points : String? = null

    @Column(name = "grade3_primary_evaluation_points")
    var grade3_primary_evaluation_points : String? = null

    @Column(name = "grade3_secondary_evaluation_points")
    var grade3_secondary_evaluation_points : String? = null

    @Column(name = "grade3_depart_adjust_points")
    var grade3_depart_adjust_points : String? = null

    @Column(name = "grade4_item")
    var grade4_item : String? = null

    @Column(name = "grade4_evaluation_points")
    var grade4_evaluation_points : Long? = null

    @Column(name = "grade4_weight_salary_increase")
    var grade4_weight_salary_increase : String? = null

    @Column(name = "grade4_weight_bonus")
    var grade4_weight_bonus : String? = null

    @Column(name = "grade4_self_evaluation_points")
    var grade4_self_evaluation_points : String? = null

    @Column(name = "grade4_primary_evaluation_points")
    var grade4_primary_evaluation_points : String? = null

    @Column(name = "grade4_secondary_evaluation_points")
    var grade4_secondary_evaluation_points : String? = null

    @Column(name = "grade4_depart_adjust_points")
    var grade4_depart_adjust_points : String? = null

    @Column(name = "grade5_item")
    var grade5_item : String? = null

    @Column(name = "grade5_evaluation_points")
    var grade5_evaluation_points : Long? = null

    @Column(name = "grade5_weight_salary_increase")
    var grade5_weight_salary_increase : String? = null

    @Column(name = "grade5_weight_bonus")
    var grade5_weight_bonus : Long? = null

    @Column(name = "grade5_self_evaluation_points")
    var grade5_self_evaluation_points : String? = null


    @Column(name = "grade5_primary_evaluation_points")
    var grade5_primary_evaluation_points : String? = null

    @Column(name = "grade5_secondary_evaluation_points")
    var grade5_secondary_evaluation_points : String? = null

    @Column(name = "grade5_depart_adjust_points")
    var grade5_depart_adjust_points : String? = null

    @Column(name = "ability1_item")
    var ability1_item : String? = null

    @Column(name = "ability1_evaluation_points")
    var ability1_evaluation_points : Long? = null

    @Column(name = "ability1_weight_salary_increase")
    var ability1_weight_salary_increase : String? = null

    @Column(name = "ability1_weight_bonus")
    var ability1_weight_bonus : String? = null

    @Column(name = "ability1_self_evaluation_points")
    var ability1_self_evaluation_points : String? = null

    @Column(name = "ability1_primary_evaluation_points")
    var ability1_primary_evaluation_points : String? = null

    @Column(name = "ability1_secondary_evaluation_points")
    var ability1_secondary_evaluation_points : String? = null

    @Column(name = "ability1_depart_adjust_points")
    var ability1_depart_adjust_points : String? = null

    @Column(name = "ability2_item")
    var ability2_item : String? = null

    @Column(name = "ability2_evaluation_points")
    var ability2_evaluation_points : Long? = null

    @Column(name = "ability2_weight_salary_increase")
    var ability2_weight_salary_increase : String? = null

    @Column(name = "ability2_weight_bonus")
    var ability2_weight_bonus : String? = null

    @Column(name = "ability2_self_evaluation_points")
    var ability2_self_evaluation_points : String? = null

    @Column(name = "ability2_primary_evaluation_points")
    var ability2_primary_evaluation_points : String? = null

    @Column(name = "ability2_secondary_evaluation_points")
    var ability2_secondary_evaluation_points : String? = null

    @Column(name = "ability2_depart_adjust_points")
    var ability2_depart_adjust_points : String? = null

    @Column(name = "ability3_item")
    var ability3_item : String? = null

    @Column(name = "ability3_evaluation_points")
    var ability3_evaluation_points : Long? = null

    @Column(name = "ability3_weight_salary_increase")
    var ability3_weight_salary_increase : String? = null

    @Column(name = "ability3_weight_bonus")
    var ability3_weight_bonus : String? = null

    @Column(name = "ability3_self_evaluation_points")
    var ability3_self_evaluation_points : String? = null

    @Column(name = "ability3_primary_evaluation_points")
    var ability3_primary_evaluation_points : String? = null

    @Column(name = "ability3_secondary_evaluation_points")
    var ability3_secondary_evaluation_points : String? = null

    @Column(name = "ability3_depart_adjust_points")
    var ability3_depart_adjust_points : String? = null

    @Column(name = "ability4_item")
    var ability4_item : String? = null

    @Column(name = "ability4_evaluation_points")
    var ability4_evaluation_points : Long? = null

    @Column(name = "ability4_weight_salary_increase")
    var ability4_weight_salary_increase : String? = null

    @Column(name = "ability4_weight_bonus")
    var ability4_weight_bonus : String? = null

    @Column(name = "ability4_self_evaluation_points")
    var ability4_self_evaluation_points : String? = null

    @Column(name = "ability4_primary_evaluation_points")
    var ability4_primary_evaluation_points : String? = null

    @Column(name = "ability4_secondary_evaluation_points")
    var ability4_secondary_evaluation_points : String? = null

    @Column(name = "ability4_depart_adjust_points")
    var ability4_depart_adjust_points : String? = null

    @Column(name = "approach_attitude1_item")
    var approach_attitude1_item : String? = null

    @Column(name = "approach_attitude1_evaluation_points")
    var approach_attitude1_evaluation_points : Long? = null

    @Column(name = "approach_attitude1_weight_salary_increase")
    var approach_attitude1_weight_salary_increase : String? = null

    @Column(name = "approach_attitude1_weight_bonus")
    var approach_attitude1_weight_bonus : String? = null

    @Column(name = "approach_attitude1_self_evaluation_points")
    var approach_attitude1_self_evaluation_points : String? = null

    @Column(name = "approach_attitude1_primary_evaluation_points")
    var approach_attitude1_primary_evaluation_points : String? = null

    @Column(name = "approach_attitude1_secondary_evaluation_points")
    var approach_attitude1_secondary_evaluation_points : String? = null

    @Column(name = "approach_attitude1_depart_adjust_points")
    var approach_attitude1_depart_adjust_points : String? = null

    @Column(name = "approach_attitude2_item")
    var approach_attitude2_item : String? = null

    @Column(name = "approach_attitude2_evaluation_points")
    var approach_attitude2_evaluation_points : Long? = null

    @Column(name = "approach_attitude2_weight_salary_increase")
    var approach_attitude2_weight_salary_increase : String? = null

    @Column(name = "approach_attitude2_weight_bonus")
    var approach_attitude2_weight_bonus : String? = null

    @Column(name = "approach_attitude2_self_evaluation_points")
    var approach_attitude2_self_evaluation_points : String? = null

    @Column(name = "approach_attitude2_primary_evaluation_points")
    var approach_attitude2_primary_evaluation_points : String? = null

    @Column(name = "approach_attitude2_secondary_evaluation_points")
    var approach_attitude2_secondary_evaluation_points : String? = null

    @Column(name = "approach_attitude2_depart_adjust_points")
    var approach_attitude2_depart_adjust_points : String? = null

    @Column(name = "approach_attitude3_item")
    var approach_attitude3_item : String? = null

    @Column(name = "approach_attitude3_evaluation_points")
    var approach_attitude3_evaluation_points : Long? = null

    @Column(name = "approach_attitude3_weight_salary_increase")
    var approach_attitude3_weight_salary_increase : String? = null

    @Column(name = "approach_attitude3_weight_bonus")
    var approach_attitude3_weight_bonus : String? = null

    @Column(name = "approach_attitude3_self_evaluation_points")
    var approach_attitude3_self_evaluation_points : String? = null

    @Column(name = "approach_attitude3_primary_evaluation_points")
    var approach_attitude3_primary_evaluation_points : String? = null

    @Column(name = "approach_attitude3_secondary_evaluation_points")
    var approach_attitude3_secondary_evaluation_points : String? = null

    @Column(name = "approach_attitude3_depart_adjust_points")
    var approach_attitude3_depart_adjust_points : String? = null

    @Column(name = "approach_attitude4_item")
    var approach_attitude4_item : String? = null

    @Column(name = "approach_attitude4_evaluation_points")
    var approach_attitude4_evaluation_points : Long? = null

    @Column(name = "approach_attitude4_weight_salary_increase")
    var approach_attitude4_weight_salary_increase : String? = null

    @Column(name = "approach_attitude4_weight_bonus")
    var approach_attitude4_weight_bonus : String? = null

    @Column(name = "approach_attitude4_self_evaluation_points")
    var approach_attitude4_self_evaluation_points : String? = null

    @Column(name = "approach_attitude4_primary_evaluation_points")
    var approach_attitude4_primary_evaluation_points : String? = null

    @Column(name = "approach_attitude4_secondary_evaluation_points")
    var approach_attitude4_secondary_evaluation_points : String? = null

    @Column(name = "approach_attitude4_depart_adjust_points")
    var approach_attitude4_depart_adjust_points : String? = null

    @Column(name = "primary_secondary_evaluation_flg")
    var primary_secondary_evaluation_flg : String? = null

    @Column(name = "evaluation_update_flg")
    var evaluation_update_flg : String? = null

    constructor(
        register_datetime : String? = null
        ,update_datetime : String? = null
        ,illegal_address_flg : String? = null
        ,mobile_domain_flg : String? = null
        ,double_flg : String? = null
        ,deliver_err_count : String? = null
        ,user_ip_address : String? = null
        ,user_agent : String? = null
        ,update_delete_key : String? = null
        ,belong : String? = null
        ,officer : String? = null
        ,grade : String? = null
        ,name : String? = null
        ,personal_appraisal_name : String? = null
        ,evaluation_status : String? = null
        ,self_evaluation_id : String? = null
        ,primary_evaluation_id : String? = null
        ,secondary_evaluation_id : String? = null
        ,primary_secondary_evaluation_id : String? = null
        ,self_evaluation_flg : String? = null
        ,self_evaluation_rank : String? = null
        ,self_evaluation_total_score : Long? = null
        ,self_evaluation_rank_bonus : String? = null
        ,self_evaluation_total_score_bonus : Long? = null
        ,primary_evaluation_rank : String? = null
        ,primary_evaluation_total_score : Long? = null
        ,primary_evaluation_rank_bonus : String? = null
        ,primary_evaluation_total_score_bonus : Long? = null
        ,primary_evaluator_entry_field : Long? = null
        ,primary_evaluator_entry_date : String? = null
    ,secondary_evaluation_rank : String? = null
    ,secondary_evaluation_total_score : Long? = null
    ,secondary_evaluation_rank_bonus : String? = null
    ,secondary_evaluation_total_score_bonus : Long? = null
    ,secondary_evaluator_entry_field : Long? = null
    ,secondary_evaluator_entry_date : String? = null
    ,depart_adjust_rank : String? = null
    ,depart_adjust_total_score : Long? = null
    ,depart_adjust_rank_bonus : String? = null
    ,depart_adjust_total_score_bonus : Long? = null
    ,grade1_item : String? = null
    ,grade1_evaluation_points : Long? = null
    ,grade1_weight_salary_increase : String? = null
    ,grade1_weight_bonus : String? = null
    ,grade1_self_evaluation_points : String? = null
    ,grade1_primary_evaluation_points : String? = null
    ,grade1_secondary_evaluation_points : String? = null
    ,grade1_depart_adjust_points : String? = null
    ,grade2_item : String? = null
    ,grade2_evaluation_points : Long? = null
    ,grade2_weight_salary_increase : String? = null
    ,grade2_weight_bonus : String? = null
    ,grade2_self_evaluation_points : String? = null
    ,grade2_primary_evaluation_points : String? = null
    ,grade2_secondary_evaluation_points : String? = null
    ,grade2_depart_adjust_points : String? = null
    ,grade3_item : String? = null
    ,grade3_evaluation_points : Long? = null
    ,grade3_weight_salary_increase : String? = null
    ,grade3_weight_bonus : String? = null
    ,grade3_self_evaluation_points : String? = null
    ,grade3_primary_evaluation_points : String? = null
    ,grade3_secondary_evaluation_points : String? = null
    ,grade3_depart_adjust_points : String? = null
    ,grade4_item : String? = null
    ,grade4_evaluation_points : Long? = null
    ,grade4_weight_salary_increase : String? = null
    ,grade4_weight_bonus : String? = null
    ,grade4_self_evaluation_points : String? = null
    ,grade4_primary_evaluation_points : String? = null
    ,grade4_secondary_evaluation_points : String? = null
    ,grade4_depart_adjust_points : String? = null
    ,grade5_item : String? = null
    ,grade5_evaluation_points : Long? = null
    ,grade5_weight_salary_increase : String? = null
    ,grade5_weight_bonus : Long? = null
    ,grade5_self_evaluation_points : String? = null
    ,grade5_primary_evaluation_points : String? = null
    ,grade5_secondary_evaluation_points : String? = null
    ,grade5_depart_adjust_points : String? = null
    ,ability1_item : String? = null
    ,ability1_evaluation_points : Long? = null
    ,ability1_weight_salary_increase : String? = null
    ,ability1_weight_bonus : String? = null
    ,ability1_self_evaluation_points : String? = null
    ,ability1_primary_evaluation_points : String? = null
    ,ability1_secondary_evaluation_points : String? = null
    ,ability1_depart_adjust_points : String? = null
    ,ability2_item : String? = null
    ,ability2_evaluation_points : Long? = null
    ,ability2_weight_salary_increase : String? = null
    ,ability2_weight_bonus : String? = null
    ,ability2_self_evaluation_points : String? = null
    ,ability2_primary_evaluation_points : String? = null
    ,ability2_secondary_evaluation_points : String? = null
    ,ability2_depart_adjust_points : String? = null
    ,ability3_item : String? = null
    ,ability3_evaluation_points : Long? = null
    ,ability3_weight_salary_increase : String? = null
    ,ability3_weight_bonus : String? = null
    ,ability3_self_evaluation_points : String? = null
    ,ability3_primary_evaluation_points : String? = null
    ,ability3_secondary_evaluation_points : String? = null
    ,ability3_depart_adjust_points : String? = null
    ,ability4_item : String? = null
    ,ability4_evaluation_points : Long? = null
    ,ability4_weight_salary_increase : String? = null
    ,ability4_weight_bonus : String? = null
    ,ability4_self_evaluation_points : String? = null
    ,ability4_primary_evaluation_points : String? = null
    ,ability4_secondary_evaluation_points : String? = null
    ,ability4_depart_adjust_points : String? = null
    ,approach_attitude1_item : String? = null
    ,approach_attitude1_evaluation_points : Long? = null
    ,approach_attitude1_weight_salary_increase : String? = null
    ,approach_attitude1_weight_bonus : String? = null
    ,approach_attitude1_self_evaluation_points : String? = null
    ,approach_attitude1_primary_evaluation_points : String? = null
    ,approach_attitude1_secondary_evaluation_points : String? = null
    ,approach_attitude1_depart_adjust_points : String? = null
    ,approach_attitude2_item : String? = null
    ,approach_attitude2_evaluation_points : Long? = null
    ,approach_attitude2_weight_salary_increase : String? = null
    ,approach_attitude2_weight_bonus : String? = null
    ,approach_attitude2_self_evaluation_points : String? = null
    ,approach_attitude2_primary_evaluation_points : String? = null
    ,approach_attitude2_secondary_evaluation_points : String? = null
    ,approach_attitude2_depart_adjust_points : String? = null
    ,approach_attitude3_item : String? = null
    ,approach_attitude3_evaluation_points : Long? = null
    ,approach_attitude3_weight_salary_increase : String? = null
    ,approach_attitude3_weight_bonus : String? = null
    ,approach_attitude3_self_evaluation_points : String? = null
    ,approach_attitude3_primary_evaluation_points : String? = null
    ,approach_attitude3_secondary_evaluation_points : String? = null
    ,approach_attitude3_depart_adjust_points : String? = null
    ,approach_attitude4_item : String? = null
    ,approach_attitude4_evaluation_points : Long? = null
    ,approach_attitude4_weight_salary_increase : String? = null
    ,approach_attitude4_weight_bonus : String? = null
    ,approach_attitude4_self_evaluation_points : String? = null
    ,approach_attitude4_primary_evaluation_points : String? = null
    ,approach_attitude4_secondary_evaluation_points : String? = null
    ,approach_attitude4_depart_adjust_points : String? = null
    ,primary_secondary_evaluation_flg : String? = null
    ,evaluation_update_flg : String? = null
        ): super() {
        this.register_datetime = register_datetime
            this.update_datetime  = update_datetime
            this.illegal_address_flg  = illegal_address_flg
            this.mobile_domain_flg  = mobile_domain_flg
            this.double_flg  = double_flg
            this.deliver_err_count  = deliver_err_count
            this.user_ip_address  = user_ip_address
            this.user_agent  = user_agent
            this.update_delete_key  = update_delete_key
            this.belong  = belong
            this.officer  = officer
            this.grade  = grade
            this.name  = name
            this.personal_appraisal_name  = personal_appraisal_name
            this.evaluation_status  = evaluation_status
            this.self_evaluation_id  = self_evaluation_id
            this.primary_evaluation_id  = primary_evaluation_id
            this.secondary_evaluation_id  = secondary_evaluation_id
            this.primary_secondary_evaluation_id  = primary_secondary_evaluation_id
            this.self_evaluation_flg  = self_evaluation_flg
            this.self_evaluation_rank  = self_evaluation_rank
            this.self_evaluation_total_score  = self_evaluation_total_score
            this.self_evaluation_rank_bonus  = self_evaluation_rank_bonus
            this.self_evaluation_total_score_bonus  = self_evaluation_total_score_bonus
            this.primary_evaluation_rank  = primary_evaluation_rank
            this.primary_evaluation_total_score  = primary_evaluation_total_score
            this.primary_evaluation_rank_bonus  = primary_evaluation_rank_bonus
            this.primary_evaluation_total_score_bonus  = primary_evaluation_total_score_bonus
            this.primary_evaluator_entry_field  = primary_evaluator_entry_field
            this.primary_evaluator_entry_date  = primary_evaluator_entry_date
            this.secondary_evaluation_rank  = secondary_evaluation_rank
            this.secondary_evaluation_total_score  = secondary_evaluation_total_score
            this.secondary_evaluation_rank_bonus  = secondary_evaluation_rank_bonus
            this.secondary_evaluation_total_score_bonus  = secondary_evaluation_total_score_bonus
            this.secondary_evaluator_entry_field  = secondary_evaluator_entry_field
            this.secondary_evaluator_entry_date  = secondary_evaluator_entry_date
            this.depart_adjust_rank  = depart_adjust_rank
            this.depart_adjust_total_score  = depart_adjust_total_score
            this.depart_adjust_rank_bonus  = depart_adjust_rank_bonus
            this.depart_adjust_total_score_bonus  = depart_adjust_total_score_bonus
            this.grade1_item  = grade1_item
            this.grade1_evaluation_points  = grade1_evaluation_points
            this.grade1_weight_salary_increase  = grade1_weight_salary_increase
            this.grade1_weight_bonus  = grade1_weight_bonus
            this.grade1_self_evaluation_points  = grade1_self_evaluation_points
            this.grade1_primary_evaluation_points  = grade1_primary_evaluation_points
            this.grade1_secondary_evaluation_points  = grade1_secondary_evaluation_points
            this.grade1_depart_adjust_points  = grade1_depart_adjust_points
            this.grade2_item  = grade2_item
            this.grade2_evaluation_points  = grade2_evaluation_points
            this.grade2_weight_salary_increase  = grade2_weight_salary_increase
            this.grade2_weight_bonus  = grade2_weight_bonus
            this.grade2_self_evaluation_points  = grade2_self_evaluation_points
            this.grade2_primary_evaluation_points  = grade2_primary_evaluation_points
            this.grade2_secondary_evaluation_points  = grade2_secondary_evaluation_points
            this.grade2_depart_adjust_points  = grade2_depart_adjust_points
            this.grade3_item  = grade3_item
            this.grade3_evaluation_points  = grade3_evaluation_points
            this.grade3_weight_salary_increase  = grade3_weight_salary_increase
            this.grade3_weight_bonus  = grade3_weight_bonus
            this.grade3_self_evaluation_points  = grade3_self_evaluation_points
            this.grade3_primary_evaluation_points  = grade3_primary_evaluation_points
            this.grade3_secondary_evaluation_points  = grade3_secondary_evaluation_points
            this.grade3_depart_adjust_points  = grade3_depart_adjust_points
            this.grade4_item  = grade4_item
            this.grade4_evaluation_points  = grade4_evaluation_points
            this.grade4_weight_salary_increase  = grade4_weight_salary_increase
            this.grade4_weight_bonus  = grade4_weight_bonus
            this.grade4_self_evaluation_points  = grade4_self_evaluation_points
            this.grade4_primary_evaluation_points  = grade4_primary_evaluation_points
            this.grade4_secondary_evaluation_points  = grade4_secondary_evaluation_points
            this.grade4_depart_adjust_points  = grade4_depart_adjust_points
            this.grade5_item  = grade5_item
            this.grade5_evaluation_points  = grade5_evaluation_points
            this.grade5_weight_salary_increase  = grade5_weight_salary_increase
            this.grade5_weight_bonus  = grade5_weight_bonus
            this.grade5_self_evaluation_points  = grade5_self_evaluation_points
            this.grade5_primary_evaluation_points  = grade5_primary_evaluation_points
            this.grade5_secondary_evaluation_points  = grade5_secondary_evaluation_points
            this.grade5_depart_adjust_points  = grade5_depart_adjust_points
            this.ability1_item  = ability1_item
            this.ability1_evaluation_points  = ability1_evaluation_points
            this.ability1_weight_salary_increase  = ability1_weight_salary_increase
            this.ability1_weight_bonus  = ability1_weight_bonus
            this.ability1_self_evaluation_points  = ability1_self_evaluation_points
            this.ability1_primary_evaluation_points  = ability1_primary_evaluation_points
            this.ability1_secondary_evaluation_points  = ability1_secondary_evaluation_points
            this.ability1_depart_adjust_points  = ability1_depart_adjust_points
            this.ability2_item  = ability2_item
            this.ability2_evaluation_points  = ability2_evaluation_points
            this.ability2_weight_salary_increase  = ability2_weight_salary_increase
            this.ability2_weight_bonus  = ability2_weight_bonus
            this.ability2_self_evaluation_points  = ability2_self_evaluation_points
            this.ability2_primary_evaluation_points  = ability2_primary_evaluation_points
            this.ability2_secondary_evaluation_points  = ability2_secondary_evaluation_points
            this.ability2_depart_adjust_points  = ability2_depart_adjust_points
            this.ability3_item  = ability3_item
            this.ability3_evaluation_points  = ability3_evaluation_points
            this.ability3_weight_salary_increase  = ability3_weight_salary_increase
            this.ability3_weight_bonus  = ability3_weight_bonus
            this.ability3_self_evaluation_points  = ability3_self_evaluation_points
            this.ability3_primary_evaluation_points  = ability3_primary_evaluation_points
            this.ability3_secondary_evaluation_points  = ability3_secondary_evaluation_points
            this.ability3_depart_adjust_points  = ability3_depart_adjust_points
            this.ability4_item  = ability4_item
            this.ability4_evaluation_points  = ability4_evaluation_points
            this.ability4_weight_salary_increase  = ability4_weight_salary_increase
            this.ability4_weight_bonus  = ability4_weight_bonus
            this.ability4_self_evaluation_points  = ability4_self_evaluation_points
            this.ability4_primary_evaluation_points  = ability4_primary_evaluation_points
            this.ability4_secondary_evaluation_points  = ability4_secondary_evaluation_points
            this.ability4_depart_adjust_points  = ability4_depart_adjust_points
            this.approach_attitude1_item  = approach_attitude1_item
            this.approach_attitude1_evaluation_points  = approach_attitude1_evaluation_points
            this.approach_attitude1_weight_salary_increase  = approach_attitude1_weight_salary_increase
            this.approach_attitude1_weight_bonus  = approach_attitude1_weight_bonus
            this.approach_attitude1_self_evaluation_points  = approach_attitude1_self_evaluation_points
            this.approach_attitude1_primary_evaluation_points  = approach_attitude1_primary_evaluation_points
            this.approach_attitude1_secondary_evaluation_points  = approach_attitude1_secondary_evaluation_points
            this.approach_attitude1_depart_adjust_points  = approach_attitude1_depart_adjust_points
            this.approach_attitude2_item  = approach_attitude2_item
            this.approach_attitude2_evaluation_points  = approach_attitude2_evaluation_points
            this.approach_attitude2_weight_salary_increase  = approach_attitude2_weight_salary_increase
            this.approach_attitude2_weight_bonus  = approach_attitude2_weight_bonus
            this.approach_attitude2_self_evaluation_points  = approach_attitude2_self_evaluation_points
            this.approach_attitude2_primary_evaluation_points  = approach_attitude2_primary_evaluation_points
            this.approach_attitude2_secondary_evaluation_points  = approach_attitude2_secondary_evaluation_points
            this.approach_attitude2_depart_adjust_points  = approach_attitude2_depart_adjust_points
            this.approach_attitude3_item  = approach_attitude3_item
            this.approach_attitude3_evaluation_points  = approach_attitude3_evaluation_points
            this.approach_attitude3_weight_salary_increase  = approach_attitude3_weight_salary_increase
            this.approach_attitude3_weight_bonus  = approach_attitude3_weight_bonus
            this.approach_attitude3_self_evaluation_points  =  approach_attitude3_self_evaluation_points
            this.approach_attitude3_primary_evaluation_points  = approach_attitude3_primary_evaluation_points
            this.approach_attitude3_secondary_evaluation_points  = approach_attitude3_secondary_evaluation_points
            this.approach_attitude3_depart_adjust_points  = approach_attitude3_depart_adjust_points
            this.approach_attitude4_item  = approach_attitude4_item
            this.approach_attitude4_evaluation_points  = approach_attitude4_evaluation_points
            this.approach_attitude4_weight_salary_increase  = approach_attitude4_weight_salary_increase
            this.approach_attitude4_weight_bonus  = approach_attitude4_weight_bonus
            this.approach_attitude4_self_evaluation_points  = approach_attitude4_self_evaluation_points
            this.approach_attitude4_primary_evaluation_points  = approach_attitude4_primary_evaluation_points
            this.approach_attitude4_secondary_evaluation_points  = approach_attitude4_secondary_evaluation_points
            this.approach_attitude4_depart_adjust_points  = approach_attitude4_depart_adjust_points
            this.primary_secondary_evaluation_flg  = primary_secondary_evaluation_flg
            this.evaluation_update_flg  = evaluation_update_flg

    }
}

