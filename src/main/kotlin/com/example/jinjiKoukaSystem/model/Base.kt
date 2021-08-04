package com.example.jinjiKoukaSystem.model

import javax.persistence.*

@Entity
@Table(name = "m_base")
class Base{

    @Id
    @Column(name = "register_datetime")
    var register_datetime: String? = null

    @Column(name = "update_datetime")
    var update_datetime: String? = null

    @Column(name = "approver_id")
    var approver_id: String? = null

    @Column(name = "password")
    var password1: String? = null

    @Column(name = "employee_cd")
    var employee_cd: String? = null

    @Column(name = "mail_address")
    var mail_address: String? = null

    @Column(name = "personal_flg")
    var personal_flg: String? = null

    @Column(name = "illegal_address_flg")
    var illegal_address_flg: String? = null

    @Column(name = "mobile_domain_flg")
    var mobile_domain_flg: String? = null

    @Column(name = "double_flg")
    var double_flg: String? = null

    @Column(name = "deliver_err_count")
    var deliver_err_count: String? = null

    @Column(name = "user_ip_address")
    var user_ip_address: String? = null

    @Column(name = "user_agent")
    var user_agent: String? = null

    @Column(name = "update_delete_key")
    var update_delete_key: String? = null

    @Column(name = "belong_cd")
    var belong_cd: Int? = null

    @Column(name = "belong")
    var belong1: String? = null

    @Column(name = "admin_flg")
    var admin_flg: Boolean? = null

    @Column(name = "job_cd")
    var job_cd: Int? = null

    @Column(name = "officer")
    var officer: String? = null

    @Column(name = "grade")
    var grade1: Int? = null

    @Column(name = "name")
    var name1: String? = null

    @Column(name = "personal_appraisal_name")
    var personal_appraisal_name: String? = null

    @Column(name = "evaluation_status")
    var evaluation_status: String? = null

    @Column(name = "self_evaluation_id")
    var self_evaluation_id: String? = null

    @Column(name = "primary_evaluation_id")
    var primary_evaluation_id: String? = null

    @Column(name = "secondary_evaluation_id")
    var secondary_evaluation_id: String? = null

    @Column(name = "primary_secondary_evaluation_id")
    var primary_secondary_evaluation_id: String? = null

    @Column(name = "self_evaluation_flg")
    var self_evaluation_flg: String? = null

    @Column(name = "self_evaluation_rank")
    var self_evaluation_rank: String? = null

    @Column(name = "self_evaluation_total_score")
    var self_evaluation_total_score: Long? = null

    @Column(name = "self_evaluation_rank_bonus")
    var self_evaluation_rank_bonus: String? = null

    @Column(name = "self_evaluation_total_score_bonus")
    var self_evaluation_total_score_bonus: Long? = null

    @Column(name = "primary_evaluation_rank")
    var primary_evaluation_rank: String? = null

    @Column(name = "primary_evaluation_total_score")
    var primary_evaluation_total_score: Long? = null

    @Column(name = "primary_evaluation_rank_bonus")
    var primary_evaluation_rank_bonus: String? = null

    @Column(name = "primary_evaluation_total_score_bonus")
    var primary_evaluation_total_score_bonus: Long? = null

    @Column(name = "primary_evaluator_entry_field")
    var primary_evaluator_entry_field: String? = null

    @Column(name = "primary_evaluator_entry_date")
    var primary_evaluator_entry_date: String? = null

    @Column(name = "secondary_evaluation_rank")
    var secondary_evaluation_rank: String? = null

    @Column(name = "secondary_evaluation_total_score")
    var secondary_evaluation_total_score: Long? = null

    @Column(name = "secondary_evaluation_rank_bonus")
    var secondary_evaluation_rank_bonus: String? = null

    @Column(name = "secondary_evaluation_total_score_bonus")
    var secondary_evaluation_total_score_bonus: Long? = null

    @Column(name = "secondary_evaluator_entry_field")
    var secondary_evaluator_entry_field: String? = null

    @Column(name = "secondary_evaluator_entry_date")
    var secondary_evaluator_entry_date: String? = null

    @Column(name = "depart_adjust_rank")
    var depart_adjust_rank: String? = null

    @Column(name = "depart_adjust_total_score")
    var depart_adjust_total_score: Long? = null

    @Column(name = "depart_adjust_rank_bonus")
    var depart_adjust_rank_bonus: String? = null

    @Column(name = "depart_adjust_total_score_bonus")
    var depart_adjust_total_score_bonus: Long? = null

    @Column(name = "grade1_item")
    var grade1_item: String? = null

    @Column(name = "grade1_evaluation_points")
    var grade1_evaluation_points: String? = null

    @Column(name = "grade1_weight_salary_increase")
    var grade1_weight_salary_increase: String? = null

    @Column(name = "grade1_weight_bonus")
    var grade1_weight_bonus: String? = null

    @Column(name = "grade1_self_evaluation_points")
    var grade1_self_evaluation_points: String? = null

    @Column(name = "grade1_primary_evaluation_points")
    var grade1_primary_evaluation_points: String? = null

    @Column(name = "grade1_secondary_evaluation_points")
    var grade1_secondary_evaluation_points: String? = null

    @Column(name = "grade1_depart_adjust_points")
    var grade1_depart_adjust_points: String? = null

    @Column(name = "grade2_item")
    var grade2_item: String? = null

    @Column(name = "grade2_evaluation_points")
    var grade2_evaluation_points: String? = null

    @Column(name = "grade2_weight_salary_increase")
    var grade2_weight_salary_increase: String? = null

    @Column(name = "grade2_weight_bonus")
    var grade2_weight_bonus: String? = null

    @Column(name = "grade2_self_evaluation_points")
    var grade2_self_evaluation_points: String? = null

    @Column(name = "grade2_primary_evaluation_points")
    var grade2_primary_evaluation_points: String? = null

    @Column(name = "grade2_secondary_evaluation_points")
    var grade2_secondary_evaluation_points: String? = null

    @Column(name = "grade2_depart_adjust_points")
    var grade2_depart_adjust_points: String? = null

    @Column(name = "grade3_item")
    var grade3_item: String? = null

    @Column(name = "grade3_evaluation_points")
    var grade3_evaluation_points: String? = null

    @Column(name = "grade3_weight_salary_increase")
    var grade3_weight_salary_increase: String? = null

    @Column(name = "grade3_weight_bonus")
    var grade3_weight_bonus: String? = null

    @Column(name = "grade3_self_evaluation_points")
    var grade3_self_evaluation_points: String? = null

    @Column(name = "grade3_primary_evaluation_points")
    var grade3_primary_evaluation_points: String? = null

    @Column(name = "grade3_secondary_evaluation_points")
    var grade3_secondary_evaluation_points: String? = null

    @Column(name = "grade3_depart_adjust_points")
    var grade3_depart_adjust_points: String? = null

    @Column(name = "grade4_item")
    var grade4_item: String? = null

    @Column(name = "grade4_evaluation_points")
    var grade4_evaluation_points: String? = null

    @Column(name = "grade4_weight_salary_increase")
    var grade4_weight_salary_increase: String? = null

    @Column(name = "grade4_weight_bonus")
    var grade4_weight_bonus: String? = null

    @Column(name = "grade4_self_evaluation_points")
    var grade4_self_evaluation_points: String? = null

    @Column(name = "grade4_primary_evaluation_points")
    var grade4_primary_evaluation_points: String? = null

    @Column(name = "grade4_secondary_evaluation_points")
    var grade4_secondary_evaluation_points: String? = null

    @Column(name = "grade4_depart_adjust_points")
    var grade4_depart_adjust_points: String? = null

    @Column(name = "grade5_item")
    var grade5_item: String? = null

    @Column(name = "grade5_evaluation_points")
    var grade5_evaluation_points: String? = null

    @Column(name = "grade5_weight_salary_increase")
    var grade5_weight_salary_increase: String? = null

    @Column(name = "grade5_weight_bonus")
    var grade5_weight_bonus: String? = null

    @Column(name = "grade5_self_evaluation_points")
    var grade5_self_evaluation_points: String? = null

    @Column(name = "grade5_primary_evaluation_points")
    var grade5_primary_evaluation_points: String? = null

    @Column(name = "grade5_secondary_evaluation_points")
    var grade5_secondary_evaluation_points: String? = null

    @Column(name = "grade5_depart_adjust_points")
    var grade5_depart_adjust_points: String? = null

    @Column(name = "ability1_item")
    var ability1_item: String? = null

    @Column(name = "ability1_evaluation_points")
    var ability1_evaluation_points: String? = null

    @Column(name = "ability1_weight_salary_increase")
    var ability1_weight_salary_increase: String? = null

    @Column(name = "ability1_weight_bonus")
    var ability1_weight_bonus: String? = null

    @Column(name = "ability1_self_evaluation_points")
    var ability1_self_evaluation_points: String? = null

    @Column(name = "ability1_primary_evaluation_points")
    var ability1_primary_evaluation_points: String? = null

    @Column(name = "ability1_secondary_evaluation_points")
    var ability1_secondary_evaluation_points: String? = null

    @Column(name = "ability1_depart_adjust_points")
    var ability1_depart_adjust_points: String? = null

    @Column(name = "ability2_item")
    var ability2_item: String? = null

    @Column(name = "ability2_evaluation_points")
    var ability2_evaluation_points: String? = null

    @Column(name = "ability2_weight_salary_increase")
    var ability2_weight_salary_increase: String? = null

    @Column(name = "ability2_weight_bonus")
    var ability2_weight_bonus: String? = null

    @Column(name = "ability2_self_evaluation_points")
    var ability2_self_evaluation_points: String? = null

    @Column(name = "ability2_primary_evaluation_points")
    var ability2_primary_evaluation_points: String? = null

    @Column(name = "ability2_secondary_evaluation_points")
    var ability2_secondary_evaluation_points: String? = null

    @Column(name = "ability2_depart_adjust_points")
    var ability2_depart_adjust_points: String? = null

