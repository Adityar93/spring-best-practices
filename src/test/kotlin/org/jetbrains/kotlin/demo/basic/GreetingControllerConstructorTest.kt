package org.jetbrains.kotlin.demo.basic

import org.jetbrains.kotlin.demo.*
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito


class GreetingControllerConstructorTest {


    private lateinit var greetingService: GreetingService

    private lateinit var greetingControllerConstructor: GreetingControllerConstructor

    @Before
    fun before(){
        greetingService = Mockito.mock(GreetingServiceBasicImpl::class.java)
        greetingControllerConstructor = GreetingControllerConstructor(greetingService)
    }

    @Test
    fun `test`(){
        val a = greetingControllerConstructor.greeting("abc")
        Assert.assertEquals("Hello abc",a.content)

    }





}