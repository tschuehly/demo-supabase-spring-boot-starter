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

    @GetMapping("/admin")
    fun admin(): String {
        return "admin"
    }

    @GetMapping("/error")
    fun unauthorized(): String {
        return "/403"
    }

    @GetMapping("/updatePassword")
    fun updatePassword(): String {
        return "updatePassword"
    }

    @GetMapping("/resetPassword")
    fun resetPassword(): String {
        return "resetPassword"
    }
}
