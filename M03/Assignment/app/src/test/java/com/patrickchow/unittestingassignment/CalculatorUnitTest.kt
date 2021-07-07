package com.patrickchow.unittestingassignment

import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class CalculatorUnitTest {

    private val math = mock(Math::class.java)
    private val calculator = Calculator(math)

    @Test
    fun sumSquareTest(){
        val number1 = 2L
        val number2 = 2L
        val expected = 4L

        `when` (math.sumOfSquares(number1, number2)).thenReturn(expected)

        val sum = calculator.factorial(number1, number2)

        assertEquals(expected, sum)
    }

    @Test
    fun deferenceCheck(){
        val number1 = 3L
        val number2 = -2L
        val expected = 1L
        `when` (math.absoluteDifference(number1, number2)).thenReturn(expected)
        val absoluteValue = calculator.difference(number2, number1)
        assertEquals(expected, absoluteValue)
    }
}