    @Column(name = "ability3_item")
    var ability3_item: String? = null

    @Column(name = "ability3_evaluation_points")
    var ability3_evaluation_points: String? = null

    @Column(name = "ability3_weight_salary_increase")
    var ability3_weight_salary_increase: String? = null

    @Column(name = "ability3_weight_bonus")
    var ability3_weight_bonus: String? = null

    @Column(name = "ability3_self_evaluation_points")
    var ability3_self_evaluation_points: String? = null

    @Column(name = "ability3_primary_evaluation_points")
    var ability3_primary_evaluation_points: String? = null

    @Column(name = "ability3_secondary_evaluation_points")
    var ability3_secondary_evaluation_points: String? = null

    @Column(name = "ability3_depart_adjust_points")
    var ability3_depart_adjust_points: String? = null

    @Column(name = "ability4_item")
    var ability4_item: String? = null

    @Column(name = "ability4_evaluation_points")
    var ability4_evaluation_points: String? = null

    @Column(name = "ability4_weight_salary_increase")
    var ability4_weight_salary_increase: String? = null

    @Column(name = "ability4_weight_bonus")
    var ability4_weight_bonus: String? = null

    @Column(name = "ability4_self_evaluation_points")
    var ability4_self_evaluation_points: String? = null

    @Column(name = "ability4_primary_evaluation_points")
    var ability4_primary_evaluation_points: String? = null

    @Column(name = "ability4_secondary_evaluation_points")
    var ability4_secondary_evaluation_points: String? = null

    @Column(name = "ability4_depart_adjust_points")
    var ability4_depart_adjust_points: String? = null

    @Column(name = "approach_attitude1_item")
    var approach_attitude1_item: String? = null

    @Column(name = "approach_attitude1_evaluation_points")
    var approach_attitude1_evaluation_points: String? = null

    @Column(name = "approach_attitude1_weight_salary_increase")
    var approach_attitude1_weight_salary_increase: String? = null

    @Column(name = "approach_attitude1_weight_bonus")
    var approach_attitude1_weight_bonus: String? = null

    @Column(name = "approach_attitude1_self_evaluation_points")
    var approach_attitude1_self_evaluation_points: String? = null

    @Column(name = "approach_attitude1_primary_evaluation_points")
    var approach_attitude1_primary_evaluation_points: String? = null

    @Column(name = "approach_attitude1_secondary_evaluation_points")
    var approach_attitude1_secondary_evaluation_points: String? = null

    @Column(name = "approach_attitude1_depart_adjust_points")
    var approach_attitude1_depart_adjust_points: String? = null

    @Column(name = "approach_attitude2_item")
    var approach_attitude2_item: String? = null

    @Column(name = "approach_attitude2_evaluation_points")
    var approach_attitude2_evaluation_points: String? = null

    @Column(name = "approach_attitude2_weight_salary_increase")
    var approach_attitude2_weight_salary_increase: String? = null

    @Column(name = "approach_attitude2_weight_bonus")
    var approach_attitude2_weight_bonus: String? = null

    @Column(name = "approach_attitude2_self_evaluation_points")
    var approach_attitude2_self_evaluation_points: String? = null

    @Column(name = "approach_attitude2_primary_evaluation_points")
    var approach_attitude2_primary_evaluation_points: String? = null

    @Column(name = "approach_attitude2_secondary_evaluation_points")
    var approach_attitude2_secondary_evaluation_points: String? = null

    @Column(name = "approach_attitude2_depart_adjust_points")
    var approach_attitude2_depart_adjust_points: String? = null

    @Column(name = "approach_attitude3_item")
    var approach_attitude3_item: String? = null

    @Column(name = "approach_attitude3_evaluation_points")
    var approach_attitude3_evaluation_points: String? = null

    @Column(name = "approach_attitude3_weight_salary_increase")
    var approach_attitude3_weight_salary_increase: String? = null

    @Column(name = "approach_attitude3_weight_bonus")
    var approach_attitude3_weight_bonus: String? = null

    @Column(name = "approach_attitude3_self_evaluation_points")
    var approach_attitude3_self_evaluation_points: String? = null

    @Column(name = "approach_attitude3_primary_evaluation_points")
    var approach_attitude3_primary_evaluation_points: String? = null

    @Column(name = "approach_attitude3_secondary_evaluation_points")
    var approach_attitude3_secondary_evaluation_points: String? = null

    @Column(name = "approach_attitude3_depart_adjust_points")
    var approach_attitude3_depart_adjust_points: String? = null

    @Column(name = "approach_attitude4_item")
    var approach_attitude4_item: String? = null

    @Column(name = "approach_attitude4_evaluation_points")
    var approach_attitude4_evaluation_points: String? = null

    @Column(name = "approach_attitude4_weight_salary_increase")
    var approach_attitude4_weight_salary_increase: String? = null

    @Column(name = "approach_attitude4_weight_bonus")
    var approach_attitude4_weight_bonus: String? = null

    @Column(name = "approach_attitude4_self_evaluation_points")
    var approach_attitude4_self_evaluation_points: String? = null

    @Column(name = "approach_attitude4_primary_evaluation_points")
    var approach_attitude4_primary_evaluation_points: String? = null

    @Column(name = "approach_attitude4_secondary_evaluation_points")
    var approach_attitude4_secondary_evaluation_points: String? = null

    @Column(name = "approach_attitude4_depart_adjust_points")
    var approach_attitude4_depart_adjust_points: String? = null

    @Column(name = "primary_secondary_evaluation_flg")
    var primary_secondary_evaluation_flg: String? = null

    @Column(name = "evaluation_update_flg")
    var evaluation_update_flg: String? = null

    @Column(name = "depart_adjust_id")
    var depart_adjust_id: String? = null

    @Column(name = "retire_flg")
    var retire_flg: Boolean? = null

    @Column(name = "appraisal_authority")
    var appraisal_authority: String? = null

    @Column(name = "system_create_authority")
    var system_create_authority: String? = null

    @Column(name = "birthday")
    var birthday: String? = null

    @Column(name = "company_entry_date")
    var company_entry_date: String? = null

    @Column(name = "delete_category")
    var delete_category: String? = null

    @Column(name = "primary_evaluation_authority")
    var primary_evaluation_authority: String? = null

    @Column(name = "secondary_evaluation_authority")
    var secondary_evaluation_authority: String? = null

    @Column(name = "service_period_year")
    var service_period_year: String? = null

    @Column(name = "service_period_month")
    var service_period_month: String? = null

    @Column(name = "display_primary_evaluation_name")
    var display_primary_evaluation_name: String? = null

    @Column(name = "display_secondary_evaluation_name")
    var display_secondary_evaluation_name: String? = null

    @Column(name = "display_primary_secondary_evaluation_name")
    var display_primary_secondary_evaluation_name: String? = null

    @Column(name = "display_depart_adjust_evaluation_name")
    var display_depart_adjust_evaluation_name: String? = null

    @Column(name = "display_data_status")
    var display_data_status: String? = null

    @Column(name = "display_selection_flg")
    var display_selection_flg: Boolean? = null

    @Column(name = "work_flg")
    var work_flg: Boolean? = null


    fun getRegisterDatetime(): String? {
        return register_datetime
    }

    fun setRegisterDatetime(register_datetime: String?) {
        this.register_datetime = register_datetime
    }

    fun getUpdateDatetime(): String? {
        return update_datetime
    }

    fun setUpdateDatetime(update_datetime: String?) {
        this.update_datetime = update_datetime
    }

    fun getApproverId(): String? {
        return approver_id
    }

    fun setApproverId(approver_id: String?) {
        this.approver_id =approver_id
    }

    fun getPassword(): String? {
        return password1
    }

    fun setPassword(password1: String?) {
        this.password1 = password1
    }

    fun getEmployeeCd(): String? {
        return employee_cd
    }

    fun setEmployeeCd(employee_cd: String?) {
        this.employee_cd = employee_cd
    }

    fun getMailAddress(): String? {
        return mail_address
    }

    fun setMailAddress(mail_address: String?) {
        this.mail_address = mail_address
    }

    fun getPersonalFlg(): String? {
        return personal_flg
    }

    fun setPersonalFlg(personal_flg: String?) {
        this.personal_flg = personal_flg
    }

    fun getIllegalAddressFlg(): String? {
        return illegal_address_flg
    }

    fun setIllegalAddressFlg(illegal_address_flg: String?) {
        this.illegal_address_flg = illegal_address_flg
    }

    fun getMobileDomainFlg(): String? {
        return mobile_domain_flg
    }

    fun setMobileDomainFlg(mobile_domain_flg: String?) {
        this.mobile_domain_flg = mobile_domain_flg
    }

    fun getDoubleFlg(): String? {
        return double_flg
    }

    fun setDoubleFlg(double_flg: String?) {
        this.double_flg = double_flg
    }

    fun getDeliverErrCount(): String? {
        return deliver_err_count
    }

    fun setDeliverErrCount(deliver_err_count: String?) {
        this.deliver_err_count = deliver_err_count
    }

    fun getUserIpAddress(): String? {
        return user_ip_address
    }

    fun setUserIpAddress(user_ip_address: String?) {
        this.user_ip_address = user_ip_address
    }

    fun getUserAgent(): String? {
        return user_agent
    }

    fun setUserAgent(user_agent: String?) {
        this.user_agent = user_agent
    }

    fun getUpdateDeleteKey(): String? {
        return update_delete_key
    }

    fun setUpdateDeleteKey(update_delete_key: String?) {
        this.update_delete_key = update_delete_key
    }

    fun getBelongCd(): Int? {
        return belong_cd
    }

    fun setBelongCd(belong_cd: Int?) {
        this.belong_cd = belong_cd
    }

    fun getBelong(): String? {
        return belong1
    }

    fun setBelong(belong: String?) {
        this.belong1 = belong
    }

    fun getAdminFlg(): Boolean? {
        return admin_flg
    }

    fun setAdminFlg(admin_flg: Boolean?) {
        this.admin_flg = admin_flg
    }

