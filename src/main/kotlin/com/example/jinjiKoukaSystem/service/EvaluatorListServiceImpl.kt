package com.example.jinjiKoukaSystem.service


import com.example.jinjiKoukaSystem.model.EvaluatorForm
import com.example.jinjiKoukaSystem.repository.EvaluatorRegisterRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class EvaluatorListServiceImpl: EvaluatorListService {
//    @Autowired(required = true)
//    private var evaluatorRepo: EvaluatorRegisterRepo? = null
    @Autowired
    lateinit var evaluatorRepo: EvaluatorRegisterRepo

    override fun saveEvaluatorForm(pj: EvaluatorForm?): EvaluatorForm? {
//        val updatePj = EvaluatorRegister(pj?.id,pj?.employee_cd,pj?.approver1_id,pj?.approver1_officer,pj?.approver1_grade,pj?.approver1_name)
        val updatePj = EvaluatorForm(pj?.id,pj?.empCd,pj?.appraisalType,pj?.grade,pj?.name,pj?.positionName,pj?.registerDatetime)
        return this.evaluatorRepo.save(updatePj)
    }
//     fun empNumber(): List<Evaluator?>? {
//
//        return evaluatorRepo?.empCd()
//
//    }

}


