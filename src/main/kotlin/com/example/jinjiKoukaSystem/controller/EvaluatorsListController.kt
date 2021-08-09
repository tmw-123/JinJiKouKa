package com.example.jinjiKoukaSystem.controller

import com.example.jinjiKoukaSystem.model.Evaluator
import com.example.jinjiKoukaSystem.model.EvaluatorForm
import com.example.jinjiKoukaSystem.repository.EvaluatorListRepo
import com.example.jinjiKoukaSystem.repository.EvaluatorRegisterRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*


@Controller
class EvaluatorsListController {

    @Autowired
    lateinit var evaluatorRepo: EvaluatorListRepo

    @Autowired
    private val reposity: EvaluatorRegisterRepo? = null

/*    @RequestMapping("/evaluatorList",method = [RequestMethod.GET])
    fun evaluator(model: Model): String {
        val empNumber: List<Evaluator> = evaluatorRepo.empCd() as List<Evaluator>
        val evaluator: List<Evaluator> = evaluatorRepo.evaluatorList() as List<Evaluator>
        model.addAttribute("empList", empNumber)
        model.addAttribute("evaluator", evaluator)
        return "EvaluatorsList"
    }*/

@RequestMapping("/register1",method = [RequestMethod.GET])
fun register(@Param("empCd") empCd: String, model: Model) : String {

    val editNumber: Evaluator = evaluatorRepo.approveID(empCd) as Evaluator
    model.addAttribute("editNumber", editNumber)
    return "EvaluatorRegister"
}
    @RequestMapping("/Register/{empCd}",method = [RequestMethod.GET])
    fun update(@PathVariable("empCd") empCd: String, model: Model) : String {
        val editNumber: Evaluator = evaluatorRepo.approveID(empCd) as Evaluator
//    val emp: Evaluator = evaluatorRepo.empID(empCd) as Evaluator
//        for (Evaluator in editNumber) {
//            model.addAttribute("editNumber", editNumber)
//        }
        model.addAttribute("editNumber", editNumber)

        return "EvaluatorRegister"
    }

    @RequestMapping("/evaluatorRegister",method = [RequestMethod.POST])
    fun greetingSubmit(model: Model,@ModelAttribute user: EvaluatorForm): String? {

        val newUser = EvaluatorForm(user.id,user.empCd,user.appraisalType,user.grade,user.name,user.positionName,user.registerDatetime)

        reposity?.save(newUser)
        return "EvaluatorsList"
    }

}