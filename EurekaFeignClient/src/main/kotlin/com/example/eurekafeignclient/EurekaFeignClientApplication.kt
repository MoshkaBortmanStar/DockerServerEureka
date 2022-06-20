package com.example.eurekafeignclient

import com.example.eurekafeignclient.feignClient.GreetingClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@EnableFeignClients
@SpringBootApplication
class EurekaFeignClientApplication

fun main(args: Array<String>) {
    runApplication<EurekaFeignClientApplication>(*args)
}