    fun getJobCd(): Int? {
        return job_cd
    }

    fun setJobCd(job_cd: Int?) {
        this.job_cd = job_cd
    }

    fun getofficer(): String? {
        return officer
    }

    fun setofficer(officer: String?) {
        this.officer = officer
    }

    fun getGrade(): Int? {
        return grade1
    }

    fun setGrade(grade1: Int?) {
        this.grade1 = grade1
    }

    fun getName(): String? {
        return name1
    }

    fun setName(name1: String?) {
        this.name1 = name1
    }

    fun getPersonalAppraisalName(): String? {
        return personal_appraisal_name
    }

    fun setPersonalAppraisalName(personal_appraisal_name: String?) {
        this.personal_appraisal_name = personal_appraisal_name
    }

    fun getEvaluationStatus(): String? {
        return evaluation_status
    }

    fun setEvaluationStatus(evaluation_status: String?) {
        this.evaluation_status = evaluation_status
    }

    fun getSelfEvaluationId(): String? {
        return self_evaluation_id
    }

    fun setSelfEvaluationId(self_evaluation_id: String?) {
        this.self_evaluation_id = self_evaluation_id
    }

    fun getPrimaryEvaluationId(): String? {
        return primary_evaluation_id
    }

    fun setPrimaryEvaluationId(primary_evaluation_id: String?) {
        this.primary_evaluation_id = primary_evaluation_id
    }

    fun getSecondaryEvaluationId(): String? {
        return secondary_evaluation_id
    }

    fun setSecondaryEvaluationId(secondary_evaluation_id: String?) {
        this.secondary_evaluation_id = secondary_evaluation_id
    }

    fun getPrimarySecondaryEvaluationId(): String? {
        return primary_secondary_evaluation_id
    }

    fun setPrimarySecondaryEvaluationId(primary_secondary_evaluation_id: String?) {
        this.primary_secondary_evaluation_id = primary_secondary_evaluation_id
    }

    fun getSelfEvaluationFlg(): String? {
        return self_evaluation_flg
    }

    fun setSelfEvaluationFlg(self_evaluation_flg: String?) {
        this.self_evaluation_flg = self_evaluation_flg
    }

    fun getSelfEvaluationRank(): String? {
        return self_evaluation_rank
    }

    fun setSelfEvaluationRank(self_evaluation_rank: String?) {
        this.self_evaluation_rank = self_evaluation_rank
    }

    fun getSelfEvaluationTotalScore(): Long? {
        return self_evaluation_total_score
    }

    fun setSelfEvaluationTotalScore(self_evaluation_total_score: Long?) {
        this.self_evaluation_total_score = self_evaluation_total_score
    }

    fun getSelfEvaluationRankBonus(): String? {
        return self_evaluation_rank_bonus
    }

    fun setSelfEvaluationRankBonus(self_evaluation_rank_bonus: String?) {
        this.self_evaluation_rank_bonus = self_evaluation_rank_bonus
    }

    fun getSelfEvaluationTotalScoreBonus(): Long? {
        return self_evaluation_total_score_bonus
    }
    fun setSelfEvaluationTotalScoreBonus(self_evaluation_total_score_bonus: Long?) {
        this.self_evaluation_total_score_bonus = self_evaluation_total_score_bonus
    }

    fun getPrimaryEvaluationRank(): String? {
        return primary_evaluation_rank
    }
    fun setPrimaryEvaluationRank(primary_evaluation_rank: String?) {
        this.primary_evaluation_rank = primary_evaluation_rank
    }

    fun getPrimaryEvaluationTotalScore(): Long? {
        return primary_evaluation_total_score
    }

    fun setPrimaryEvaluationTotalScore(primary_evaluation_total_score: Long?) {
        this.primary_evaluation_total_score = primary_evaluation_total_score
    }

    fun getPrimaryEvaluationRankBonus(): String? {
        return primary_evaluation_rank_bonus
    }

    fun setPrimaryEvaluationRankBonus(primary_evaluation_rank_bonus: String?) {
        this.primary_evaluation_rank_bonus = primary_evaluation_rank_bonus
    }

    fun getprimaryEvaluationTotalScoreBonus(): Long? {
        return primary_evaluation_total_score_bonus
    }

    fun setprimaryEvaluationTotalScoreBonus(primary_evaluation_total_score_bonus: Long?) {
        this.primary_evaluation_total_score_bonus = primary_evaluation_total_score_bonus
    }

    fun getPrimaryEvaluatorEntryField(): String? {
        return primary_evaluator_entry_field
    }

    fun setPrimaryEvaluatorEntryField(primary_evaluator_entry_field: String?) {
        this.primary_evaluator_entry_field = primary_evaluator_entry_field
    }

    fun getPrimaryEvaluatorEntryDate(): String? {
        return primary_evaluator_entry_date
    }

    fun setPrimaryEvaluatorEntryDate(primary_evaluator_entry_date: String?) {
        this.primary_evaluator_entry_date = primary_evaluator_entry_date
    }

    fun getSecondaryEvaluationRank(): String? {
        return secondary_evaluation_rank
    }

    fun setSecondaryEvaluationRank(secondary_evaluation_rank: String?) {
        this.secondary_evaluation_rank = secondary_evaluation_rank
    }

    fun getSecondaryEvaluationTotalScore(): Long? {
        return secondary_evaluation_total_score
    }

    fun setSecondaryEvaluationTotalScore(secondary_evaluation_total_score: Long?) {
        this.secondary_evaluation_total_score = secondary_evaluation_total_score
    }

    fun getSecondaryEvaluationRankBonus(): String? {
        return secondary_evaluation_rank_bonus
    }

    fun setSecondaryEvaluationRankBonus(secondary_evaluation_rank_bonus: String?) {
        this.secondary_evaluation_rank_bonus = secondary_evaluation_rank_bonus
    }

    fun getSecondaryEvaluationTotalScoreBonus(): Long? {
        return secondary_evaluation_total_score_bonus
    }

    fun setSecondaryEvaluationTotalScoreBonus(secondary_evaluation_total_score_bonus: Long?) {
        this.secondary_evaluation_total_score_bonus = secondary_evaluation_total_score_bonus
    }

    fun getSecondaryEvaluatorEntryField(): String? {
        return secondary_evaluator_entry_field
    }

    fun setSecondaryEvaluatorEntryField(secondary_evaluator_entry_field: String?) {
        this.secondary_evaluator_entry_field = secondary_evaluator_entry_field
    }

    fun getSecondaryEvaluatorEntryDate(): String? {
        return secondary_evaluator_entry_date
    }

    fun setSecondaryEvaluatorEntryDate(secondary_evaluator_entry_date: String?) {
        this.secondary_evaluator_entry_date = secondary_evaluator_entry_date
    }

    fun getDepartAdjustRank(): String? {
        return depart_adjust_rank
    }

    fun setDepartAdjustRank(depart_adjust_rank: String?) {
        this.depart_adjust_rank = depart_adjust_rank
    }

    fun getDepartAdjustTotalScore(): Long? {
        return depart_adjust_total_score
    }

    fun setDepartAdjustTotalScore(depart_adjust_total_score: Long?) {
        this.depart_adjust_total_score = depart_adjust_total_score
    }

    fun getDepartAdjustRankBonus(): String? {
        return depart_adjust_rank_bonus
    }

    fun setDepartAdjustRankBonus(depart_adjust_rank_bonus: String?) {
        this.depart_adjust_rank_bonus = depart_adjust_rank_bonus
    }

    fun getDepartAdjustTotalScoreBonus(): Long? {
        return depart_adjust_total_score_bonus
    }

    fun setDepartAdjustTotalScoreBonus(depart_adjust_total_score_bonus: Long?) {
        this.depart_adjust_total_score_bonus = depart_adjust_total_score_bonus
    }

    fun getGrade1Item(): String? {
        return grade1_item
    }

    fun setGrade1Item(grade1_item: String?){
        this.grade1_item = grade1_item
    }

    fun getGrade1EvaluationPoints(): String? {
        return grade1_evaluation_points
    }

    fun setGrade1EvaluationPoints(grade1_evaluation_points: String?) {
        this.grade1_evaluation_points = grade1_evaluation_points
    }

    fun getGrade1WeightSalaryIncrease(): String? {
        return grade1_weight_salary_increase
    }

    fun setGrade1WeightSalaryIncrease(grade1_weight_salary_increase: String?) {
        this.grade1_weight_salary_increase = grade1_weight_salary_increase
    }

    fun getGrade1Weightbonus(): String? {
        return grade1_weight_bonus
    }

    fun setGrade1Weightbonus(grade1_weight_bonus: String?) {
        this.grade1_weight_bonus = grade1_weight_bonus
    }

    fun getGrade1SelfEvaluationPoints(): String? {
        return grade1_self_evaluation_points
    }

    fun setGrade1SelfEvaluationPoints(grade1_self_evaluation_points: String?) {
        this.grade1_self_evaluation_points = grade1_self_evaluation_points
    }

    fun getGrade1PrimaryEvaluationPoints(): String? {
        return grade1_primary_evaluation_points
    }

    fun setGrade1PrimaryEvaluationPoints(grade1_primary_evaluation_points: String?) {
        this.grade1_primary_evaluation_points = grade1_primary_evaluation_points
    }

    fun getGrade1SecondaryEvaluationPoints(): String? {
        return grade1_secondary_evaluation_points
    }

    fun setGrade1SecondaryEvaluationPoints(grade1_secondary_evaluation_points: String?) {
        this.grade1_secondary_evaluation_points = grade1_secondary_evaluation_points
    }

    fun getGrade1DepartAdjustPoints(): String? {
        return grade1_depart_adjust_points
    }

    fun setGrade1DepartAdjustPoints(grade1_depart_adjust_points: String?) {
        this.grade1_depart_adjust_points = grade1_depart_adjust_points
    }

    fun getGrade2Item(): String? {
        return grade2_item
    }

    fun setGrade2Item(grade2_item: String?) {
        this.grade2_item = grade2_item
    }

