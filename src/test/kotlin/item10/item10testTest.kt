package item10

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout

internal class item10testTest{

    val testclass : item10test = item10test()



    @Test
    @DisplayName("fib(5)")
    fun test() {
        assertEquals(5, testclass.fib(5))
    }

    @Test
    @DisplayName("fib(6)")
    fun test2() {
        assertEquals(8, testclass.fib(6))
    }

    @Test
    @Timeout(1)
    fun test3() {
        // time out, so fail
        assertEquals(1134903170,testclass.fib(45))
    }
}