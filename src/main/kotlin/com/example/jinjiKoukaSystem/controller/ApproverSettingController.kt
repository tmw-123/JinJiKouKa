package com.example.jinjiKoukaSystem.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader

@Controller
class ApproverSettingController {

    @RequestMapping("/approveSetting")
    fun approveSetting(model: Model): String {
        return "approverSetting"
    }
}