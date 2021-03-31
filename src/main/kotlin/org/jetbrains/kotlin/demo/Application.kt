package org.jetbrains.kotlin.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    val application = SpringApplicationBuilder()
            .sources(Application::class.java)
    application.run(*args)
}