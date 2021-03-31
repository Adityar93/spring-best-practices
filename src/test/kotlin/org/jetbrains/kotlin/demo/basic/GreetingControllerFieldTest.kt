package org.jetbrains.kotlin.demo.basic

import org.jetbrains.kotlin.demo.*
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
class GreetingControllerFieldTest {

    @Spy
    private var greetingService: GreetingService = GreetingServiceBasicImpl()

    @InjectMocks
    private lateinit var greetingControllerField: GreetingControllerField


    @Test
    fun `test`(){
        val a = greetingControllerField.greeting("abc")

        //Does this assert?
        Assert.assertEquals("Hello abc",a.content)
    }

    @Test
    fun `test 2`(){
        greetingControllerField = GreetingControllerField()
        val a = greetingControllerField.greeting("abc")

        //Does this assert?
        Assert.assertEquals("Hello abc",a.content)
    }


}