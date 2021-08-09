package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.model.Base
import com.example.jinjiKoukaSystem.repository.AuthorizerRegistrationRepository
import com.example.jinjiKoukaSystem.service.AuthorizerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.security.Principal


@Controller
class AuthorizerRegistrationController {

    @Autowired
    private val authorizerRepository: AuthorizerRegistrationRepository? = null

    @Autowired
    private val authorizerService: AuthorizerService? = null

    /*承認者情報保存.新規登録*/
    @RequestMapping("/saveAuthorizerRegistration")
    fun saveAuthorizerRegistration(model: Model, @ModelAttribute authorizerReg: Base): String? {

        if (authorizerReg.retire_flg == null )
            authorizerReg.retire_flg = false

        if (authorizerReg.admin_flg == null )
            authorizerReg.admin_flg= false

        val newAuthorizerReg = Base(authorizerReg.id,authorizerReg.register_datetime,authorizerReg.update_datetime,authorizerReg.approver_id,authorizerReg.password1,authorizerReg.employee_cd,authorizerReg.mail_address,authorizerReg.personal_flg,authorizerReg.illegal_address_flg,authorizerReg.mobile_domain_flg,authorizerReg.double_flg,
            authorizerReg.deliver_err_count,authorizerReg.user_ip_address,authorizerReg.user_agent,authorizerReg.update_delete_key,authorizerReg.belong_cd,authorizerReg.belong1,authorizerReg.admin_flg,authorizerReg.job_cd,authorizerReg.officer,authorizerReg.grade1,authorizerReg.name1,authorizerReg.personal_appraisal_name,authorizerReg.evaluation_status,
            authorizerReg.self_evaluation_id,authorizerReg.primary_evaluation_id,authorizerReg.secondary_evaluation_id,authorizerReg.primary_secondary_evaluation_id,authorizerReg.self_evaluation_flg,authorizerReg.self_evaluation_rank,authorizerReg.self_evaluation_total_score,authorizerReg.self_evaluation_rank_bonus,authorizerReg.self_evaluation_total_score_bonus,
            authorizerReg.primary_evaluation_rank,authorizerReg.primary_evaluation_total_score,authorizerReg.primary_evaluation_rank_bonus,authorizerReg.primary_evaluation_total_score_bonus,authorizerReg.primary_evaluator_entry_field,authorizerReg.primary_evaluator_entry_date,authorizerReg.secondary_evaluation_rank,authorizerReg.secondary_evaluation_total_score,
            authorizerReg.secondary_evaluation_rank_bonus,authorizerReg.secondary_evaluation_total_score_bonus,authorizerReg.secondary_evaluator_entry_field,authorizerReg.secondary_evaluator_entry_date,authorizerReg.depart_adjust_rank,authorizerReg.depart_adjust_total_score,authorizerReg.depart_adjust_rank_bonus,authorizerReg.depart_adjust_total_score_bonus,authorizerReg.grade1_item,
            authorizerReg.grade1_evaluation_points,authorizerReg.grade1_weight_salary_increase,authorizerReg.grade1_weight_bonus,authorizerReg.grade1_self_evaluation_points,authorizerReg.grade1_primary_evaluation_points,authorizerReg.grade1_secondary_evaluation_points,authorizerReg.grade1_depart_adjust_points,authorizerReg.grade2_item,authorizerReg.grade2_evaluation_points,authorizerReg.grade2_weight_salary_increase,
            authorizerReg.grade2_weight_bonus,authorizerReg.grade2_self_evaluation_points,authorizerReg.grade2_primary_evaluation_points,authorizerReg.grade2_secondary_evaluation_points,authorizerReg.grade2_depart_adjust_points,authorizerReg.grade3_item,authorizerReg.grade3_evaluation_points,authorizerReg.grade3_weight_salary_increase,authorizerReg.grade3_weight_bonus,authorizerReg.grade3_self_evaluation_points,
            authorizerReg.grade3_primary_evaluation_points,authorizerReg.grade3_secondary_evaluation_points,authorizerReg.grade3_depart_adjust_points,authorizerReg.grade4_item,authorizerReg.grade4_evaluation_points,authorizerReg.grade4_weight_salary_increase,authorizerReg.grade4_weight_bonus,authorizerReg.grade4_self_evaluation_points,authorizerReg.grade4_primary_evaluation_points,authorizerReg.grade4_secondary_evaluation_points,
            authorizerReg.grade4_depart_adjust_points,authorizerReg.grade5_item,authorizerReg.grade5_evaluation_points,authorizerReg.grade5_weight_salary_increase,authorizerReg.grade5_weight_bonus,authorizerReg.grade5_self_evaluation_points,authorizerReg.grade5_primary_evaluation_points,authorizerReg.grade5_secondary_evaluation_points,authorizerReg.grade5_depart_adjust_points,authorizerReg.ability1_item,authorizerReg.ability1_evaluation_points,
            authorizerReg.ability1_weight_salary_increase,authorizerReg.ability1_weight_bonus,authorizerReg.ability1_self_evaluation_points,authorizerReg.ability1_primary_evaluation_points,authorizerReg.ability1_secondary_evaluation_points,authorizerReg.ability1_depart_adjust_points,authorizerReg.ability2_item,authorizerReg.ability2_evaluation_points, authorizerReg.ability2_weight_salary_increase,authorizerReg.ability2_weight_bonus,
            authorizerReg.ability2_self_evaluation_points,authorizerReg.ability2_primary_evaluation_points,authorizerReg.ability2_secondary_evaluation_points,authorizerReg.ability2_depart_adjust_points,authorizerReg.ability3_item,authorizerReg.ability3_evaluation_points, authorizerReg.ability3_weight_salary_increase,authorizerReg.ability3_weight_bonus,authorizerReg.ability3_self_evaluation_points,authorizerReg.ability3_primary_evaluation_points,
            authorizerReg.ability3_secondary_evaluation_points,authorizerReg.ability3_depart_adjust_points,authorizerReg.ability4_item,authorizerReg.ability4_evaluation_points,authorizerReg.ability4_weight_salary_increase,authorizerReg.ability4_weight_bonus,authorizerReg.ability4_self_evaluation_points,authorizerReg.ability4_primary_evaluation_points,authorizerReg.ability4_secondary_evaluation_points,authorizerReg.ability4_depart_adjust_points,
            authorizerReg.approach_attitude1_item,authorizerReg.approach_attitude1_evaluation_points,authorizerReg.approach_attitude1_weight_salary_increase,authorizerReg.approach_attitude1_weight_bonus,authorizerReg.approach_attitude1_self_evaluation_points,authorizerReg.approach_attitude1_primary_evaluation_points,authorizerReg.approach_attitude1_secondary_evaluation_points,authorizerReg.approach_attitude1_depart_adjust_points,
            authorizerReg.approach_attitude2_item,authorizerReg.approach_attitude2_evaluation_points,authorizerReg.approach_attitude2_weight_salary_increase,authorizerReg.approach_attitude2_weight_bonus,authorizerReg.approach_attitude2_self_evaluation_points,authorizerReg.approach_attitude2_primary_evaluation_points,authorizerReg.approach_attitude2_secondary_evaluation_points,authorizerReg.approach_attitude2_depart_adjust_points,
            authorizerReg.approach_attitude3_item,authorizerReg.approach_attitude3_evaluation_points,authorizerReg.approach_attitude3_weight_salary_increase,authorizerReg.approach_attitude3_weight_bonus,authorizerReg.approach_attitude3_self_evaluation_points,authorizerReg.approach_attitude3_primary_evaluation_points,authorizerReg.approach_attitude3_secondary_evaluation_points,authorizerReg.approach_attitude3_depart_adjust_points,
            authorizerReg.approach_attitude4_item,authorizerReg.approach_attitude4_evaluation_points,authorizerReg.approach_attitude4_weight_salary_increase,authorizerReg.approach_attitude4_weight_bonus,authorizerReg.approach_attitude4_self_evaluation_points,authorizerReg.approach_attitude4_primary_evaluation_points,authorizerReg.approach_attitude4_secondary_evaluation_points,authorizerReg.approach_attitude4_depart_adjust_points,
            authorizerReg.primary_secondary_evaluation_flg,authorizerReg.evaluation_update_flg,authorizerReg.depart_adjust_id,authorizerReg.retire_flg,authorizerReg.appraisal_authority,authorizerReg.system_create_authority,authorizerReg.birthday,authorizerReg.company_entry_date,authorizerReg.delete_category,authorizerReg.primary_evaluation_authority,authorizerReg.secondary_evaluation_authority,authorizerReg.service_period_year,authorizerReg.service_period_month,
            authorizerReg.display_primary_evaluation_name,authorizerReg.display_secondary_evaluation_name,authorizerReg.display_primary_secondary_evaluation_name,authorizerReg.display_depart_adjust_evaluation_name,authorizerReg.display_data_status,authorizerReg.display_selection_flg,authorizerReg.work_flg);

        authorizerRepository?.save(newAuthorizerReg)
        return "redirect:/authorizerRegistration"
    }

    @RequestMapping("/authorizerRegEdit/{id}",method = [RequestMethod.GET])
    fun authorizerRegEdit(@PathVariable("id") id: String, model: Model) : String
    {
        // 修正ボタン押した場合、
        val editAuthorizer: Base = authorizerRepository?.baseNo(id) as Base
        model.addAttribute("editAuthorizer", editAuthorizer)
        return "authorizerRegEdit"
    }

    @PostMapping("/updateAuthorizerInfo")
    @Throws(Exception::class)
    fun updateAuthorizer(model: Model?, @ModelAttribute("authorizerReg") authorizerReg: Base?, principal: Principal?): String?
    {
        // 承認者更新（m_base テーブル）
        authorizerService?.saveAuthorizer(authorizerReg)
        return "redirect:/authorizerRegistration"
    }


    @GetMapping("/deleteAuthorizer/{id}")
    fun deleteGrade(@PathVariable(value = "id") id: Long): String?
    {
        // 承認者削除（m_base テーブルから）
        authorizerService?.deleteAuthorizerById(id)
        return "redirect:/authorizerRegistration"
    }
}