package org.jetbrains.kotlin.demo.basic

import org.jetbrains.kotlin.demo.*
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito


class GreetingServiceBasicTest {


    private lateinit var greetingService: GreetingService


    @Test
    fun `mock test`(){
        greetingService = Mockito.mock(GreetingService::class.java)

        //Does this Assert?
        Assert.assertEquals("Hello abc",greetingService.greet("abc"))

    }

    @Test
    fun `spy test`(){
        greetingService = Mockito.spy(GreetingService::class.java)

        //Does this Assert?
        Assert.assertEquals("Hello abc",greetingService.greet("abc"))

    }

    @Test
    fun `spy Impl test`(){
        greetingService = Mockito.spy(GreetingServiceBasicImpl::class.java)

        //Does this Assert?
        Assert.assertEquals("Hello abc",greetingService.greet("abc"))

    }





}