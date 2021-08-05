package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.model.Grade
import com.example.jinjiKoukaSystem.repository.GradeRepository
import com.example.jinjiKoukaSystem.service.GradeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.security.Principal


@Controller
class GradeRegistrationController {

    @Autowired
    private val gradeRepository: GradeRepository? = null

    @Autowired
    private val gradeService: GradeService? = null

    /*save all grade data in table*/
    @RequestMapping("/saveGradeRegistration")
    fun saveGradeRegistration(model: Model, @ModelAttribute grade: Grade): String? {
        var gradeId: String?
        if(gradeRepository?.selectLastRecordGradeId()==null){
            gradeId = "1"
        }else {
            gradeId = gradeRepository?.selectLastRecordGradeId();
            gradeId = (Integer.parseInt(gradeId) + 1).toString()
        }
        val newGradeReg = Grade(gradeId,grade.appraisal_pattern,grade.officer,grade.grade,
            grade.grade1_item,grade.grade1_evaluation_points,grade.grade1_weight_salary_increase,grade.grade1_weight_bonus,
            grade.grade2_item,grade.grade2_evaluation_points,grade.grade2_weight_salary_increase,grade.grade2_weight_bonus,
            grade.grade3_item,grade.grade3_evaluation_points,grade.grade3_weight_salary_increase,grade.grade3_weight_bonus,
            grade.grade4_item,grade.grade4_evaluation_points,grade.grade4_weight_salary_increase,grade.grade4_weight_bonus,
            grade.grade5_item,grade.grade5_evaluation_points,grade.grade5_weight_salary_increase,grade.grade5_weight_bonus,
            grade.ability1_item,grade.ability1_evaluation_points,grade.ability1_weight_salary_increase,grade.ability1_weight_bonus,
            grade.ability2_item,grade.ability2_evaluation_points,grade.ability2_weight_salary_increase,grade.ability2_weight_bonus,
            grade.ability3_item,grade.ability3_evaluation_points,grade.ability3_weight_salary_increase,grade.ability3_weight_bonus,
            grade.ability4_item,grade.ability4_evaluation_points,grade.ability4_weight_salary_increase,grade.ability4_weight_bonus,
            grade.approach_attitude1_item,grade.approach_attitude1_evaluation_points,grade.approach_attitude1_weight_salary_increase,grade.approach_attitude1_weight_bonus,
            grade.approach_attitude2_item,grade.approach_attitude2_evaluation_points,grade.approach_attitude2_weight_salary_increase,grade.approach_attitude2_weight_bonus,
            grade.approach_attitude3_item,grade.approach_attitude3_evaluation_points,grade.approach_attitude3_weight_salary_increase,grade.approach_attitude3_weight_bonus,
            grade.approach_attitude4_item,grade.approach_attitude4_evaluation_points,grade.approach_attitude4_weight_salary_increase,grade.approach_attitude4_weight_bonus);

        gradeRepository?.save(newGradeReg)
        return "redirect:/gradeRegistration"
    }


    @RequestMapping("/gradeRegEdit/{grade_id}",method = [RequestMethod.GET])
    fun gradeRegEdit(@PathVariable("grade_id") grade_id: String, model: Model) : String {
        val editGrade: Grade = gradeRepository?.gardeNumber(grade_id) as Grade
        model.addAttribute("editGrade", editGrade)
        return "gradeRegEdit"
    }


    @PostMapping("/updateGrade")
    @Throws(Exception::class)
    fun updateGrade(model: Model?,@ModelAttribute("grade") grade: Grade?, principal: Principal?): String?
    { // update edited grades to database
        gradeService?.saveGrade(grade)
        return "redirect:/gradeRegistration"
    }


    @GetMapping("/deleteGrade/{grade_id}")
    fun deleteGrade(@PathVariable(value = "grade_id") grade_id: String): String? {
        // call delete employee method
        this.gradeService?.deleteGradeById(grade_id)
        return "redirect:/gradeRegistration"
    }

}