    fun getGrade2EvaluationPoints(): String? {
        return grade2_evaluation_points
    }

    fun setGrade2EvaluationPoints(grade2_evaluation_points: String?) {
        this.grade2_evaluation_points = grade2_evaluation_points
    }

    fun getGrade2WeightSalaryIncrease(): String? {
        return grade2_weight_salary_increase
    }

    fun setGrade2WeightSalaryIncrease(grade2_weight_salary_increase: String?) {
        this.grade2_weight_salary_increase = grade2_weight_salary_increase
    }

    fun getGrade2WeightBonus(): String? {
        return grade2_weight_bonus
    }

    fun setGrade2WeightBonus(grade2_weight_bonus: String?) {
        this.grade2_weight_bonus = grade2_weight_bonus
    }

    fun getGrade2SelfEvaluationPoints(): String? {
        return grade2_self_evaluation_points
    }

    fun setGrade2SelfEvaluationPoints(grade2_self_evaluation_points: String?) {
        this.grade2_self_evaluation_points = grade2_self_evaluation_points
    }

    fun getGrade2PrimaryEvaluationPoints(): String? {
        return grade2_primary_evaluation_points
    }

    fun setGrade2PrimaryEvaluationPoints(grade2_primary_evaluation_points: String?) {
        this.grade2_primary_evaluation_points = grade2_primary_evaluation_points
    }

    fun getGrade2SecondaryEvaluationPoints(): String? {
        return grade2_secondary_evaluation_points
    }

    fun setGrade2SecondaryEvaluationPoints(): String? {
        return grade2_secondary_evaluation_points
    }

    fun getGrade2DepartAdjustPoints(): String? {
        return grade2_depart_adjust_points
    }

    fun setGrade2DepartAdjustPoints(grade2_depart_adjust_points: String?) {
        this.grade2_depart_adjust_points = grade2_depart_adjust_points
    }

    fun getGrade3Item(): String? {
        return grade3_item
    }

    fun setGrade3Item(grade3_item: String?) {
        this.grade3_item = grade3_item
    }

    fun getGrade3EvaluationPoints(): String? {
        return grade3_evaluation_points
    }

    fun setGrade3EvaluationPoints(grade3_evaluation_points: String?) {
        this.grade3_evaluation_points = grade3_evaluation_points
    }

    fun getgrade3WeightSalaryIncrease(): String? {
        return grade3_weight_salary_increase
    }

    fun setgrade3WeightSalaryIncrease(grade3_weight_salary_increase: String?) {
        this.grade3_weight_salary_increase = grade3_weight_salary_increase
    }

    fun getGrade3WeightBonus(): String? {
        return grade3_weight_bonus
    }

    fun setGrade3WeightBonus(grade3_weight_bonus: String?) {
        this.grade3_weight_bonus = grade3_weight_bonus
    }

    fun getGrade3SelfEvaluationPoints(): String? {
        return grade3_self_evaluation_points
    }

    fun setGrade3SelfEvaluationPoints(grade3_self_evaluation_points: String?) {
        this.grade3_self_evaluation_points = grade3_self_evaluation_points
    }

    fun getGrade3PrimaryEvaluationPoints(): String? {
        return grade3_primary_evaluation_points
    }

    fun setGrade3PrimaryEvaluationPoints(grade3_primary_evaluation_points: String?) {
        this.grade3_primary_evaluation_points = grade3_primary_evaluation_points
    }

    fun getGrade3SecondaryEvaluationPoints(): String? {
        return grade3_secondary_evaluation_points
    }

    fun setGrade3SecondaryEvaluationPoints(grade3_secondary_evaluation_points: String?) {
        this.grade3_secondary_evaluation_points = grade3_secondary_evaluation_points
    }

    fun getGrade3DepartAdjustPoints(): String? {
        return grade3_depart_adjust_points
    }

    fun setGrade3DepartAdjustPoints(grade3_depart_adjust_points: String?) {
        this.grade3_depart_adjust_points = grade3_depart_adjust_points
    }

    fun getGrade4Item(): String? {
        return grade4_item
    }

    fun setGrade4Item(grade4_item: String?) {
        this.grade4_item = grade4_item
    }

    fun getGrade4EvaluationPoints(): String? {
        return grade4_evaluation_points
    }

    fun setGrade4EvaluationPoints(grade4_evaluation_points: String?) {
        this.grade4_evaluation_points = grade4_evaluation_points
    }

    fun getGrade4WeightSalaryIncrease(): String? {
        return grade4_weight_salary_increase
    }

    fun setGrade4WeightSalaryIncrease(grade4_weight_salary_increase: String?) {
        this.grade4_weight_salary_increase = grade4_weight_salary_increase
    }

    fun getGrade4WeightBonus(): String? {
        return grade4_weight_bonus
    }

    fun setGrade4WeightBonus(grade4_weight_bonus: String?) {
        this.grade4_weight_bonus = grade4_weight_bonus
    }

    fun getGrade4SelfEvaluationPoints(): String? {
        return grade4_self_evaluation_points
    }

    fun setGrade4SelfEvaluationPoints(grade4_self_evaluation_points: String?) {
        this.grade4_self_evaluation_points = grade4_self_evaluation_points
    }

    fun getGrade4PrimaryEvaluationPoints(): String? {
        return grade4_primary_evaluation_points
    }

    fun setGrade4PrimaryEvaluationPoints(grade4_primary_evaluation_points: String?) {
        this.grade4_primary_evaluation_points = grade4_primary_evaluation_points
    }

    fun getGrade4SecondaryEvaluationPoints(): String? {
        return grade4_secondary_evaluation_points
    }

    fun setGrade4SecondaryEvaluationPoints(grade4_secondary_evaluation_points: String?) {
        this.grade4_secondary_evaluation_points = grade4_secondary_evaluation_points
    }

    fun getGrade4DepartAdjustPoints(): String? {
        return grade4_depart_adjust_points
    }

    fun setGrade4DepartAdjustPoints(grade4_depart_adjust_points: String?) {
        this.grade4_depart_adjust_points = grade4_depart_adjust_points
    }

    fun getGrade5Item(): String? {
        return grade5_item
    }

    fun setGrade5Item(grade5_item: String?) {
        this.grade5_item = grade5_item
    }

    fun getGrade5EvaluationPoints(): String? {
        return grade5_evaluation_points
    }

    fun setGrade5EvaluationPoints(grade5_evaluation_points: String?) {
        this.grade5_evaluation_points = grade5_evaluation_points
    }

    fun getGrade5WeightSalaryIncrease(): String? {
        return grade5_weight_salary_increase
    }

    fun setGrade5WeightSalaryIncrease(grade5_weight_salary_increase: String?) {
        this.grade5_weight_salary_increase = grade5_weight_salary_increase
    }

    fun getGrade5WeightBonus(): String? {
        return grade5_weight_bonus
    }
    fun setGrade5WeightBonus(grade5_weight_bonus: String?) {
        this.grade5_weight_bonus = grade5_weight_bonus
    }

    fun getGrade5SelfEvaluationPoints(): String? {
        return grade5_self_evaluation_points
    }
    fun setGrade5SelfEvaluationPoints(grade5_self_evaluation_points: String?) {
        this.grade5_self_evaluation_points = grade5_self_evaluation_points
    }


    fun getGrade5PrimaryEvaluationPoints(): String? {
        return grade5_primary_evaluation_points
    }
    fun setGrade5PrimaryEvaluationPoints(grade5_primary_evaluation_points: String?) {
        this.grade5_primary_evaluation_points = grade5_primary_evaluation_points
    }

    fun getGrade5SecondaryEvaluationPoints(): String? {
        return grade5_secondary_evaluation_points
    }
    fun setGrade5SecondaryEvaluationPoints(grade5_secondary_evaluation_points: String?) {
        this.grade5_secondary_evaluation_points = grade5_secondary_evaluation_points
    }

    fun getGrade5DepartAdjustPoints(): String? {
        return grade5_depart_adjust_points
    }
    fun setGrade5DepartAdjustPoints(grade5_depart_adjust_points: String?) {
        this.grade5_depart_adjust_points = grade5_depart_adjust_points
    }

    fun getability1Item(): String? {
        return ability1_item
    }
    fun setability1Item(ability1_item: String?) {
        this.ability1_item = ability1_item
    }

    fun getAbility1EvaluationPoints(): String? {
        return ability1_evaluation_points
    }
    fun setAbility1EvaluationPoints(ability1_evaluation_points: String?) {
        this.ability1_evaluation_points = ability1_evaluation_points
    }

    fun getAbility1WeightSalaryIncrease(): String? {
        return ability1_weight_salary_increase
    }
    fun setAbility1WeightSalaryIncrease(ability1_weight_salary_increase: String?) {
        this.ability1_weight_salary_increase = ability1_weight_salary_increase
    }

    fun getAbility1WeightBonus(): String? {
        return ability1_weight_bonus
    }

    fun setAbility1WeightBonus(ability1_weight_bonus: String?) {
        this.ability1_weight_bonus = ability1_weight_bonus
    }

    fun getAbility1SelfEvaluationPoints(): String? {
        return ability1_self_evaluation_points
    }
    fun setAbility1SelfEvaluationPoints(ability1_self_evaluation_points: String?) {
        this.ability1_self_evaluation_points = ability1_self_evaluation_points
    }

    fun getAbility1PrimaryEvaluationPoints(): String? {
        return ability1_primary_evaluation_points
    }
    fun setAbility1PrimaryEvaluationPoints(ability1_primary_evaluation_points: String?) {
        this.ability1_primary_evaluation_points = ability1_primary_evaluation_points
    }

    fun getAbility1SecondaryEvaluationPoints(): String? {
        return ability1_secondary_evaluation_points
    }
    fun setAbility1SecondaryEvaluationPoints(ability1_secondary_evaluation_points: String?) {
        this.ability1_secondary_evaluation_points = ability1_secondary_evaluation_points
    }

