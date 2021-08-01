package com.example.jinjiKoukaSystem.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader

@Controller
class UserMasterController {

    @RequestMapping("/userInfoUpload")
    fun userInfo(model: Model): String {
        return "userInfoUpload"
    }

    @RequestMapping("/fileChoose")
    fun uploadFilePath(model: Model): String {
        try{
            val file = File("C:\\Users\\Hsu_Yee_Hnin\\Desktop\\人事考課\\CSV.txt")
            val filereader = FileReader(file)
            var rd: Int = filereader.read()
            while (rd != -1) {
                print(rd.toChar())
                rd = filereader.read()
            }
        }catch (e: FileNotFoundException){
            println(e)
        }
        return "userInfoUpload"
    }
}