package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.model.Base
import com.example.jinjiKoukaSystem.repository.AuthorizerRegistrationRepository
import com.example.jinjiKoukaSystem.repository.GradeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class AuthorizerRegistrationController {

    @Autowired
    private val authorizerRepository: AuthorizerRegistrationRepository? = null

    /*save all authorizer data in table*/
    @RequestMapping("/saveAuthorizerRegistration")
    fun saveAuthorizerRegistration(model: Model, @ModelAttribute authoReg: Base): String? {
        val newAuthorizerReg = Base(authoReg.register_datetime,authoReg.update_datetime,authoReg.approver_id,authoReg.password1,authoReg.employee_cd,authoReg.mail_address,authoReg.personal_flg,authoReg.illegal_address_flg,authoReg.mobile_domain_flg,authoReg.double_flg,
            authoReg.deliver_err_count,authoReg.user_ip_address,authoReg.user_agent,authoReg.update_delete_key,authoReg.belong_cd,authoReg.belong1,authoReg.admin_flg,authoReg.job_cd,authoReg.officer,authoReg.grade1,authoReg.name1,authoReg.personal_appraisal_name,authoReg.evaluation_status,
            authoReg.self_evaluation_id,authoReg.primary_evaluation_id,authoReg.secondary_evaluation_id,authoReg.primary_secondary_evaluation_id,authoReg.self_evaluation_flg,authoReg.self_evaluation_rank,authoReg.self_evaluation_total_score,authoReg.self_evaluation_rank_bonus,authoReg.self_evaluation_total_score_bonus,
            authoReg.primary_evaluation_rank,authoReg.primary_evaluation_total_score,authoReg.primary_evaluation_rank_bonus,authoReg.primary_evaluation_total_score_bonus,authoReg.primary_evaluator_entry_field,authoReg.primary_evaluator_entry_date,authoReg.secondary_evaluation_rank,authoReg.secondary_evaluation_total_score,
            authoReg.secondary_evaluation_rank_bonus,authoReg.secondary_evaluation_total_score_bonus,authoReg.secondary_evaluator_entry_field,authoReg.secondary_evaluator_entry_date,authoReg.depart_adjust_rank,authoReg.depart_adjust_total_score,authoReg.depart_adjust_rank_bonus,authoReg.depart_adjust_total_score_bonus,authoReg.grade1_item,
            authoReg.grade1_evaluation_points,authoReg.grade1_weight_salary_increase,authoReg.grade1_weight_bonus,authoReg.grade1_self_evaluation_points,authoReg.grade1_primary_evaluation_points,authoReg.grade1_secondary_evaluation_points,authoReg.grade1_depart_adjust_points,authoReg.grade2_item,authoReg.grade2_evaluation_points,authoReg.grade2_weight_salary_increase,
            authoReg.grade2_weight_bonus,authoReg.grade2_self_evaluation_points,authoReg.grade2_primary_evaluation_points,authoReg.grade2_secondary_evaluation_points,authoReg.grade2_depart_adjust_points,authoReg.grade3_item,authoReg.grade3_evaluation_points,authoReg.grade3_weight_salary_increase,authoReg.grade3_weight_bonus,authoReg.grade3_self_evaluation_points,
            authoReg.grade3_primary_evaluation_points,authoReg.grade3_secondary_evaluation_points,authoReg.grade3_depart_adjust_points,authoReg.grade4_item,authoReg.grade4_evaluation_points,authoReg.grade4_weight_salary_increase,authoReg.grade4_weight_bonus,authoReg.grade4_self_evaluation_points,authoReg.grade4_primary_evaluation_points,authoReg.grade4_secondary_evaluation_points,
            authoReg.grade4_depart_adjust_points,authoReg.grade5_item,authoReg.grade5_evaluation_points,authoReg.grade5_weight_salary_increase,authoReg.grade5_weight_bonus,authoReg.grade5_self_evaluation_points,authoReg.grade5_primary_evaluation_points,authoReg.grade5_secondary_evaluation_points,authoReg.grade5_depart_adjust_points,authoReg.ability1_item,authoReg.ability1_evaluation_points,
            authoReg.ability1_weight_salary_increase,authoReg.ability1_weight_bonus,authoReg.ability1_self_evaluation_points,authoReg.ability1_primary_evaluation_points,authoReg.ability1_secondary_evaluation_points,authoReg.ability1_depart_adjust_points,authoReg.ability2_item,authoReg.ability2_evaluation_points, authoReg.ability2_weight_salary_increase,authoReg.ability2_weight_bonus,
            authoReg.ability2_self_evaluation_points,authoReg.ability2_primary_evaluation_points,authoReg.ability2_secondary_evaluation_points,authoReg.ability2_depart_adjust_points,authoReg.ability3_item,authoReg.ability3_evaluation_points, authoReg.ability3_weight_salary_increase,authoReg.ability3_weight_bonus,authoReg.ability3_self_evaluation_points,authoReg.ability3_primary_evaluation_points,
            authoReg.ability3_secondary_evaluation_points,authoReg.ability3_depart_adjust_points,authoReg.ability4_item,authoReg.ability4_evaluation_points,authoReg.ability4_weight_salary_increase,authoReg.ability4_weight_bonus,authoReg.ability4_self_evaluation_points,authoReg.ability4_primary_evaluation_points,authoReg.ability4_secondary_evaluation_points,authoReg.ability4_depart_adjust_points,
            authoReg.approach_attitude1_item,authoReg.approach_attitude1_evaluation_points,authoReg.approach_attitude1_weight_salary_increase,authoReg.approach_attitude1_weight_bonus,authoReg.approach_attitude1_self_evaluation_points,authoReg.approach_attitude1_primary_evaluation_points,authoReg.approach_attitude1_secondary_evaluation_points,authoReg.approach_attitude1_depart_adjust_points,
            authoReg.approach_attitude2_item,authoReg.approach_attitude2_evaluation_points,authoReg.approach_attitude2_weight_salary_increase,authoReg.approach_attitude2_weight_bonus,authoReg.approach_attitude2_self_evaluation_points,authoReg.approach_attitude2_primary_evaluation_points,authoReg.approach_attitude2_secondary_evaluation_points,authoReg.approach_attitude2_depart_adjust_points,
            authoReg.approach_attitude3_item,authoReg.approach_attitude3_evaluation_points,authoReg.approach_attitude3_weight_salary_increase,authoReg.approach_attitude3_weight_bonus,authoReg.approach_attitude3_self_evaluation_points,authoReg.approach_attitude3_primary_evaluation_points,authoReg.approach_attitude3_secondary_evaluation_points,authoReg.approach_attitude3_depart_adjust_points,
            authoReg.approach_attitude4_item,authoReg.approach_attitude4_evaluation_points,authoReg.approach_attitude4_weight_salary_increase,authoReg.approach_attitude4_weight_bonus,authoReg.approach_attitude4_self_evaluation_points,authoReg.approach_attitude4_primary_evaluation_points,authoReg.approach_attitude4_secondary_evaluation_points,authoReg.approach_attitude4_depart_adjust_points,
            authoReg.primary_secondary_evaluation_flg,authoReg.evaluation_update_flg,authoReg.depart_adjust_id,authoReg.retire_flg,authoReg.appraisal_authority,authoReg.system_create_authority,authoReg.birthday,authoReg.company_entry_date,authoReg.delete_category,authoReg.primary_evaluation_authority,authoReg.secondary_evaluation_authority,authoReg.service_period_year,authoReg.service_period_month,
            authoReg.display_primary_evaluation_name,authoReg.display_secondary_evaluation_name,authoReg.display_primary_secondary_evaluation_name,authoReg.display_depart_adjust_evaluation_name,authoReg.display_data_status,authoReg.display_selection_flg,authoReg.work_flg);
        authorizerRepository?.save(newAuthorizerReg)
        return "redirect:/authorizerRegistration"
    }
}