    fun getAbility1DepartAdjustPoints(): String? {
        return ability1_depart_adjust_points
    }
    fun setAbility1DepartAdjustPoints(ability1_depart_adjust_points: String?) {
        this.ability1_depart_adjust_points = ability1_depart_adjust_points
    }

    fun getAbility2Item(): String? {
        return ability2_item
    }

    fun setAbility2Item(ability2_item: String?) {
        this.ability2_item = ability2_item
    }

    fun getAbility2EvaluationPoints(): String? {
        return ability2_evaluation_points
    }

    fun getAbility2EvaluationPoints(ability2_evaluation_points: String?) {
        this.ability2_evaluation_points = ability2_evaluation_points
    }

    fun getAbility2WeightSalaryIncrease(): String? {
        return ability2_weight_salary_increase
    }

    fun setAbility2WeightSalaryIncrease(ability2_weight_salary_increase: String?) {
        this.ability2_weight_salary_increase = ability2_weight_salary_increase
    }

    fun getAbility2WeightBonus(): String? {
        return ability2_weight_bonus
    }

    fun setAbility2WeightBonus(ability2_weight_bonus: String?) {
        this.ability2_weight_bonus = ability2_weight_bonus
    }

    fun getAbility2SelfEvaluationPoints(): String? {
        return ability2_self_evaluation_points
    }
    fun setAbility2SelfEvaluationPoints(ability2_self_evaluation_points: String?) {
        this.ability2_self_evaluation_points = ability2_self_evaluation_points
    }

    fun getAbility2PrimaryEvaluationPoints(): String? {
        return ability2_primary_evaluation_points
    }

    fun setAbility2PrimaryEvaluationPoints(ability2_primary_evaluation_points: String?) {
        this.ability2_primary_evaluation_points = ability2_primary_evaluation_points
    }

    fun getAbility2SecondaryEvaluationPoints(): String? {
        return ability2_secondary_evaluation_points
    }
    fun setAbility2SecondaryEvaluationPoints(ability2_secondary_evaluation_points: String?) {
        this.ability2_secondary_evaluation_points = ability2_secondary_evaluation_points
    }

    fun getAbility2DepartAdjustPoints(): String? {
        return ability2_depart_adjust_points
    }
    fun setAbility2DepartAdjustPoints(ability2_depart_adjust_points: String?) {
        this.ability2_depart_adjust_points = ability2_depart_adjust_points
    }

    fun getAbility3Item(): String? {
        return ability3_item
    }
    fun setAbility3Item(ability3_item: String?) {
        this.ability3_item = ability3_item
    }

    fun getAbility3EvaluationPoints(): String? {
        return ability3_evaluation_points
    }
    fun setAbility3EvaluationPoints(ability3_evaluation_points: String?) {
        this.ability3_evaluation_points = ability3_evaluation_points
    }

    fun getability3WeightSalaryIncrease(): String? {
        return ability3_weight_salary_increase
    }
    fun setability3WeightSalaryIncrease(ability3_weight_salary_increase: String?) {
        this.ability3_weight_salary_increase = ability3_weight_salary_increase
    }

    fun getAbility3WeightBonus(): String? {
        return ability3_weight_bonus
    }
    fun setAbility3WeightBonus(ability3_weight_bonus: String?) {
        this.ability3_weight_bonus = ability3_weight_bonus
    }

    fun getAbility3SelfEvaluationPoints(): String? {
        return ability3_self_evaluation_points
    }
    fun setAbility3SelfEvaluationPoints(tability3_self_evaluation_points: String?) {
        this.ability3_self_evaluation_points = ability3_self_evaluation_points
    }

    fun getability3PrimaryEvaluationPoints(): String? {
        return ability3_primary_evaluation_points
    }
    fun setability3PrimaryEvaluationPoints(ability3_primary_evaluation_points: String?) {
        this.ability3_primary_evaluation_points = ability3_primary_evaluation_points
    }

    fun getAbility3SecondaryEvaluationPoints(): String? {
        return ability3_secondary_evaluation_points
    }
    fun setAbility3SecondaryEvaluationPoints(ability3_secondary_evaluation_points: String?) {
        this.ability3_secondary_evaluation_points = ability3_secondary_evaluation_points
    }

    fun getAbility3DepartAdjustPoints(): String? {
        return ability3_depart_adjust_points
    }
    fun setAbility3DepartAdjustPoints(ability3_depart_adjust_points: String?) {
        this.ability3_depart_adjust_points = ability3_depart_adjust_points
    }

    fun getAbility4Item(): String? {
        return ability4_item
    }
    fun setAbility4Item(ability4_item: String?) {
        this.ability4_item = ability4_item
    }

    fun getAbility4EvaluationPoints(): String? {
        return ability4_evaluation_points
    }
    fun setAbility4EvaluationPoints(ability4_evaluation_points: String?) {
        this.ability4_evaluation_points = ability4_evaluation_points
    }

    fun getAbility4WeightSalaryIncrease(): String? {
        return ability4_weight_salary_increase
    }

    fun setAbility4WeightSalaryIncrease(ability4_weight_salary_increase: String?) {
        this.ability4_weight_salary_increase = ability4_weight_salary_increase
    }

    fun getAbility4WeightBonus(): String? {
        return ability4_weight_bonus
    }
    fun setAbility4WeightBonus(ability4_weight_bonus: String?) {
        this.ability4_weight_bonus = ability4_weight_bonus
    }

    fun getAbility4SelfEvaluationPoints(): String? {
        return ability4_self_evaluation_points
    }
    fun setAbility4SelfEvaluationPoints(ability4_self_evaluation_points: String?) {
        this.ability4_self_evaluation_points = ability4_self_evaluation_points
    }

    fun getAbility4PrimaryEvaluationPoints(): String? {
        return ability4_primary_evaluation_points
    }
    fun setAbility4PrimaryEvaluationPoints(ability4_primary_evaluation_points: String?) {
        this.ability4_primary_evaluation_points = ability4_primary_evaluation_points
    }

    fun getAbility4SecondaryEvaluationPoints(): String? {
        return ability4_secondary_evaluation_points
    }
    fun setAbility4SecondaryEvaluationPoints(ability4_secondary_evaluation_points: String?) {
        this.ability4_secondary_evaluation_points = ability4_secondary_evaluation_points
    }

    fun getAbility4DepartAdjustPoints(): String? {
        return ability4_depart_adjust_points
    }
    fun setAbility4DepartAdjustPoints(ability4_depart_adjust_points: String?) {
        this.ability4_depart_adjust_points = ability4_depart_adjust_points
    }

    fun getApproachAttitude1Item(): String? {
        return approach_attitude1_item
    }
    fun setApproachAttitude1Item(approach_attitude1_item: String?) {
        this.approach_attitude1_item = approach_attitude1_item
    }

    fun getApproachAttitude1EvaluationPoints(): String? {
        return approach_attitude1_evaluation_points
    }
    fun setApproachAttitude1EvaluationPoints(approach_attitude1_evaluation_points: String?) {
        this.approach_attitude1_evaluation_points = approach_attitude1_evaluation_points
    }

    fun getApproachAttitude1WeightSalaryIncrease(): String? {
        return approach_attitude1_weight_salary_increase
    }
    fun setApproachAttitude1WeightSalaryIncrease(approach_attitude1_weight_salary_increase: String?) {
        this.approach_attitude1_weight_salary_increase = approach_attitude1_weight_salary_increase
    }

    fun getapproachAttitude1WeightBonus(): String? {
        return approach_attitude1_weight_bonus
    }
    fun setapproachAttitude1WeightBonus(approach_attitude1_weight_bonus: String?) {
        this.approach_attitude1_weight_bonus = approach_attitude1_weight_bonus
    }

    fun getApproachAttitude1SelfEvaluationPoints(): String? {
        return approach_attitude1_self_evaluation_points
    }
    fun setApproachAttitude1SelfEvaluationPoints(approach_attitude1_self_evaluation_points: String?) {
        this.approach_attitude1_self_evaluation_points = approach_attitude1_self_evaluation_points
    }

    fun getApproachAttitude1PrimaryEvaluationPoints(): String? {
        return approach_attitude1_primary_evaluation_points
    }
    fun setApproachAttitude1PrimaryEvaluationPoints(approach_attitude1_primary_evaluation_points: String?) {
        this.approach_attitude1_primary_evaluation_points = approach_attitude1_primary_evaluation_points
    }

    fun getApproachAttitude1SecondaryEvaluationPoints(): String? {
        return approach_attitude1_secondary_evaluation_points
    }
    fun setApproachAttitude1SecondaryEvaluationPoints(approach_attitude1_secondary_evaluation_points: String?) {
        this.approach_attitude1_secondary_evaluation_points = approach_attitude1_secondary_evaluation_points
    }

    fun getApproachAttitude1DepartAdjustPoints(): String? {
        return approach_attitude1_depart_adjust_points
    }
    fun setApproachAttitude1DepartAdjustPoints(approach_attitude1_depart_adjust_points: String?) {
        this.approach_attitude1_depart_adjust_points = approach_attitude1_depart_adjust_points
    }

    fun getApproachAttitude2Item(): String? {
        return approach_attitude2_item
    }
    fun setApproachAttitude2Item(approach_attitude2_item: String?) {
        this.approach_attitude2_item = approach_attitude2_item
    }

    fun getApproachAttitude2EvaluationPoints(): String? {
        return approach_attitude2_evaluation_points
    }
    fun setApproachAttitude2EvaluationPoints(approach_attitude2_evaluation_points: String?) {
        this.approach_attitude2_evaluation_points = approach_attitude2_evaluation_points
    }

    fun getApproachAttitude2WeightSalaryIncrease(): String? {
        return approach_attitude2_weight_salary_increase
    }
    fun setApproachAttitude2WeightSalaryIncrease(approach_attitude2_weight_salary_increase: String?) {
        this.approach_attitude2_weight_salary_increase = approach_attitude2_weight_salary_increase
    }

