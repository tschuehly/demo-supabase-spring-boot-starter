package com.example.demosupabase

import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {
    @GetMapping
    fun index() = "index"

    @GetMapping("/account")
    fun manager(): String {

        println(SecurityContextHolder.getContext().authentication)
        return "account"
    }

    @GetMapping("/error")
    fun unauthorized(): String{
        return "/403"
    }
}
