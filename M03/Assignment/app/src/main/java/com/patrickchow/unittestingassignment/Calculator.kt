package com.patrickchow.unittestingassignment

import kotlin.math.absoluteValue

class Math (){
    fun sumOfSquares(number1: Long, number2: Long): Long{
        return ((number1 * number1) + (number2 * number2))
    }

    fun absoluteDifference(number1: Long, number2: Long): Long{
        val different = number1 - number2
        return different.absoluteValue
    }
}

class Calculator(val math: Math){
    fun factorial(number1: Long, number2: Long): Long{
        return math.sumOfSquares(number1, number2)
    }

    fun difference(number1: Long, number2: Long): Long{
        return math.absoluteDifference(number1, number2)
    }
}