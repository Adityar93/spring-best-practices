package org.jetbrains.kotlin.demo

import org.springframework.stereotype.Service

@Service("constructor")
class GreetingServiceConstructorImpl(
    private val salutationService: SalutationService
):GreetingService {

    override fun greet(message: String): String {
        return salutationService.getSalutation() +" " + message + salutationService.getExclamation()
    }

}