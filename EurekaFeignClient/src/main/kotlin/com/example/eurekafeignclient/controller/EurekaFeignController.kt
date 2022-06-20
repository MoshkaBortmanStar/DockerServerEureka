package com.example.eurekafeignclient.controller

import com.example.eurekafeignclient.feignClient.GreetingClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class EurekaFeignController {

    @Autowired
    private lateinit var greetingClient: GreetingClient

    @RequestMapping("/get-greeting")
    fun greeting(model: Model): String? {
        model.addAttribute("greeting", greetingClient.greeting())
        return "greeting-view"
    }

}