    fun getApproachAttitude2WeightBonus(): String? {
        return approach_attitude2_weight_bonus
    }
    fun setApproachAttitude2WeightBonus(approach_attitude2_weight_bonus: String?) {
        this.approach_attitude2_weight_bonus = approach_attitude2_weight_bonus
    }

    fun getApproachAttitude2SelfEvaluationPoints(): String? {
        return approach_attitude2_self_evaluation_points
    }
    fun setApproachAttitude2SelfEvaluationPoints(approach_attitude2_self_evaluation_points: String?) {
        this.approach_attitude2_self_evaluation_points = approach_attitude2_self_evaluation_points
    }

    fun getApproachAttitude2PrimaryEvaluationPoints(): String? {
        return approach_attitude2_primary_evaluation_points
    }
    fun setApproachAttitude2PrimaryEvaluationPoints(approach_attitude2_primary_evaluation_points: String?) {
        this.approach_attitude2_primary_evaluation_points = approach_attitude2_primary_evaluation_points
    }

    fun getApproachAttitude2SecondaryEvaluationPoints(): String? {
        return approach_attitude2_secondary_evaluation_points
    }
    fun setApproachAttitude2SecondaryEvaluationPoints(approach_attitude2_secondary_evaluation_points: String?) {
        this.approach_attitude2_secondary_evaluation_points = approach_attitude2_secondary_evaluation_points
    }

    fun getApproachAttitude2DepartAdjustPoints(): String? {
        return approach_attitude2_depart_adjust_points
    }
    fun setApproachAttitude2DepartAdjustPoints(approach_attitude2_depart_adjust_points: String?) {
        this.approach_attitude2_depart_adjust_points = approach_attitude2_depart_adjust_points
    }

    fun getApproachAttitude3Item(): String? {
        return approach_attitude3_item
    }

    fun setApproachAttitude3Item(approach_attitude3_item: String?) {
        this.approach_attitude3_item = approach_attitude3_item
    }
    fun getApproachAttitude3EvaluationPoints(): String? {
        return approach_attitude3_evaluation_points
    }
    fun setApproachAttitude3EvaluationPoints(approach_attitude3_evaluation_points: String?) {
        this.approach_attitude3_evaluation_points = approach_attitude3_evaluation_points
    }

    fun getApproachAttitude3WeightSalaryIncrease(): String? {
        return approach_attitude3_weight_salary_increase
    }
    fun setApproachAttitude3WeightSalaryIncrease(approach_attitude3_weight_salary_increase: String?) {
        this.approach_attitude3_weight_salary_increase = approach_attitude3_weight_salary_increase
    }

    fun getApproachAttitude3WeightBonus(): String? {
        return approach_attitude3_weight_bonus
    }
    fun setApproachAttitude3WeightBonus(approach_attitude3_weight_bonus: String?) {
        this.approach_attitude3_weight_bonus = approach_attitude3_weight_bonus
    }

    fun getApproachAttitude3SelfEvaluationPoints(): String? {
        return approach_attitude3_self_evaluation_points
    }
    fun setApproachAttitude3SelfEvaluationPoints(approach_attitude3_self_evaluation_points: String?) {
        this.approach_attitude3_self_evaluation_points = approach_attitude3_self_evaluation_points
    }

    fun getApproachAttitude3PrimaryEvaluationPoints(): String? {
        return approach_attitude3_primary_evaluation_points
    }
    fun setApproachAttitude3PrimaryEvaluationPoints(approach_attitude3_primary_evaluation_points: String?) {
        this.approach_attitude3_primary_evaluation_points = approach_attitude3_primary_evaluation_points
    }

    fun getApproachAttitude3SecondaryEvaluationPoints(): String? {
        return approach_attitude3_secondary_evaluation_points
    }
    fun setApproachAttitude3SecondaryEvaluationPoints(approach_attitude3_secondary_evaluation_points: String?) {
        this.approach_attitude3_secondary_evaluation_points = approach_attitude3_secondary_evaluation_points
    }

    fun getApproachAttitude3DepartAdjustPoints(): String? {
        return approach_attitude3_depart_adjust_points
    }
    fun setApproachAttitude3DepartAdjustPoints(approach_attitude3_depart_adjust_points: String?) {
        this.approach_attitude3_depart_adjust_points = approach_attitude3_depart_adjust_points
    }

    fun getApproachAttitude4Item(): String? {
        return approach_attitude4_item
    }
    fun setApproachAttitude4Item(approach_attitude4_item: String?) {
        this.approach_attitude4_item = approach_attitude4_item
    }

    fun getApproachAttitude4EvaluationPoints(): String? {
        return approach_attitude4_evaluation_points
    }
    fun setApproachAttitude4EvaluationPoints(approach_attitude4_evaluation_points: String?) {
        this.approach_attitude4_evaluation_points = approach_attitude4_evaluation_points
    }

    fun getApproachAttitude4WeightSalaryIncrease(): String? {
        return approach_attitude4_weight_salary_increase
    }
    fun setApproachAttitude4WeightSalaryIncrease(approach_attitude4_weight_salary_increase: String?) {
        this.approach_attitude4_weight_salary_increase = approach_attitude4_weight_salary_increase
    }

    fun getApproachAttitude4WeightBonus(): String? {
        return approach_attitude4_weight_bonus
    }
    fun setApproachAttitude4WeightBonus(approach_attitude4_weight_bonus: String?) {
        this.approach_attitude4_weight_bonus = approach_attitude4_weight_bonus
    }

    fun getApproachAttitude4SelfEvaluationPoints(): String? {
        return approach_attitude4_self_evaluation_points
    }
    fun setApproachAttitude4SelfEvaluationPoints(approach_attitude4_self_evaluation_points: String?) {
        this.approach_attitude4_self_evaluation_points = approach_attitude4_self_evaluation_points
    }

    fun getApproachAttitude4PrimaryEvaluationPoints(): String? {
        return approach_attitude4_primary_evaluation_points
    }
    fun setApproachAttitude4PrimaryEvaluationPoints(approach_attitude4_primary_evaluation_points: String?) {
        this.approach_attitude4_primary_evaluation_points = approach_attitude4_primary_evaluation_points
    }

    fun getApproachAttitude4SecondaryEvaluationPoints(): String? {
        return approach_attitude4_secondary_evaluation_points
    }
    fun setApproachAttitude4SecondaryEvaluationPoints(approach_attitude4_secondary_evaluation_points: String?) {
        this.approach_attitude4_secondary_evaluation_points = approach_attitude4_secondary_evaluation_points
    }

    fun getApproachAttitude4DepartAdjustPoints(): String? {
        return approach_attitude4_depart_adjust_points
    }
    fun setApproachAttitude4DepartAdjustPoints(approach_attitude4_depart_adjust_points: String?) {
        this.approach_attitude4_depart_adjust_points = approach_attitude4_depart_adjust_points
    }

    fun getPrimarySecondaryEvaluationFlg(): String? {
        return primary_secondary_evaluation_flg
    }
    fun setPrimarySecondaryEvaluationFlg(primary_secondary_evaluation_flg : String?) {
        this.primary_secondary_evaluation_flg = primary_secondary_evaluation_flg
    }

    fun getEvaluationUpdateFlg(): String? {
        return evaluation_update_flg
    }
    fun setEvaluationUpdateFlg(evaluation_update_flg: String?) {
        this.evaluation_update_flg = evaluation_update_flg
    }

    fun getDepartAdjustId(): String? {
        return depart_adjust_id
    }
    fun setDepartAdjustId(depart_adjust_id: String?) {
        this.depart_adjust_id = depart_adjust_id
    }

    fun getRetireFlg(): Boolean? {
        return retire_flg
    }
    fun setRetireFlg(retire_flg: Boolean?) {
        this.retire_flg = retire_flg
    }

    fun getAppraisalAuthority(): String? {
        return appraisal_authority
    }
    fun setAppraisalAuthority(appraisal_authority: String?) {
        this.appraisal_authority = appraisal_authority
    }

    fun getSystemCreateAuthority(): String? {
        return system_create_authority
    }
    fun setSystemCreateAuthority(system_create_authority: String?) {
        this.system_create_authority = system_create_authority
    }

    fun getBirthday1(): String? {
        return birthday
    }

    fun setBirthday1(birthday: String?) {
        this.birthday = birthday
    }

    fun getCompanyEntryDate(): String? {
        return company_entry_date
    }
    fun setCompanyEntryDate(company_entry_date: String?) {
        this.company_entry_date = company_entry_date
    }

    fun getDeleteCategory(): String? {
        return delete_category
    }
    fun setDeleteCategory(delete_category: String?) {
        this.delete_category = delete_category
    }

    fun getPrimaryEvaluationAuthority(): String? {
        return primary_evaluation_authority
    }
    fun setPrimaryEvaluationAuthority(primary_evaluation_authority: String?) {
        this.primary_evaluation_authority = primary_evaluation_authority
    }

    fun getSecondaryEvaluationAuthority(): String? {
        return secondary_evaluation_authority
    }
    fun setSecondaryEvaluationAuthority(secondary_evaluation_authority: String?) {
        this.secondary_evaluation_authority = secondary_evaluation_authority
    }

    fun getServicePeriodYear(): String? {
        return service_period_year
    }
    fun setServicePeriodYear(service_period_year: String?) {
        this.service_period_year = service_period_year
    }

    fun getServicePeriodMonth(): String? {
        return service_period_month
    }
    fun setServicePeriodMonth(service_period_month: String?) {
        this.service_period_month = service_period_month
    }

    fun getDisplayPrimaryEvaluationName(): String? {
        return display_primary_evaluation_name
    }

    fun setDisplayPrimaryEvaluationName(display_primary_evaluation_name: String?) {
        this.display_primary_evaluation_name = display_primary_evaluation_name
    }

    fun getDisplaySecondaryEvaluationName(): String? {
        return display_secondary_evaluation_name
    }
    fun setDisplaySecondaryEvaluationName(display_secondary_evaluation_name: String?) {
        this.display_secondary_evaluation_name = display_secondary_evaluation_name
    }

