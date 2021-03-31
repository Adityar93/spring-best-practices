package org.jetbrains.kotlin.demo

import org.springframework.stereotype.Service

@Service("basic")
class GreetingServiceBasicImpl :GreetingService {
    override fun greet(message: String): String {
        return "Hello $message"
    }

}