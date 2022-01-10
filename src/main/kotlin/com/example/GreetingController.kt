package com.example

import io.micronaut.context.annotation.Value
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller
class GreetingController(
    @Value("\${app.greeting}") private val greeting: String,
) {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun greet() = greeting
}