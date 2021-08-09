package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.model.AppraisalResult
import com.example.jinjiKoukaSystem.repository.AppraisalResultRespository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class EvaluationController {

    @Autowired
    private val appraisalResultRepository:AppraisalResultRespository?=null

    @RequestMapping("/savePrimaryEvaluation")
    fun primaryEvaluation(model: Model, @ModelAttribute appraisalResult: AppraisalResult): String {
        val newappraisal= AppraisalResult(appraisalResult.register_datetime,appraisalResult.update_datetime,
            appraisalResult.illegal_address_flg,appraisalResult.mobile_domain_flg,appraisalResult.double_flg,
            appraisalResult.deliver_err_count,appraisalResult.user_ip_address,appraisalResult.user_agent,
            appraisalResult.update_delete_key,appraisalResult.belong,appraisalResult.officer,appraisalResult.grade,
            appraisalResult.name,appraisalResult.personal_appraisal_name,appraisalResult.evaluation_status,
            appraisalResult.self_evaluation_id,appraisalResult.primary_evaluation_id,appraisalResult.primary_secondary_evaluation_id,
            appraisalResult.primary_secondary_evaluation_id,appraisalResult.self_evaluation_flg,
            appraisalResult.self_evaluation_rank,appraisalResult.self_evaluation_total_score,appraisalResult.self_evaluation_rank_bonus,
            appraisalResult.self_evaluation_total_score_bonus,appraisalResult.primary_evaluation_rank,
            appraisalResult.primary_evaluation_total_score,appraisalResult.primary_evaluation_rank_bonus,
            appraisalResult.primary_evaluation_total_score_bonus,appraisalResult.primary_evaluator_entry_field,
            appraisalResult.primary_evaluator_entry_date,appraisalResult.secondary_evaluation_rank,
            appraisalResult.secondary_evaluation_total_score,appraisalResult.secondary_evaluation_rank_bonus,
            appraisalResult.secondary_evaluation_total_score_bonus,appraisalResult.secondary_evaluator_entry_field,
            appraisalResult.secondary_evaluator_entry_date,appraisalResult.depart_adjust_rank,
            appraisalResult.depart_adjust_total_score,appraisalResult.depart_adjust_rank_bonus,
            appraisalResult.depart_adjust_total_score_bonus,appraisalResult.grade1_item,appraisalResult.grade1_evaluation_points,
            appraisalResult.grade1_weight_salary_increase,appraisalResult.grade1_weight_bonus,appraisalResult.grade1_self_evaluation_points,
            appraisalResult.grade1_primary_evaluation_points,appraisalResult.grade1_secondary_evaluation_points,
            appraisalResult.grade1_depart_adjust_points,appraisalResult.grade2_item,appraisalResult.grade2_evaluation_points,
            appraisalResult.grade2_weight_salary_increase,appraisalResult.grade2_weight_bonus,
            appraisalResult.grade2_self_evaluation_points,appraisalResult.grade2_primary_evaluation_points,
            appraisalResult.grade2_secondary_evaluation_points,appraisalResult.grade2_depart_adjust_points,
            appraisalResult.grade3_item,appraisalResult.grade3_evaluation_points,appraisalResult.grade3_weight_salary_increase,
            appraisalResult.grade3_weight_bonus,appraisalResult.grade3_self_evaluation_points,appraisalResult.grade3_primary_evaluation_points,
            appraisalResult.grade3_secondary_evaluation_points,appraisalResult.grade3_depart_adjust_points,
            appraisalResult.grade4_item,appraisalResult.grade4_evaluation_points,appraisalResult.grade4_weight_salary_increase,
            appraisalResult.grade4_weight_bonus,appraisalResult.grade4_self_evaluation_points,appraisalResult.grade4_primary_evaluation_points,
            appraisalResult.grade4_secondary_evaluation_points,appraisalResult.grade4_depart_adjust_points,
            appraisalResult.grade5_item,appraisalResult.grade5_evaluation_points,appraisalResult.grade5_weight_salary_increase,
            appraisalResult.grade5_weight_bonus,appraisalResult.grade5_self_evaluation_points,appraisalResult.grade5_primary_evaluation_points,
            appraisalResult.grade5_secondary_evaluation_points,appraisalResult.grade5_depart_adjust_points,
            appraisalResult.ability1_item,appraisalResult.ability1_evaluation_points,appraisalResult.ability1_weight_salary_increase,
            appraisalResult.ability1_weight_bonus,appraisalResult.ability1_self_evaluation_points,appraisalResult.ability1_primary_evaluation_points,
            appraisalResult.ability1_secondary_evaluation_points,appraisalResult.ability1_depart_adjust_points,
            appraisalResult.ability2_item,appraisalResult.ability2_evaluation_points,appraisalResult.ability2_weight_salary_increase,
            appraisalResult.ability2_weight_bonus,appraisalResult.ability2_self_evaluation_points,appraisalResult.ability2_primary_evaluation_points,
            appraisalResult.ability2_secondary_evaluation_points,appraisalResult.ability2_depart_adjust_points,
            appraisalResult.ability3_item,appraisalResult.ability3_evaluation_points,appraisalResult.ability3_weight_salary_increase,
            appraisalResult.ability3_weight_bonus,appraisalResult.ability3_self_evaluation_points,appraisalResult.ability3_primary_evaluation_points,
            appraisalResult.ability3_secondary_evaluation_points,appraisalResult.ability3_depart_adjust_points,appraisalResult.ability4_item,
            appraisalResult.ability4_evaluation_points,appraisalResult.ability4_weight_salary_increase,appraisalResult.ability4_weight_bonus,
            appraisalResult.ability4_self_evaluation_points,appraisalResult.ability4_primary_evaluation_points,appraisalResult.ability4_secondary_evaluation_points,
            appraisalResult.ability4_depart_adjust_points,appraisalResult.approach_attitude1_item,appraisalResult.approach_attitude1_evaluation_points,
            appraisalResult.approach_attitude1_weight_salary_increase,appraisalResult.approach_attitude1_weight_bonus,
            appraisalResult.approach_attitude1_self_evaluation_points,appraisalResult.approach_attitude1_primary_evaluation_points,
            appraisalResult.approach_attitude1_secondary_evaluation_points,appraisalResult.approach_attitude1_depart_adjust_points,
            appraisalResult.approach_attitude2_item,appraisalResult.approach_attitude2_evaluation_points,
            appraisalResult.approach_attitude2_weight_salary_increase,appraisalResult.approach_attitude2_weight_bonus,
            appraisalResult.approach_attitude2_self_evaluation_points,appraisalResult.approach_attitude2_primary_evaluation_points,
            appraisalResult.approach_attitude2_secondary_evaluation_points,appraisalResult.approach_attitude2_depart_adjust_points,
            appraisalResult.approach_attitude3_item,appraisalResult.approach_attitude3_evaluation_points,
            appraisalResult.approach_attitude3_weight_salary_increase,appraisalResult.approach_attitude3_weight_bonus,
            appraisalResult.approach_attitude3_self_evaluation_points,appraisalResult.approach_attitude3_primary_evaluation_points,
            appraisalResult.approach_attitude3_secondary_evaluation_points,appraisalResult.approach_attitude3_depart_adjust_points,
            appraisalResult.approach_attitude4_item,appraisalResult.approach_attitude4_evaluation_points,
            appraisalResult.approach_attitude4_weight_salary_increase,appraisalResult.approach_attitude4_weight_bonus,
            appraisalResult.approach_attitude4_self_evaluation_points,appraisalResult.approach_attitude4_primary_evaluation_points,
            appraisalResult.approach_attitude4_secondary_evaluation_points,appraisalResult.approach_attitude4_depart_adjust_points,
            appraisalResult.primary_secondary_evaluation_flg,appraisalResult.evaluation_update_flg);
        appraisalResultRepository?.save(newappraisal)
        return "primaryEvaluationScreen"
    }
}