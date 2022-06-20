package com.bortmanincorparatet.eurekaclient.controller

import com.bortmanincorparatet.eurekaclient.`interface`.GreetingController
import com.netflix.discovery.EurekaClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RestController
import java.util.GregorianCalendar

@RestController
class EurekaClientController : GreetingController {

    @Autowired
    lateinit var eurekaClient: EurekaClient

    @Value("\${spring.application.name}")
    private val appName: String = ""


    override fun greeting(): String {
        return "Hello from ${eurekaClient.getApplication(appName).name}!"
    }

}