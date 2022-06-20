package com.bortmanincorparatet.eurekaclient

import com.bortmanincorparatet.eurekaclient.`interface`.GreetingController
import com.netflix.discovery.EurekaClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class EurekaClientApplication


fun main(args: Array<String>) {
    runApplication<EurekaClientApplication>(*args)

}
