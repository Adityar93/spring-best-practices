package org.jetbrains.kotlin.demo

import org.springframework.stereotype.Service

@Service
class SalutationServiceImpl : SalutationService {
    override fun getSalutation(): String {
        return "Hello"
    }

    override fun getExclamation(): String {
        return "!"
    }


}