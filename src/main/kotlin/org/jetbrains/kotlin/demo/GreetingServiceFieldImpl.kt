package org.jetbrains.kotlin.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("field")
class GreetingServiceFieldImpl:GreetingService {

    @Autowired
    private lateinit var salutationService :SalutationService

    override fun greet(message: String): String {
        return salutationService.getSalutation() +" " + message + salutationService.getExclamation()
    }

}