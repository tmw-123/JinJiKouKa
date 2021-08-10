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
    fun saveAuthorizerRegistration(model: Model, @ModelAttribute("authorizer") authorizer: Base?): String? {

        if (authorizer?.retire_flg == null )
            authorizer?.retire_flg = false

        if (authorizer?.admin_flg == null )
            authorizer?.admin_flg= false

        val newAuthorizer = Base(authorizer?.id,authorizer?.register_datetime,authorizer?.update_datetime,authorizer?.approver_id,authorizer?.password1,authorizer?.employee_cd,authorizer?.mail_address,authorizer?.personal_flg,authorizer?.illegal_address_flg,authorizer?.mobile_domain_flg,authorizer?.double_flg,
            authorizer?.deliver_err_count,authorizer?.user_ip_address,authorizer?.user_agent,authorizer?.update_delete_key,authorizer?.belong_cd,authorizer?.belong1,authorizer?.admin_flg,authorizer?.job_cd,authorizer?.officer,authorizer?.grade1,authorizer?.name1,authorizer?.personal_appraisal_name,authorizer?.evaluation_status,
            authorizer?.self_evaluation_id,authorizer?.primary_evaluation_id,authorizer?.secondary_evaluation_id,authorizer?.primary_secondary_evaluation_id,authorizer?.self_evaluation_flg,authorizer?.self_evaluation_rank,authorizer?.self_evaluation_total_score,authorizer?.self_evaluation_rank_bonus,authorizer?.self_evaluation_total_score_bonus,
            authorizer?.primary_evaluation_rank,authorizer?.primary_evaluation_total_score,authorizer?.primary_evaluation_rank_bonus,authorizer?.primary_evaluation_total_score_bonus,authorizer?.primary_evaluator_entry_field,authorizer?.primary_evaluator_entry_date,authorizer?.secondary_evaluation_rank,authorizer?.secondary_evaluation_total_score,
            authorizer?.secondary_evaluation_rank_bonus,authorizer?.secondary_evaluation_total_score_bonus,authorizer?.secondary_evaluator_entry_field,authorizer?.secondary_evaluator_entry_date,authorizer?.depart_adjust_rank,authorizer?.depart_adjust_total_score,authorizer?.depart_adjust_rank_bonus,authorizer?.depart_adjust_total_score_bonus,authorizer?.grade1_item,
            authorizer?.grade1_evaluation_points,authorizer?.grade1_weight_salary_increase,authorizer?.grade1_weight_bonus,authorizer?.grade1_self_evaluation_points,authorizer?.grade1_primary_evaluation_points,authorizer?.grade1_secondary_evaluation_points,authorizer?.grade1_depart_adjust_points,authorizer?.grade2_item,authorizer?.grade2_evaluation_points,authorizer?.grade2_weight_salary_increase,
            authorizer?.grade2_weight_bonus,authorizer?.grade2_self_evaluation_points,authorizer?.grade2_primary_evaluation_points,authorizer?.grade2_secondary_evaluation_points,authorizer?.grade2_depart_adjust_points,authorizer?.grade3_item,authorizer?.grade3_evaluation_points,authorizer?.grade3_weight_salary_increase,authorizer?.grade3_weight_bonus,authorizer?.grade3_self_evaluation_points,
            authorizer?.grade3_primary_evaluation_points,authorizer?.grade3_secondary_evaluation_points,authorizer?.grade3_depart_adjust_points,authorizer?.grade4_item,authorizer?.grade4_evaluation_points,authorizer?.grade4_weight_salary_increase,authorizer?.grade4_weight_bonus,authorizer?.grade4_self_evaluation_points,authorizer?.grade4_primary_evaluation_points,authorizer?.grade4_secondary_evaluation_points,
            authorizer?.grade4_depart_adjust_points,authorizer?.grade5_item,authorizer?.grade5_evaluation_points,authorizer?.grade5_weight_salary_increase,authorizer?.grade5_weight_bonus,authorizer?.grade5_self_evaluation_points,authorizer?.grade5_primary_evaluation_points,authorizer?.grade5_secondary_evaluation_points,authorizer?.grade5_depart_adjust_points,authorizer?.ability1_item,authorizer?.ability1_evaluation_points,
            authorizer?.ability1_weight_salary_increase,authorizer?.ability1_weight_bonus,authorizer?.ability1_self_evaluation_points,authorizer?.ability1_primary_evaluation_points,authorizer?.ability1_secondary_evaluation_points,authorizer?.ability1_depart_adjust_points,authorizer?.ability2_item,authorizer?.ability2_evaluation_points, authorizer?.ability2_weight_salary_increase,authorizer?.ability2_weight_bonus,
            authorizer?.ability2_self_evaluation_points,authorizer?.ability2_primary_evaluation_points,authorizer?.ability2_secondary_evaluation_points,authorizer?.ability2_depart_adjust_points,authorizer?.ability3_item,authorizer?.ability3_evaluation_points, authorizer?.ability3_weight_salary_increase,authorizer?.ability3_weight_bonus,authorizer?.ability3_self_evaluation_points,authorizer?.ability3_primary_evaluation_points,
            authorizer?.ability3_secondary_evaluation_points,authorizer?.ability3_depart_adjust_points,authorizer?.ability4_item,authorizer?.ability4_evaluation_points,authorizer?.ability4_weight_salary_increase,authorizer?.ability4_weight_bonus,authorizer?.ability4_self_evaluation_points,authorizer?.ability4_primary_evaluation_points,authorizer?.ability4_secondary_evaluation_points,authorizer?.ability4_depart_adjust_points,
            authorizer?.approach_attitude1_item,authorizer?.approach_attitude1_evaluation_points,authorizer?.approach_attitude1_weight_salary_increase,authorizer?.approach_attitude1_weight_bonus,authorizer?.approach_attitude1_self_evaluation_points,authorizer?.approach_attitude1_primary_evaluation_points,authorizer?.approach_attitude1_secondary_evaluation_points,authorizer?.approach_attitude1_depart_adjust_points,
            authorizer?.approach_attitude2_item,authorizer?.approach_attitude2_evaluation_points,authorizer?.approach_attitude2_weight_salary_increase,authorizer?.approach_attitude2_weight_bonus,authorizer?.approach_attitude2_self_evaluation_points,authorizer?.approach_attitude2_primary_evaluation_points,authorizer?.approach_attitude2_secondary_evaluation_points,authorizer?.approach_attitude2_depart_adjust_points,
            authorizer?.approach_attitude3_item,authorizer?.approach_attitude3_evaluation_points,authorizer?.approach_attitude3_weight_salary_increase,authorizer?.approach_attitude3_weight_bonus,authorizer?.approach_attitude3_self_evaluation_points,authorizer?.approach_attitude3_primary_evaluation_points,authorizer?.approach_attitude3_secondary_evaluation_points,authorizer?.approach_attitude3_depart_adjust_points,
            authorizer?.approach_attitude4_item,authorizer?.approach_attitude4_evaluation_points,authorizer?.approach_attitude4_weight_salary_increase,authorizer?.approach_attitude4_weight_bonus,authorizer?.approach_attitude4_self_evaluation_points,authorizer?.approach_attitude4_primary_evaluation_points,authorizer?.approach_attitude4_secondary_evaluation_points,authorizer?.approach_attitude4_depart_adjust_points,
            authorizer?.primary_secondary_evaluation_flg,authorizer?.evaluation_update_flg,authorizer?.depart_adjust_id,authorizer?.retire_flg,authorizer?.appraisal_authority,authorizer?.system_create_authority,authorizer?.birthday,authorizer?.company_entry_date,authorizer?.delete_category,authorizer?.primary_evaluation_authority,authorizer?.secondary_evaluation_authority,authorizer?.service_period_year,authorizer?.service_period_month,
            authorizer?.display_primary_evaluation_name,authorizer?.display_secondary_evaluation_name,authorizer?.display_primary_secondary_evaluation_name,authorizer?.display_depart_adjust_evaluation_name,authorizer?.display_data_status,authorizer?.display_selection_flg,authorizer?.work_flg);

        authorizerRepository?.save(newAuthorizer)
        return "redirect:/authorizerRegistration"
    }

    @RequestMapping("/authorizerEdit/{id}",method = [RequestMethod.GET])
    fun authorizerEdit(@PathVariable("id") id: Long, model: Model) : String
    {
        // 修正ボタン押した場合、
        val editAuthorizer: Base = authorizerRepository?.baseNo(id) as Base
        model.addAttribute("editAuthorizer", editAuthorizer)
        return "authorizerEdit"
    }

    @PostMapping("/updateAuthorizerInfo")
    @Throws(Exception::class)
    fun updateAuthorizer(model: Model?, @ModelAttribute("authorizer") authorizer: Base?, principal: Principal?): String?
    {
        // 承認者更新（m_base テーブル）
        authorizerService?.saveAuthorizer(authorizer)
        return "redirect:/authorizerRegistration"
    }


    @GetMapping("/deleteAuthorizer/{id}")
    fun deleteGrade(@PathVariable(value = "id") id: Long): String?
    {
        // 承認者削除（m_base テーブルから）
        authorizerService?.deleteAuthorizerById(id)
        return "redirect:/authorizeristration"
    }
}