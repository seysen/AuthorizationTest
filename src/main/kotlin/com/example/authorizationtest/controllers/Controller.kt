package com.example.authorizationtest.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    @GetMapping("/private")
    fun getContent() = "Private content"

    @GetMapping("/public")
    fun login() = "Public content"
}