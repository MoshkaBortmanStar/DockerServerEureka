package com.example.eurekafeignclient.feignClient

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "spring-cloud-eureka-client")
interface GreetingClient {

    @GetMapping("/greeting")
    fun greeting(): String

}