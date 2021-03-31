package org.jetbrains.kotlin.demo

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Spy
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
class GreetingControllerFieldTest {

    @Spy
    private var salutationService: SalutationService = SalutationServiceImpl()

    @Spy
    @InjectMocks
    private var greetingService: GreetingService = GreetingServiceFieldImpl()

    @InjectMocks
    private lateinit var greetingControllerField: GreetingControllerField

    @Test
    fun `test`(){
        val a = greetingControllerField.greeting("abc")
        //Does this assert?
        Assert.assertEquals(a.content,"Hello abc!")

    }


}