package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.model.Grade
import com.example.jinjiKoukaSystem.respository.GradeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GradeServiceImpl :GradeService {

@Autowired
    private val ListRepo: GradeRepository? = null

    fun patternSearch(): List<Grade?>? {
        return ListRepo?.appraisalPattern()
    }

    override fun saveGrade(grade: Grade?): Grade? {
        val updateGrade = Grade(grade?.appraisal_pattern,grade?.officer,grade?.grade,
            grade?.grade1_item,grade?.grade1_evaluation_points,grade?.grade1_weight_salary_increase,grade?.grade1_weight_bonus,
            grade?.grade2_item,grade?.grade2_evaluation_points,grade?.grade2_weight_salary_increase,grade?.grade2_weight_bonus,
            grade?.grade3_item,grade?.grade3_evaluation_points,grade?.grade3_weight_salary_increase,grade?.grade3_weight_bonus,
            grade?.grade4_item,grade?.grade4_evaluation_points,grade?.grade4_weight_salary_increase,grade?.grade4_weight_bonus,
            grade?.grade5_item,grade?.grade5_evaluation_points,grade?.grade5_weight_salary_increase,grade?.grade5_weight_bonus,
            grade?.ability1_item,grade?.ability1_evaluation_points,grade?.ability1_weight_salary_increase,grade?.ability1_weight_bonus,
            grade?.ability2_item,grade?.ability2_evaluation_points,grade?.ability2_weight_salary_increase,grade?.ability2_weight_bonus,
            grade?.ability3_item,grade?.ability3_evaluation_points,grade?.ability3_weight_salary_increase,grade?.ability3_weight_bonus,
            grade?.ability4_item,grade?.ability4_evaluation_points,grade?.ability4_weight_salary_increase,grade?.ability4_weight_bonus,
            grade?.approach_attitude1_item,grade?.approach_attitude1_evaluation_points,grade?.approach_attitude1_weight_salary_increase,grade?.approach_attitude1_weight_bonus,
            grade?.approach_attitude2_item,grade?.approach_attitude2_evaluation_points,grade?.approach_attitude2_weight_salary_increase,grade?.approach_attitude2_weight_bonus,
            grade?.approach_attitude3_item,grade?.approach_attitude3_evaluation_points,grade?.approach_attitude3_weight_salary_increase,grade?.approach_attitude3_weight_bonus,
            grade?.approach_attitude4_item,grade?.approach_attitude4_evaluation_points,grade?.approach_attitude4_weight_salary_increase,grade?.approach_attitude4_weight_bonus);
        return this.ListRepo?.save(updateGrade)
    }
}