package org.jetbrains.kotlin.demo

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito


class GreetingControllerConstructorTest {

    private lateinit var salutationService: SalutationService

    private lateinit var greetingService: GreetingService

    private lateinit var greetingControllerConstructor: GreetingControllerConstructor

    @Before
    fun before(){
        salutationService = Mockito.mock(SalutationService::class.java)
        greetingService = GreetingServiceConstructorImpl(salutationService)
        greetingControllerConstructor = GreetingControllerConstructor(greetingService)
    }

    @Test
    fun `Stub out getSalutation`(){
        Mockito.`when`(salutationService.getSalutation()).thenReturn("Hey")
        Mockito.doReturn("Hey").`when`(salutationService).getSalutation()
        val a = greetingControllerConstructor.greeting("abc")
        Assert.assertEquals("Hey abc!",a.content)

    }

    @Test
    fun `Spy and don't stub anything`(){
        salutationService = Mockito.spy(SalutationServiceImpl::class.java)
        greetingService = GreetingServiceConstructorImpl(salutationService)
        greetingControllerConstructor = GreetingControllerConstructor(greetingService)

        val a = greetingControllerConstructor.greeting("abc")
        Assert.assertEquals("Hello abc!",a.content)

    }

    @Test
    fun `test 2`(){
        salutationService = Mockito.spy(SalutationServiceImpl::class.java)
        greetingService = GreetingServiceConstructorImpl(salutationService)
        greetingControllerConstructor = GreetingControllerConstructor(greetingService)

        Mockito.`when`(salutationService.getSalutation()).thenReturn("Hey")
        Mockito.doReturn("Hey").`when`(salutationService).getSalutation()
        val a = greetingControllerConstructor.greeting("abc")
        Assert.assertEquals("Hey abc!",a.content)

    }




}