package com.example.demosupabase.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {
    @GetMapping
    fun index() = "index"

    @GetMapping("/account")
    fun manager(): String {
        return "account"
    }

    @GetMapping("/admin")
    fun admin(): String {
        return "admin"
    }

    @GetMapping("/unauthenticated")
    fun unauthenticated(): String {
        return "/unauthenticated"
    }
    @GetMapping("/unauthorized")
    fun unauthorized(): String {
        return "/unauthorized"
    }

    @GetMapping("/updatePassword")
    fun updatePassword(): String {
        return "updatePassword"
    }

    @GetMapping("/requestPasswordReset")
    fun requestPasswordReset(): String {
        return "requestPasswordReset"
    }
}
