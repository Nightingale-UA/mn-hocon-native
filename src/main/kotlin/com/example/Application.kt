package com.example

import io.micronaut.kotlin.runtime.startApplication

class Application

fun main(args: Array<String>) {
    startApplication<Application>(*args)
}