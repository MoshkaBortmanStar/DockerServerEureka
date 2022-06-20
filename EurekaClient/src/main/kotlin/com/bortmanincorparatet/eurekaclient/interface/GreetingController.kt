package com.bortmanincorparatet.eurekaclient.`interface`

import org.springframework.web.bind.annotation.GetMapping

interface GreetingController {

    @GetMapping("/greeting")
    fun greeting(): String

}