    fun getDisplayPrimarySecondaryEvaluationName(): String? {
        return display_primary_secondary_evaluation_name
    }
    fun setDisplayPrimarySecondaryEvaluationName(display_primary_secondary_evaluation_name: String?) {
        this.display_primary_secondary_evaluation_name = display_primary_secondary_evaluation_name
    }

    fun getDisplayDepartAdjustEvaluationName(): String? {
        return display_depart_adjust_evaluation_name
    }
    fun setDisplayDepartAdjustEvaluationName(display_depart_adjust_evaluation_name: String?) {
        this.display_depart_adjust_evaluation_name = display_depart_adjust_evaluation_name
    }

    fun getDisplayDataStatus(): String? {
        return display_data_status
    }
    fun setDisplayDataStatus(display_data_status: String?) {
        this.display_data_status = display_data_status
    }

    fun getDisplaySelectionFlg(): Boolean? {
        return display_selection_flg
    }
    fun setDisplaySelectionFlg(display_selection_flg: Boolean?) {
        this.display_selection_flg = display_selection_flg
    }

    fun getWorkFlg(): Boolean? {
        return work_flg
    }
    fun setWorkFlg(work_flg: Boolean?) {
        this.work_flg = work_flg
    }

    constructor(
        register_datetime : String?
        ,update_datetime : String?
        ,approver_id : String?
        ,password1: String?
        ,employee_cd : String?
        ,mail_address : String?
        ,personal_flg : String?
        ,illegal_address_flg : String?
        ,mobile_domain_flg : String?
        ,double_flg : String?
        ,deliver_err_count : String?
        ,user_ip_address : String?
        ,user_agent : String?
        ,update_delete_key : String?
        ,belong_cd : Int?
        ,belong1 : String?
        ,admin_flg : Boolean?
        ,job_cd : Int?
        ,officer : String?
        ,grade1 : Int?
        ,name1 : String?
        ,personal_appraisal_name : String?
        ,evaluation_status : String?
        ,self_evaluation_id : String?
        ,primary_evaluation_id : String?
        ,secondary_evaluation_id : String?
        ,primary_secondary_evaluation_id : String?
        ,self_evaluation_flg : String?
        ,self_evaluation_rank : String?
        ,self_evaluation_total_score : Long?
        ,self_evaluation_rank_bonus : String?
        ,self_evaluation_total_score_bonus : Long?
        ,primary_evaluation_rank : String?
        ,primary_evaluation_total_score : Long?
        ,primary_evaluation_rank_bonus : String?
        ,primary_evaluation_total_score_bonus : Long?
        ,primary_evaluator_entry_field : String?
        ,primary_evaluator_entry_date : String?
        ,secondary_evaluation_rank : String?
        ,secondary_evaluation_total_score : Long?
        ,secondary_evaluation_rank_bonus : String?
        ,secondary_evaluation_total_score_bonus : Long?
        ,secondary_evaluator_entry_field : String?
        ,secondary_evaluator_entry_date : String?
        ,depart_adjust_rank : String?
        ,depart_adjust_total_score : Long?
        ,depart_adjust_rank_bonus : String?
        ,depart_adjust_total_score_bonus : Long?
        ,grade1_item : String?
        ,grade1_evaluation_points : String?
        ,grade1_weight_salary_increase : String?
        ,grade1_weight_bonus : String?
        ,grade1_self_evaluation_points : String?
        ,grade1_primary_evaluation_points : String?
        ,grade1_secondary_evaluation_points : String?
        ,grade1_depart_adjust_points : String?
        ,grade2_item : String?
        ,grade2_evaluation_points : String?
        ,grade2_weight_salary_increase : String?
        ,grade2_weight_bonus : String?
        ,grade2_self_evaluation_points : String?
        ,grade2_primary_evaluation_points : String?
        ,grade2_secondary_evaluation_points : String?
        ,grade2_depart_adjust_points : String?
        ,grade3_item : String?
        ,grade3_evaluation_points : String?
        ,grade3_weight_salary_increase : String?
        ,grade3_weight_bonus : String?
        ,grade3_self_evaluation_points : String?
        ,grade3_primary_evaluation_points : String?
        ,grade3_secondary_evaluation_points : String?
        ,grade3_depart_adjust_points : String?
        ,grade4_item : String?
        ,grade4_evaluation_points : String?
        ,grade4_weight_salary_increase : String?
        ,grade4_weight_bonus : String?
        ,grade4_self_evaluation_points : String?
        ,grade4_primary_evaluation_points : String?
        ,grade4_secondary_evaluation_points : String?
        ,grade4_depart_adjust_points : String?
        ,grade5_item : String?
        ,grade5_evaluation_points : String?
        ,grade5_weight_salary_increase : String?
        ,grade5_weight_bonus : String?
        ,grade5_self_evaluation_points : String?
        ,grade5_primary_evaluation_points : String?
        ,grade5_secondary_evaluation_points : String?
        ,grade5_depart_adjust_points : String?
        ,ability1_item : String?
        ,ability1_evaluation_points : String?
        ,ability1_weight_salary_increase : String?
        ,ability1_weight_bonus : String?
        ,ability1_self_evaluation_points : String?
        ,ability1_primary_evaluation_points : String?
        ,ability1_secondary_evaluation_points : String?
        ,ability1_depart_adjust_points : String?
        ,ability2_item : String?
        ,ability2_evaluation_points : String?
        ,ability2_weight_salary_increase : String?
        ,ability2_weight_bonus : String?
        ,ability2_self_evaluation_points : String?
        ,ability2_primary_evaluation_points : String?
        ,ability2_secondary_evaluation_points : String?
        ,ability2_depart_adjust_points : String?
        ,ability3_item : String?
        ,ability3_evaluation_points : String?
        ,ability3_weight_salary_increase : String?
        ,ability3_weight_bonus : String?
        ,ability3_self_evaluation_points : String?
        ,ability3_primary_evaluation_points : String?
        ,ability3_secondary_evaluation_points : String?
        ,ability3_depart_adjust_points : String?
        ,ability4_item : String?
        ,ability4_evaluation_points : String?
        ,ability4_weight_salary_increase : String?
        ,ability4_weight_bonus : String?
        ,ability4_self_evaluation_points : String?
        ,ability4_primary_evaluation_points : String?
        ,ability4_secondary_evaluation_points : String?
        ,ability4_depart_adjust_points : String?
        ,approach_attitude1_item : String?
        ,approach_attitude1_evaluation_points : String?
        ,approach_attitude1_weight_salary_increase : String?
        ,approach_attitude1_weight_bonus : String?
        ,approach_attitude1_self_evaluation_points : String?
        ,approach_attitude1_primary_evaluation_points : String?
        ,approach_attitude1_secondary_evaluation_points : String?
        ,approach_attitude1_depart_adjust_points : String?
        ,approach_attitude2_item : String?
        ,approach_attitude2_evaluation_points : String?
        ,approach_attitude2_weight_salary_increase : String?
        ,approach_attitude2_weight_bonus : String?
        ,approach_attitude2_self_evaluation_points : String?
        ,approach_attitude2_primary_evaluation_points : String?
        ,approach_attitude2_secondary_evaluation_points : String?
        ,approach_attitude2_depart_adjust_points : String?
        ,approach_attitude3_item : String?
        ,approach_attitude3_evaluation_points : String?
        ,approach_attitude3_weight_salary_increase : String?
        ,approach_attitude3_weight_bonus : String?
        ,approach_attitude3_self_evaluation_points : String?
        ,approach_attitude3_primary_evaluation_points : String?
        ,approach_attitude3_secondary_evaluation_points : String?
        ,approach_attitude3_depart_adjust_points : String?
        ,approach_attitude4_item : String?
        ,approach_attitude4_evaluation_points : String?
        ,approach_attitude4_weight_salary_increase : String?
        ,approach_attitude4_weight_bonus : String?
        ,approach_attitude4_self_evaluation_points : String?
        ,approach_attitude4_primary_evaluation_points : String?
        ,approach_attitude4_secondary_evaluation_points : String?
        ,approach_attitude4_depart_adjust_points : String?
        ,primary_secondary_evaluation_flg : String?
        ,evaluation_update_flg  : String?
        ,depart_adjust_id  : String?
        ,retire_flg : Boolean?
        ,appraisal_authority : String?
        ,system_create_authority : String?
        ,birthday : String?
        ,company_entry_date : String?
        ,delete_category : String?
        ,primary_evaluation_authority : String?
        ,secondary_evaluation_authority : String?
        ,service_period_year : String?
        ,service_period_month : String?
        ,display_primary_evaluation_name : String?
        ,display_secondary_evaluation_name : String?
        ,display_primary_secondary_evaluation_name : String?
        ,display_depart_adjust_evaluation_name : String?
        ,display_data_status : String?
        ,display_selection_flg : Boolean?
        ,work_flg : Boolean?
    ): super() {
        this.register_datetime = register_datetime
        this.update_datetime = update_datetime
        this.approver_id = approver_id
        this.password1 =  password1
        this.employee_cd = employee_cd
        this.mail_address = mail_address
        this.personal_flg = personal_flg
        this.illegal_address_flg = illegal_address_flg
        this.mobile_domain_flg = mobile_domain_flg
        this.double_flg = double_flg
        this.deliver_err_count = deliver_err_count
        this.user_ip_address = user_ip_address
        this.user_agent = user_agent
        this.update_delete_key = update_delete_key
        this.belong_cd = belong_cd
        this.belong1 = belong1
        this.admin_flg =  admin_flg
        this.job_cd = job_cd
        this.officer = officer
        this.grade1 = grade1
        this.name1 = name1
        this.personal_appraisal_name = personal_appraisal_name
        this.evaluation_status = evaluation_status
        this.self_evaluation_id = self_evaluation_id
        this.primary_evaluation_id = primary_evaluation_id
        this.secondary_evaluation_id = secondary_evaluation_id
        this.primary_secondary_evaluation_id = primary_secondary_evaluation_id
        this.self_evaluation_flg = self_evaluation_flg
        this.self_evaluation_rank = self_evaluation_rank
        this.self_evaluation_total_score = self_evaluation_total_score
        this.self_evaluation_rank_bonus = self_evaluation_rank_bonus
        this.self_evaluation_total_score_bonus = self_evaluation_total_score_bonus
        this.primary_evaluation_rank = primary_evaluation_rank
        this.primary_evaluation_total_score = primary_evaluation_total_score
        this.primary_evaluation_rank_bonus = primary_evaluation_rank_bonus
        this.primary_evaluation_total_score_bonus = primary_evaluation_total_score_bonus
        this.primary_evaluator_entry_field = primary_evaluator_entry_field
        this.primary_evaluator_entry_date = primary_evaluator_entry_date
        this.secondary_evaluation_rank = secondary_evaluation_rank
        this.secondary_evaluation_total_score = secondary_evaluation_total_score
        this.secondary_evaluation_rank_bonus = secondary_evaluation_rank_bonus
        this.secondary_evaluation_total_score_bonus = secondary_evaluation_total_score_bonus
        this.secondary_evaluator_entry_field = secondary_evaluator_entry_field
        this.secondary_evaluator_entry_date = secondary_evaluator_entry_date
        this.depart_adjust_rank = depart_adjust_rank
        this.depart_adjust_total_score = depart_adjust_total_score
        this.depart_adjust_rank_bonus = depart_adjust_rank_bonus
        this.depart_adjust_total_score_bonus = depart_adjust_total_score_bonus
        this.grade1_item = grade1_item
        this.grade1_evaluation_points = grade1_evaluation_points
        this.grade1_weight_salary_increase = grade1_weight_salary_increase
        this.grade1_weight_bonus = grade1_weight_bonus
        this.grade1_self_evaluation_points = grade1_self_evaluation_points
        this.grade1_primary_evaluation_points = grade1_primary_evaluation_points
        this.grade1_secondary_evaluation_points = grade1_secondary_evaluation_points
        this.grade1_depart_adjust_points = grade1_depart_adjust_points
        this.grade2_item = grade2_item
        this.grade2_evaluation_points = grade2_evaluation_points
        this.grade2_weight_salary_increase = grade2_weight_salary_increase
        this.grade2_weight_bonus = grade2_weight_bonus
        this.grade2_self_evaluation_points = grade2_self_evaluation_points
        this.grade2_primary_evaluation_points = grade2_primary_evaluation_points
        this.grade2_secondary_evaluation_points = grade2_secondary_evaluation_points
        this.grade2_depart_adjust_points = grade2_depart_adjust_points
        this.grade3_item = grade3_item
        this.grade3_evaluation_points = grade3_evaluation_points
        this.grade3_weight_salary_increase = grade3_weight_salary_increase
        this.grade3_weight_bonus = grade3_weight_bonus
        this.grade3_self_evaluation_points = grade3_self_evaluation_points
        this.grade3_primary_evaluation_points = grade3_primary_evaluation_points
        this.grade3_secondary_evaluation_points = grade3_secondary_evaluation_points
        this.grade3_depart_adjust_points = grade3_depart_adjust_points
        this.grade4_item = grade4_item
        this.grade4_evaluation_points = grade4_evaluation_points
        this.grade4_weight_salary_increase = grade4_weight_salary_increase
        this.grade4_weight_bonus = grade4_weight_bonus
        this.grade4_self_evaluation_points = grade4_self_evaluation_points
        this.grade4_primary_evaluation_points = grade4_primary_evaluation_points
        this.grade4_secondary_evaluation_points = grade4_secondary_evaluation_points
        this.grade4_depart_adjust_points = grade4_depart_adjust_points
        this.grade5_item = grade5_item
        this.grade5_evaluation_points = grade5_evaluation_points
        this.grade5_weight_salary_increase = grade5_weight_salary_increase
        this.grade5_weight_bonus = grade5_weight_bonus
        this.grade5_self_evaluation_points = grade5_self_evaluation_points
        this.grade5_primary_evaluation_points = grade5_primary_evaluation_points
        this.grade5_secondary_evaluation_points = grade5_secondary_evaluation_points
        this.grade5_depart_adjust_points = grade5_depart_adjust_points
        this.ability1_item = ability1_item
        this.ability1_evaluation_points = ability1_evaluation_points
        this.ability1_weight_salary_increase = ability1_weight_salary_increase
        this.ability1_weight_bonus = ability1_weight_bonus
        this.ability1_self_evaluation_points = ability1_self_evaluation_points
        this.ability1_primary_evaluation_points = ability1_primary_evaluation_points
        this.ability1_secondary_evaluation_points = ability1_secondary_evaluation_points
        this.ability1_depart_adjust_points = ability1_depart_adjust_points
        this.ability2_item = ability2_item
        this.ability2_evaluation_points = ability2_evaluation_points
        this.ability2_weight_salary_increase = ability2_weight_salary_increase
        this.ability2_weight_bonus = ability2_weight_bonus
        this.ability2_self_evaluation_points = ability2_self_evaluation_points
        this.ability2_primary_evaluation_points = ability2_primary_evaluation_points
        this.ability2_secondary_evaluation_points = ability2_secondary_evaluation_points
        this.ability2_depart_adjust_points = ability2_depart_adjust_points
        this.ability3_item = ability3_item
        this.ability3_evaluation_points = ability3_evaluation_points
        this.ability3_weight_salary_increase = ability3_weight_salary_increase
        this.ability3_weight_bonus = ability3_weight_bonus
        this.ability3_self_evaluation_points = ability3_self_evaluation_points
        this.ability3_primary_evaluation_points = ability3_primary_evaluation_points
        this.ability3_secondary_evaluation_points = ability3_secondary_evaluation_points
        this.ability3_depart_adjust_points = ability3_depart_adjust_points
        this.ability4_item = ability4_item
        this.ability4_evaluation_points = ability4_evaluation_points
        this.ability4_weight_salary_increase = ability4_weight_salary_increase
        this.ability4_weight_bonus = ability4_weight_bonus
        this.ability4_self_evaluation_points = ability4_self_evaluation_points
        this.ability4_primary_evaluation_points = ability4_primary_evaluation_points
        this.ability4_secondary_evaluation_points = ability4_secondary_evaluation_points
        this.ability4_depart_adjust_points = ability4_depart_adjust_points
        this.approach_attitude1_item =  approach_attitude1_item
        this.approach_attitude1_evaluation_points = approach_attitude1_evaluation_points
        this.approach_attitude1_weight_salary_increase = approach_attitude1_weight_salary_increase
        this.approach_attitude1_weight_bonus = approach_attitude1_weight_bonus
        this.approach_attitude1_self_evaluation_points = approach_attitude1_self_evaluation_points
        this.approach_attitude1_primary_evaluation_points = approach_attitude1_primary_evaluation_points
        this.approach_attitude1_secondary_evaluation_points = approach_attitude1_secondary_evaluation_points
        this.approach_attitude1_depart_adjust_points = approach_attitude1_depart_adjust_points
        this.approach_attitude2_item = approach_attitude2_item
        this.approach_attitude2_evaluation_points = approach_attitude2_evaluation_points
        this.approach_attitude2_weight_salary_increase = approach_attitude2_weight_salary_increase
        this.approach_attitude2_weight_bonus = approach_attitude2_weight_bonus
        this.approach_attitude2_self_evaluation_points = approach_attitude2_self_evaluation_points
        this.approach_attitude2_primary_evaluation_points = approach_attitude2_primary_evaluation_points
        this.approach_attitude2_secondary_evaluation_points = approach_attitude2_secondary_evaluation_points
        this.approach_attitude2_depart_adjust_points = approach_attitude2_depart_adjust_points
        this.approach_attitude3_item = approach_attitude3_item
        this.approach_attitude3_evaluation_points = approach_attitude3_evaluation_points
        this.approach_attitude3_weight_salary_increase = approach_attitude3_weight_salary_increase
        this.approach_attitude3_weight_bonus = approach_attitude3_weight_bonus
        this.approach_attitude3_self_evaluation_points = approach_attitude3_self_evaluation_points
        this.approach_attitude3_primary_evaluation_points = approach_attitude3_primary_evaluation_points
        this.approach_attitude3_secondary_evaluation_points = approach_attitude3_secondary_evaluation_points
        this.approach_attitude3_depart_adjust_points = approach_attitude3_depart_adjust_points
        this.approach_attitude4_item = approach_attitude4_item
        this.approach_attitude4_evaluation_points = approach_attitude4_evaluation_points
        this.approach_attitude4_weight_salary_increase = approach_attitude4_weight_salary_increase
        this.approach_attitude4_weight_bonus = approach_attitude4_weight_bonus
        this.approach_attitude4_self_evaluation_points = approach_attitude4_self_evaluation_points
        this.approach_attitude4_primary_evaluation_points = approach_attitude4_primary_evaluation_points
        this.approach_attitude4_secondary_evaluation_points = approach_attitude4_secondary_evaluation_points
        this.approach_attitude4_depart_adjust_points = approach_attitude4_depart_adjust_points
        this.primary_secondary_evaluation_flg = primary_secondary_evaluation_flg
        this.depart_adjust_id  = depart_adjust_id
        this.retire_flg = retire_flg
        this.appraisal_authority = appraisal_authority
        this.system_create_authority = system_create_authority
        this.birthday = birthday
        this.company_entry_date = company_entry_date
        this.delete_category = delete_category
        this.primary_evaluation_authority = primary_evaluation_authority
        this.secondary_evaluation_authority = secondary_evaluation_authority
        this.service_period_year = service_period_year
        this.service_period_month = service_period_month
        this.display_primary_evaluation_name = display_primary_evaluation_name
        this.display_secondary_evaluation_name = display_secondary_evaluation_name
        this.display_primary_secondary_evaluation_name = display_primary_secondary_evaluation_name
        this.display_depart_adjust_evaluation_name = display_depart_adjust_evaluation_name
        this.display_data_status = display_data_status
        this.display_selection_flg = display_selection_flg
        this.work_flg = work_flg

    }
}