package start_dataprocessing

import kotlin.math.sqrt

fun main() {
    val numerator = 10
    val denominator = 0
    try {
        val result = (numerator / denominator)
        println("Value division: $result")
    } catch (e: ArithmeticException) {
        println("There's no division by zero.")
        println("Type error: $e")
    }
    println()
    println()
    val number = -4.0
    try {
        val result2 = sqrt(number)
        if (number < 0) throw IllegalArgumentException()
        println("Result is: $result2")
    } catch (e: IllegalArgumentException) {
        println("There's no real root of negative numbers.")
        println("Type error: $e")
    }
}