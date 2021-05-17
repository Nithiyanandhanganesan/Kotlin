package com.example.springkotlindemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController{

    @Autowired
    lateinit  var sampleService:SampleService

    //Call from browser like this
    //http://localhost:8080/firstapi?num=1
    @RequestMapping("/firstapi")
    @ResponseBody
    fun sample(@RequestParam num:Int) : String {
        var user:String = sampleService.sampleservicefunc(num)
        return user
    }
}